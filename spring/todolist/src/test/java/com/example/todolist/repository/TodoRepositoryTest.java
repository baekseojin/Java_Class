package com.example.todolist.repository;

import com.example.todolist.domain.TodoEntity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TodoRepositoryTest {
    @Autowired
    private TodoRepository todoRepository;

    @AfterEach // 테스트가 끝난 다음에는 할 일을 초기화시켜줌
    public void 초기화() {
        todoRepository.deleteAll(); // DB 내부 값 제거
    }

    @Test
    public void 저장확인() {
        // 1. 값 저장
        // 1-1. 엔티티 생성
        TodoEntity entity = TodoEntity.builder()
                .content("a content")
                .completed(false)
                .build();

        todoRepository.save(entity);

        // 2. 저장된 값 불러오기
        List<TodoEntity> all = todoRepository.findAll();

        // 3. 저장할 값과 저장된 값 비교( 같아야 함 )
        assertEquals(all.get(0).getContent(), "a content");
    }
}