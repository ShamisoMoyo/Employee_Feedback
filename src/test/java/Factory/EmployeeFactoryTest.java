package Factory;


import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EmployeeFactoryTest {
    @Test
    public void test() {
        Employee employee = EmployeeFactory.createEmployee("Belinda","Sydney","3000");
        System.out.println(employee.toString());
        assertNotNull(employee);
    }
}