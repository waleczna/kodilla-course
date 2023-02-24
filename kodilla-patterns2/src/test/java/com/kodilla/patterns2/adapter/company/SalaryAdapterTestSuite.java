package com.kodilla.patterns2.adapter.company;

import com.kodilla.patterns2.adapter.company.oldhrsystem.Workers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalaryAdapterTestSuite {

    @Test
    public void testTotalSalary() {
        // Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();
        // When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());
        // Then
        System.out.println(totalSalary);
        assertEquals(totalSalary, 27750, 0);
    }
    // Tworzymy obiekt przechowujący dane ze starego systemu kadrowo-płacowego
    // oraz obiekt adaptera
    // Właściwy test polega na wywołaniu z adaptera metody totalSalary(...),
    // która wewnętrznie transformuje danego do nowego formatu i wywołuje kalkulator wynagrodzeń z nowego systemu
    // Na końcu weryfikowana jest otrzymana wartość wynikowa na zgodność z wartością oczekiwaną - przy pomocy asercji
}
