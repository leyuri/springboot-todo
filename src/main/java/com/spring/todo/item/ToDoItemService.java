package com.spring.todo.item;

import org.springframework.stereotype.Service;

@Service
public class ToDoItemService {

    public ToDoItem get(final String id) {
        return ToDoItem.builder()
                .title("Add an id validation")
                .build();
    }

}

