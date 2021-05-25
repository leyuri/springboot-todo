package com.spring.todo.item;

import com.spring.todo.apiResponse.ApiResponse;
import lombok.Builder;

import java.util.List;

public class ToDoItemResponse extends ApiResponse<ToDoItem> {

    @Builder
    public ToDoItemResponse(final ToDoItem toDoItem, final List<String> errors) {
        super(toDoItem);
        this.setErrors(errors);
    }
}


