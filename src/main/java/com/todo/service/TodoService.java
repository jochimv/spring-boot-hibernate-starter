package com.todo.service;

import com.todo.model.Todo;

import java.util.List;
import java.util.Optional;

public interface TodoService {
    List<Todo> getAllTodos();
    Optional<Todo> getTodoById(Long id);
    Todo createTodo(Todo todo);
    Todo updateTodo(Todo todo);
    void deleteTodo(Long id);
}
