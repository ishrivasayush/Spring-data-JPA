package com.Narainox.SpringdataJpa.Controller;
import com.Narainox.SpringdataJpa.Model.Employee;
import com.Narainox.SpringdataJpa.Services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyController {
    @Autowired
    EmployeeServices employeeServices;

    //Get all the Employees
    @GetMapping("/employee")
    public List<Employee> getAll()
    {
        return employeeServices.getEmployee();
    }

    //Get  Employee By Id
    @GetMapping("/getEmployee/{id}")
    public Optional<Employee> getById(@PathVariable Long id)
    {
        return employeeServices.getEmployeeById(id);
    }


    //Get Employee By email
    @GetMapping("/employee/{email}")
    public Employee getByEmail(@PathVariable String email)
    {
        return employeeServices.findByEmail(email);
    }

    //Register  Employee
    @PostMapping("/registerEmployee")
    public Employee registerEmployee(@RequestBody Employee employee)
    {
        return employeeServices.registerEmployee(employee);
    }

    //Deleting Employee
    @DeleteMapping("/employee/{id}")
    public String delete(@PathVariable Long id)
    {
        employeeServices.deleteEmployee(id);
        return "Deleted successfully.";
    }

    //Update Employee
    @PutMapping("/updateEmployee/{id}")
    public Employee update(@RequestBody Employee employee,@PathVariable Long id)
    {
        return employeeServices.update(id,employee);
    }

}
