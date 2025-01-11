package Abstraction.service.impl;

import Abstraction.models.Employee;

public class UpdateEmployeeEvent extends AbstractSaveUpdateEmployee {

    /**
     * Call abstract method for common operations
     * Instead of writing duplicate code here and save call moved that common code into single place
     * @param employee
     */
    public void updateEmployee(Employee employee){
        saveOrUpdateEmployee(employee);
    }

    /**
     * You can define the different values for both the operations separately
     * Here we have used the "updated" value for the update call
     * @return
     */
    @Override
    public String callName() {
        return "updated";
    }
}
