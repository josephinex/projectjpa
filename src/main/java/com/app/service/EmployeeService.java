package com.app.service;

import com.app.config.JpaConfig;
import com.app.dao.EmployeeDao;
import com.app.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class EmployeeService {

    //@PersistenceContext(unitName = "employee")
    private EntityManager em = new JpaConfig().createEntityManager();

    private EmployeeDao employeeDao = new EmployeeDao(em);

    public void saveEmployee(Long id, String name, int age) {
        Employee employee = new Employee();
        employee.setId(id);
        employee.setName(name);
        employee.setAge(age);

        employeeDao.saveEmployee(employee);
    }

    public void findEmployee(Long id) {
        employeeDao.findEmployee(id);
    }

    public void removeEmployee(Long id) {
        employeeDao.removeEmployee(id);
    }

    public void updateEmployee(Long id, int age) {
        employeeDao.changeEmployeeAge(id, age);
    }
}
