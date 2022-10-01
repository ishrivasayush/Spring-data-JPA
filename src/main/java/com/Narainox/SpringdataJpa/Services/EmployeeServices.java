package com.Narainox.SpringdataJpa.Services;

import com.Narainox.SpringdataJpa.Model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeServices {
    List<Employee> getEmployee();
    Optional<Employee> getEmployeeById(Long id);
    Employee registerEmployee(Employee employee);
    void deleteEmployee(Long id);
    Employee findByEmail(String email);
    Employee update(Long id,Employee employee);
}
