package com.example.todolist.repository;

import com.example.todolist.domain.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<TodoEntity, Long> {
    // ctrl + shift + t : 테스트 파일 만들기
}
