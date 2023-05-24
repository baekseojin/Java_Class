package com.example.todolist.controller;


// DB랑 통신하는 Domain의 생명주기는 service까지, controller에서 사용하려면 DTO 이용하기 (Domain의 대체자가 DTO)

import com.example.todolist.domain.TodoEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class TodoRequestDto {
    private String content;
    private Boolean completed;

    public TodoEntity toEntity() {
        return TodoEntity.builder()
                .content(this.content)
                .completed(this.completed)
                .build();
    }

}
