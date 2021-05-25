package com.spring.todo.item;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ToDoItemRequest {

    private String id;

    private String title;

    private boolean isDone;

}
