package com.department.school.repository;

import com.department.school.domain.Department;
import com.department.school.domain.Gender;
import com.department.school.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentJpaRepositoryTest {
    @Autowired
    private StudentJpaRepository studentJpaRepository;

    @Autowired
    private DepartmentJpaRepository departmentJpaRepository;

    @Test
    public void 저장됨() {

        Department department = Department.builder()
                .name("SW")
                .personnel(32L)
                .build();


        Student student = Student.builder()
                .id(1101L)
                .name("홍길동")
                .gender(Gender.MALE)
                .department(department)
                .build(); // 객체 생성

        departmentJpaRepository.save(department);
        studentJpaRepository.save(student);

        assertEquals(studentJpaRepository.findAll().get(0).getId(), 1101L);
    }
}