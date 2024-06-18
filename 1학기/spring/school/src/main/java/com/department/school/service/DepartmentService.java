package com.department.school.service;

import com.department.school.controller.dto.SaveDepartmentRequestDto;
import com.department.school.domain.Department;
import com.department.school.repository.DepartmentJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service // 서비스 어노테이션 꼭 붙이기
public class DepartmentService {
    
    private final DepartmentJpaRepository departmentJpaRepository; // DB에 값을 넣기 위해 department 불러옴
    
    public Long save(SaveDepartmentRequestDto requestDto) {
        // 1. DB에서 값 가져오기, 가져온 값과 비교하기
        Optional<Department> byName = departmentJpaRepository.findByName(requestDto.getName());

        if(byName.isPresent()) { // 값이 있냐?
            throw new IllegalArgumentException(("이미 등록된 학과입니다."));

        }



        return departmentJpaRepository.save(requestDto.toEntity()).getId();
    }


    public List<Department> findAll() {
        return departmentJpaRepository.findAll();
    }

    @Transactional
    public Long update(Long id, SaveDepartmentRequestDto requestDto) {
        // 1. 학과 찾기
        Department department = departmentJpaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 학과가 존재하지 않습니다.")); // 만약 null이면 오류 발생시킨다

        // 2. 찾은 학과 업데이트
        department.updateData(requestDto.getName(), requestDto.getPersonnel());
        return id;
    }
}
