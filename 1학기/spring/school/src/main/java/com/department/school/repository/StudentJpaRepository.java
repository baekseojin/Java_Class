package com.department.school.repository;

import com.department.school.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import com.department.school.domain.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {
    // 내림차순으로 얻고 싶다
    @Query("Select s from Student s where department = :department order by s.id desc")
    List<Student> findByDepartment(@Param("department") Department department);
}
