package com.Narainox.SpringdataJpa.Services;
import com.Narainox.SpringdataJpa.Model.Employee;
import com.Narainox.SpringdataJpa.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServicesImpl implements EmployeeServices {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee registerEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee findByEmail(String email) {
        return employeeRepository.findByEmail(email);
    }

    @Override
    public Employee update(Long id,Employee employee) {
        Employee employee1=employeeRepository.findById(id).get();
       if (Objects.nonNull(employee.getfName()) && !"".equalsIgnoreCase(employee1.getfName())){
            employee1.setfName(employee1.getfName());
        }

        if (Objects.nonNull(employee.getlName()) && !"".equalsIgnoreCase(employee1.getlName())){
            employee1.setlName(employee1.getlName());
        }
        return employeeRepository.save(employee1);

    }
}
