package za.ac.cput.factory;

import za.ac.cput.domain.Employee;
import za.ac.cput.util.Helper;


public class EmployeeFactory {
    public static Employee createEmployee(String firstName, String lastName, String salary) {
        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(salary)) {
            return null;
        }

        String employeeId = Helper.generateID();

        return new Employee.Builder()
                .setEmployeeId(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setSalary(salary)
                .build();

    }


}
