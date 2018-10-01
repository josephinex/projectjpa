package com.app.dao;

import com.app.model.Employee;

import javax.persistence.EntityManager;

public class EmployeeDao {

    protected EntityManager em;

    public EmployeeDao(final EntityManager em) {
        this.em = em;
    }

    public void saveEmployee(Employee employee) {
        em.getTransaction().begin();
        em.persist(employee);
        em.getTransaction().commit();
        em.close();
    }

    public Employee findEmployee(Long id) {
        Employee employee = em.find(Employee.class, id);
        em.close();
        return employee;
    }

    public boolean removeEmployee(Long id){
        em.getTransaction().begin();
        Employee employee = findEmployee(id);
        if(employee != null){
            em.remove(employee);
            em.getTransaction().commit();
            em.close();
            return true;
        }
        em.close();
        return false;
    }

    public void changeEmployeeAge(Long id, int age){
        em.getTransaction().begin();
        Employee employee = findEmployee(id);
        if(employee != null){
            employee.setAge(age);
        }
        em.getTransaction().commit();
        em.close();
    }
}
