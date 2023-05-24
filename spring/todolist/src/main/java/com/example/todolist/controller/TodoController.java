// controller - service - repository - DB
//           DTO        |      Domain

package com.example.todolist.controller;

import com.example.todolist.service.todoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class TodoController {
    private final todoService todoService;

    @PostMapping("/todo/api")
    public Long create(@RequestBody TodoRequestDto requestDto) {
        return todoService.save(requestDto);
    }

    // 전체 리스트 읽기
    @GetMapping("todo/api")
    public List<TodoResponseDto> readAll() {
        return todoService.findAll();
    }

    // 객체 하나에 대해 읽기
    @GetMapping("todo/api/{id}")
    public TodoResponseDto readOne(@PathVariable Long id) {
        return todoService.findById(id);
    }

    // 업데이트
    @PutMapping("todo/api/{id}")
    public Long update(@PathVariable Long id, @RequestBody TodoRequestDto requestDto) {
        return todoService.update(id, requestDto);
    }

    // 전체 삭제
    @DeleteMapping("/todo/api")
    public void deleteAll() {
        todoService.deleteAll();
    }

    // 해당 엔티티 삭제
    @DeleteMapping("/todo/api/{id}")
    public void deleteOne(@PathVariable Long id) {
        todoService.deleteOne(id);
    }
}
