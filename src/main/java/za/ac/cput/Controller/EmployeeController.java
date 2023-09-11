package za.ac.cput.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;
import za.ac.cput.service.IEmployeeService;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;


    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee){

        return employeeService.create(employee);
    }

    @GetMapping("/read/{id}")
    public Employee read(@PathVariable String EmployeeId, @PathVariable String id) {
        return employeeService.read(EmployeeId);
    }

    @PostMapping("/update")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable String id) {
        return employeeService.delete(id);
    }


@GetMapping("/getAll")
    public List<Employee> getAll()
{
    return employeeService.getAll();
}



}
