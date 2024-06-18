package com.department.school.controller;

import com.department.school.controller.dto.SaveStudentRequestDto;
import com.department.school.controller.dto.UpdateStudentRequestDto;
import com.department.school.domain.Student;
import com.department.school.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
public class StudentController {
    private final StudentService studentService;

    @PostMapping("/api/students")
    public Long createStudent(@RequestBody SaveStudentRequestDto requestDto) {
        return studentService.save(requestDto);
    }

    // 전체 학생 조회
    @GetMapping("/api/students")
    public List<Student> readAll() {
        return studentService.findAll();
    }

    @GetMapping("/api/students/dept/{id}")
    public List<Student> readAllByDept(@PathVariable("id") Long departmentId) {
        return studentService.findByDept(departmentId);
    }

    @PutMapping("/api/students/{id}")
    public Long update(@PathVariable Long id, @RequestBody UpdateStudentRequestDto requestDto) {
        return studentService.update(id, requestDto);
    }
}
