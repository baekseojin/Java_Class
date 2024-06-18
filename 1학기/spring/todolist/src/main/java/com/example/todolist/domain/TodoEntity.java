package com.example.todolist.domain;

import lombok.Builder;

import javax.persistence.*;

@Entity
public class TodoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String content;
    @Column
    private Boolean completed;

    @Builder
    public TodoEntity(String content, Boolean completed) {
        this.content = content;
        this.completed = completed;
    }


}
