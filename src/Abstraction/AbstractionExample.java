package Abstraction;

import Abstraction.models.Employee;
import Abstraction.service.impl.SaveEmployeeEvent;
import Abstraction.service.impl.UpdateEmployeeEvent;

public class AbstractionExample {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setName("Ganesh");

        // Save call
        SaveEmployeeEvent saveEmployeeEvent = new SaveEmployeeEvent();
        saveEmployeeEvent.saveEmployee(employee);

        // Update call
        employee.setName("Kartik");
        UpdateEmployeeEvent updateEmployeeEvent = new UpdateEmployeeEvent();
        updateEmployeeEvent.updateEmployee(employee);

    }
}
