package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employee;
import za.ac.cput.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {


    private  EmployeeRepository repository;

    @Autowired
    private EmployeeServiceImpl(EmployeeRepository repository){
        this.repository = repository;

    }

    @Override
    public Employee create(Employee employee) {
        return this.repository.save(employee);
    }

    @Override
    public Employee read(String employeeId) {
        return this.repository.findById(employeeId).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        if (this.repository.existsById(employee.getEmployeeId())){
            System.out.println("update: true");
            return this.repository.save((employee));
        }
        System.out.println("debug update: false");
            return null;
    }

    @Override
    public boolean delete(String employeeId) {
        if(this.repository.existsById(employeeId)){
            this.repository.deleteById(employeeId);
            return true;
        }
        return false;
    }

    @Override
    public List<Employee> getAll() {
        return this.repository.findAll();
    }
}

