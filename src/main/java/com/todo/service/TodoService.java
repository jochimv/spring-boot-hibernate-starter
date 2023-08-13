package com.todo.service;

import com.todo.model.Todo;

import java.util.List;

public interface TodoService {
    List<Todo> getAllTodos();
    Todo getTodoById(Long id);
    Todo createTodo(Todo todo);
    Todo updateTodo(Todo todo);
    void deleteTodo(Long id);
}
