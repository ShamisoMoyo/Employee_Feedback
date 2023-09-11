package za.ac.cput.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.Objects;
@Entity

public class Employee {
    @Id
    private String employeeId;
    private String firstName;
    private String lastName;
    private String salary;

    protected Employee() {
    }

    private Employee(Builder builder) {
        this.employeeId = builder.employeeId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.salary = builder.salary;
    }


    public String getEmployeeId() {
        return employeeId;
    }



    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeId, employee.employeeId) && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, firstName, lastName, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeId;

        private String firstName;
        private String lastName;
        private String salary;

        public Builder setEmployeeId ( String employeeId){
            this.employeeId = employeeId;
            return this;
        }

        public Builder setFirstName ( String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName ( String lastName){
            this.lastName = lastName;
            return this;
        }
        public Builder setSalary ( String salary){
            this.salary= salary;
            return this;


        }

        public Builder copy (Employee employee) {
            this.employeeId = employee.employeeId;
            this.salary = employee.salary;
            this.firstName = employee.firstName;
            this.lastName = employee.lastName;
            this.salary = employee.salary;
            return this;

        }
        public Employee build() {

            return new Employee( this);
        }
    }

}
