package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    Employee newEmployee;
    Employee mary;
    @BeforeEach
    void setup() {
       newEmployee = new Employee("jude", "Doe", 100);
       mary = new Employee("Mary", "joe", 400);
    }
    @Test
    public void setMonthlySalary()
    {
        newEmployee.setMonthlySalary(100);

        assertEquals(100,newEmployee.getMonthlySalary());
    }
    @Test
    public void monthlySalaryCannotBeNegative()
    {
        newEmployee.setMonthlySalary(-30);
        assertEquals(100, newEmployee.getMonthlySalary());
    }
    @Test
    public void employeeCanBeCreated()
    {
        assertEquals(2, mary.getFirstName());
    }
    @Test
    public void setNewEmployeeBalance()
    {
        mary.setMonthlySalary(500);
        assertEquals(500, mary.getMonthlySalary());
    }
}