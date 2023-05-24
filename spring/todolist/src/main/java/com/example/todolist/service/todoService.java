package com.example.todolist.service;

import com.example.todolist.controller.TodoRequestDto;
import com.example.todolist.controller.TodoResponseDto;
import com.example.todolist.domain.TodoEntity;
import com.example.todolist.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor // 생성자를 통해서 초기화시킨다
public class todoService {
    private final TodoRepository todoRepository;

    public Long save(TodoRequestDto requestDto) {
        return todoRepository.save(requestDto.toEntity()).getId(); // 저장된 ID 값을 return 시킴
    }

    @Transactional(readOnly = true)
    public List<TodoResponseDto> findAll() {
        List<TodoEntity> result = todoRepository.findAll();
        List<TodoResponseDto> responseDtos = new ArrayList<>();

        for(TodoEntity entity : result) {
            responseDtos.add(new TodoResponseDto(entity));
        }
        return responseDtos;
    }

    @Transactional(readOnly = true)
    public TodoResponseDto findById(Long id) {
        Optional<TodoEntity> entity = todoRepository.findById(id);
        return new TodoResponseDto(entity.orElse(new TodoEntity()));

    }

    @Transactional
    public Long update(Long id, TodoRequestDto requestDto) {
        // id 값으로 찾기
        TodoEntity entity = todoRepository.findById(id).orElse(new TodoEntity());
        // dto 내용으로 바꾸기
        entity.updateData(requestDto);
        return id;
    }

    public void deleteAll() {
        todoRepository.deleteAll();
    }

    public void deleteOne(Long id) {
        // todoRepository.findById(id); 값이 널인지 아닌지 확인 필요
        todoRepository.deleteById(id);
    }
}
