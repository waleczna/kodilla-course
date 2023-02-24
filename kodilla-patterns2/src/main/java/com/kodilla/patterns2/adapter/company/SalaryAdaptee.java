package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor theProcessor = new CompanySalaryProcessor();
        return theProcessor.calculateSalaries(employees);
    }
    // Klasa ta tworzy w metodzie calculateSalaries(List<Employee> employees) obiekt klasy CompanySalaryProcessor,
    // dostarczanej wraz z nowym systemem kadrowo-płacowym i wywołuje jego metodę
    // calculateSalaries(List<Employee> employees) – jest więc jej "opakowaniem jeden-do-jednego"
}

