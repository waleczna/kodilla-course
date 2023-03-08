package com.kodilla.patterns2.aop.calculator;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Aspect
@Component
public class Watcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(Watcher.class);

    @Before("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))" +
            "&& args(theNumber) && target(object)")
    public void logEvent(BigDecimal theNumber, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + ", Args: " + theNumber);
    }

    @Around("execution(* com.kodilla.patterns2.aop.calculator.Calculator.factorial(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis(); // [1] pomiar czasu
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis(); // [2] pomiar czasu
            LOGGER.info("Time consumed " + (end - begin) + "[ms]"); // [3] zapis do logu info o roznicy pomiarow, czyli czasu wykonywania samej przechwyconej metody
        } catch (Throwable throwable) {
            LOGGER.error(throwable.getMessage()); // [4] motoda proceed() moze rzucac wyjatki, dlatego zapisujemy do logow info o ewtl bledzie
            throw throwable;
        }
        return result;
    }
}