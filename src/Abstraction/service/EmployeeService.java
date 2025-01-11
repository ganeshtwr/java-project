package Abstraction.service;

import Abstraction.models.Employee;

public interface EmployeeService {

    public void saveOrUpdateEmployee(Employee employee);

    public String callName();
}
