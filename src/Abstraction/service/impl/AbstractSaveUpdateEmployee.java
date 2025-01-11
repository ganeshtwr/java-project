package Abstraction.service.impl;

import Abstraction.models.Employee;
import Abstraction.service.EmployeeService;

public abstract class AbstractSaveUpdateEmployee implements EmployeeService {


    /**
     * Perform common save or update operations here
     * Write the common code here for the common code
     * @param employee
     */

    @Override
    public void saveOrUpdateEmployee(Employee employee) {
        System.out.println("Employee "+callName()+" successfully !!! ");
    }

}
