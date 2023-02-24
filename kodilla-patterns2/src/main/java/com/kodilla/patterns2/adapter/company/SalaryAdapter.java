package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.newhrsystem.Employee;
import com.kodilla.patterns2.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator {


    @Override
    public double totalSalary(String[][] workers, double[] salaries) {


        List<Employee> employeeList = new ArrayList<>();
        for (int n = 0; n < salaries.length; n++) {
            employeeList.add(new Employee(
                    workers[n][0],
                    workers[n][1],
                    workers[n][2],
                    new BigDecimal(salaries[n])));
        }
        return calculateSalaries(employeeList).doubleValue();
    }
    // Ta klasa rozszerza klasę SalaryAdaptee (przez dziedziczenie), czyli uzyskuje dostęp do metod klasy SalaryAdaptee jak do własnych
    // implementuje interfejs SalaryCalculator oczekiwany przez stary system, tworzy więc metody, które stary system może wywołać

    // We wnętrzu metody totalSalary(String[][] workers, double[] salaries) (która jest metodą oczekiwaną przez stary system)
    // dane ze starego systemu konwertowane są do formatu oczekiwanego przez nowy system (pętla for)
    // a następnie wywoływana jest metoda calculateSalaries(List<Employee> employees) udostępniana przez odziedziczoną klasę SalaryAdaptee
    // i finalnie żądanie obsługi kierowane jest do nowego systemu kadrowo-płacowego

    // Po otrzymaniu wyników, zamieniane są one z formatu BigDecimal do formatu double (linia z instrukcją return),
    // którego oczekuje stary system kadrowo-płacowy
}


