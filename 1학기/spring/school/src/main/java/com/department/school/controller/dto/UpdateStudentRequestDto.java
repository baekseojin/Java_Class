package com.department.school.controller.dto;

import com.department.school.domain.Department;
import com.department.school.domain.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateStudentRequestDto {
    private String name;
    private Gender gender;
    private Department department;


}
