package com.department.school.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Student {
    @Id
    private Long id; // 학번

    @Column(nullable = false)
    private String name; // 이름

    @Column(nullable = false)
    @Enumerated(EnumType.STRING) // 테이블 속성에 열거형으로 들어가겠다
    private Gender gender; // 성별

    @ManyToOne // 다:1 관계 표현
    private Department department; // 학과

    @Builder
    public Student(Long id, String name, Gender gender, Department department) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.department = department;
    }

    // 학과 선택
    public void chooseDept(Department department) {
        this.department = department; 
    }


    public void updateData(String name, Gender gender, Department department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }
}
