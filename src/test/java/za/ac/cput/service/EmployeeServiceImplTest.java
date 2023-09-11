package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest

class EmployeeServiceImplTest {
    @Autowired
    private EmployeeServiceImpl service;

    private static  Employee employee = EmployeeFactory.createEmployee("Lisa","Thompson", " 6000");

    @Test
    void a_create() {
        Employee created = service.create(employee);
        assertEquals(employee.getEmployeeId(),created.getEmployeeId());
        System.out.println("created" + created);
    }

    @Test
    void b_read() {
        Employee read = service.read(employee.getEmployeeId());
        assertNotNull(read);
        System.out.println("read" + read);
    }

    @Test
    void c_update() {
        Employee newEmployee = new Employee.Builder().copy(employee).setFirstName("Benny").build();
        Employee updated = service.update(newEmployee);
        assertEquals(newEmployee.getFirstName(), updated.getFirstName());
        System.out.println("Updated: " + updated);
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
        System.out.println("Get All");
        System.out.println(service.getAll());
    }
}