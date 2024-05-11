package test.service;

import entity.Todolist;
import repository.TodoListRepositoryImpl;
import repository.TodolistRepository;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void testShowTodoList() {
        TodoListRepositoryImpl todolistRepository = new TodoListRepositoryImpl();
        todolistRepository.data[0] = new Todolist("Belajar Java Dasar");
        todolistRepository.data[1] = new Todolist("Belajar Java OOP");
        todolistRepository.data[2] = new Todolist("Studio Kasus Aplikasi TodoList");
        TodoListService todoListService = new TodoListServiceImpl(todolistRepository);

        todoListService.showTodoList();
    }

    public static void testAddTodoList() {
        TodolistRepository todolistRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todolistRepository);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Studi Kasus Java Aplikasi Todolist");
        todoListService.showTodoList();
    }

}
