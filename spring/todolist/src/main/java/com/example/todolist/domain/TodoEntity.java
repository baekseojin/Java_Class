package com.example.todolist.domain;

import com.example.todolist.controller.TodoRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity // DB 테이블로 대체가 되어서 들어간다
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 참조형(대문자)

    @Column(length = 200)
    private String content; // 참조형(대문자)

    @Column(nullable = false)
    private Boolean completed; // 참조형(대문자)

    @Builder // 속성에 대한 값을 주입
    public TodoEntity(String content, Boolean completed) {
        this.content = content;
        this.completed = completed;
    }

    public Long updateData(TodoRequestDto requestDto) {
        this.content = requestDto.getContent();
        this.completed = requestDto.getCompleted();
        return this.id;
    }
}
