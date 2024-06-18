package com.department.school.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity // 클래스를 엔티티로 변환
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 학과코드

    @Column(nullable = false)
    private String name; // 학과명

    @Column(nullable = false)
    private Long personnel; // 정원

    @Builder
    public Department(String name, Long personnel) {
        this.name = name;
        this.personnel = personnel;
    }

    public void updateData(String name, Long personnel) {
        this.name = name;
        this.personnel = personnel;
    }
}
