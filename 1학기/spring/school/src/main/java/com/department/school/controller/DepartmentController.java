package com.department.school.controller;

import com.department.school.controller.dto.SaveDepartmentRequestDto;
import com.department.school.domain.Department;
import com.department.school.service.DepartmentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor // 모든 속성에 대한 생성자를 만든다
@RestController
public class DepartmentController {
    private final DepartmentService departmentService; // 서비스를 부름

    // 1. 학과 등록
    @PostMapping("/api/departments")
    public Long createDept(@RequestBody SaveDepartmentRequestDto requestDto) {
        return departmentService.save(requestDto);
    }

    // 조회하기
    @GetMapping("/api/departments")
    public List<Department> readAll() {
        return departmentService.findAll();
    }

    @PutMapping("/api/departments/{id}")
    public Long update(@PathVariable Long id, @RequestBody SaveDepartmentRequestDto requestDto) {
        return departmentService.update(id, requestDto);
    }

}
