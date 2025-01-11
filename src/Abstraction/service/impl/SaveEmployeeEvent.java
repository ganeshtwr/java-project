package Abstraction.service.impl;

import Abstraction.models.Employee;

public class SaveEmployeeEvent extends AbstractSaveUpdateEmployee {

    /**
     * Call abstract method for common operations
     * Instead of writing duplicate code here and update call moved that common code into single place
     * @param employee
     */
    public void saveEmployee(Employee employee){
        saveOrUpdateEmployee(employee);
    }

    /**
     * You can define the different values for both the operations separately
     * Here we have used the "saved" value for the save call
     * @return
     */
    @Override
    public String callName() {
        return "saved";
    }
}
