package tech.zero.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.zero.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);
    Optional<Employee> findEmployeeById(Long id);
}
