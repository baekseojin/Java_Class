package com.department.school.repository;

import com.department.school.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DepartmentJpaRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByName(String deptName);
    Optional<Department> findByDepartment(Department department);
}
