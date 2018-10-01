package com.app.dao.impl;

import com.app.service.EmployeeService;
import org.junit.Test;

public class EmployeeDaoTest {

    private EmployeeService employeeService = new EmployeeService();

    @Test
    public void saveEmployeeTest() {
        employeeService.saveEmployee(2L, "John", 33);
    }

    @Test
    public void findEmployeeTest() {
        employeeService.findEmployee(1L);
    }

    @Test
    public void removeEmployeeTest() {
        employeeService.removeEmployee(2L);
    }

    @Test
    public void updateEmployeeTest() {
        employeeService.updateEmployee(3L, 40);
    }
}
