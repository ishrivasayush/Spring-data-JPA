package com.Narainox.SpringdataJpa.Repository;
import com.Narainox.SpringdataJpa.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Override
    Optional<Employee> findById(Long id);

    Employee findByEmail(String email);
}
