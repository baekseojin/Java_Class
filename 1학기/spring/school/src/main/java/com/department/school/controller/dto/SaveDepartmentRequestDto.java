package com.department.school.controller.dto;


import com.department.school.domain.Department;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data // Getter + Setter
public class SaveDepartmentRequestDto {
    private String name;
    private Long personnel;

    //
    public Department toEntity() {
        return Department.builder()
                .name(this.name)
                .personnel(this.personnel)
                .build();
    }
}
