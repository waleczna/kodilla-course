package com.kodilla.hibernate.manytomany;

import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyFacade {
    private final CompanyDao companyDao;
    private final EmployeeDao employeeDao;

    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Employee> findEmployees(String name) {
        return employeeDao.retrieveLastNameEmployees(name);
    }

    public List<Company> findCompanies(String name) {
        return companyDao.findByName(name);
    }
}
