package com.example.todolist.service;

import com.example.todolist.controller.dto.TodoRequestDto;
import com.example.todolist.controller.dto.TodoResponseDto;
import com.example.todolist.domain.TodoEntity;
import com.example.todolist.repository.TodoRepository;
import lombok.AllArgsConstructor;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    public Long save(TodoRequestDto todoRequestDto) {
        return todoRepository.save(todoRequestDto.toEntity()).getId();
    }

    public void findAll() {
        List<TodoEntity> result = todoRepository.findAll();
        List<TodoResponseDto> responseDtos = new ArrayList<>();

        for(TodoEntity todoEntity : result) {
            responseDtos.add(new TodoResponseDto(todoEntity));
        }

        return responseDtos;
    }

    public void fineOne() {
    }

    public void update() {
    }

    public void deleteAll() {
    }

    public void deleteOne() {
    }
}
