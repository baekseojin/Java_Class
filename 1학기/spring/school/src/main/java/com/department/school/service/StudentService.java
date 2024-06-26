package com.department.school.service;

import com.department.school.controller.dto.SaveStudentRequestDto;
import com.department.school.controller.dto.UpdateStudentRequestDto;
import com.department.school.domain.Department;
import com.department.school.domain.Student;
import com.department.school.repository.DepartmentJpaRepository;
import com.department.school.repository.StudentJpaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class StudentService {

    private final StudentJpaRepository studentJpaRepository;
    private final DepartmentJpaRepository departmentJpaRepository;

    public Long save(SaveStudentRequestDto requestDto) {
        Student student = requestDto.toEntity();

        // 1. 학번 중복 확인
        if(studentJpaRepository.findById(requestDto.getId()).isPresent()) { // 만약 학번이 있다면
            throw new IllegalArgumentException("이미 등록된 학생입니다.");
        }

        // 2. 학과 존재 유무 확인
        Optional<Department> byId = departmentJpaRepository.findById((requestDto.getDepartmentId()));
        if(byId.isEmpty()) {
            throw new IllegalArgumentException("존재하지 않는 학과입니다.");
        }
        Department department = byId.get();

        // 3. 학과 정원 초과 확인
        changeableDept(department);


        student.chooseDept(department);

        return studentJpaRepository.save(student).getId();

    }

    private void changeableDept(Department department) {
        // 1. 학과의 정원 확인
        department.getPersonnel();

        // 2. 해당 학과의 학생 수 확인
        studentJpaRepository.findByDepartment(department).size();


        // 3. 비교
        if (department.getPersonnel() <= studentJpaRepository.findByDepartment(department).size()) {
            throw new IllegalArgumentException("정원 초과 입니다");

        }

        return ;
    }

    public List<Student> findAll() {
        return studentJpaRepository.findAll();
    }

    public List<Student> findByDept(Long departmentId) {
        Department department = departmentJpaRepository.findById(departmentId)
                        .orElseThrow(()-> new IllegalArgumentException("해당 학과가 존재하지 않습니다")); // null 처리
        return studentJpaRepository.findByDepartment(department);
    }

    public Long update(Long id, UpdateStudentRequestDto requestDto) {
        // 1. 해당 학생 조회
        Student student = studentJpaRepository.findById(id).orElseThrow(() -> new IllegalArgumentException(("해당 학생이 존재하지 않습니다.")));

        // 2. 해당 학과 조회
        Department department = departmentJpaRepository.findByDepartment(requestDto.getDepartment()).orElseThrow(() -> new IllegalArgumentException("해당 학과가 존재하지 않습니다."));

        // 3. 학과 변경 가능한지 정원 체크
        changeableDept(department);

        // 4. 학생 정보 변경
        student.updateData(
                requestDto.getName(),
                requestDto.getGender(),
                requestDto.getDepartment());

        return id;
    }
}
