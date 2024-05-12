package test.view;

import repository.TodoListRepositoryImpl;
import repository.TodolistRepository;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    public static void main(String[] args) {

        testShowTodoList();

    }

    public static void testShowTodoList() {
        TodolistRepository todolistRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todolistRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Aplikasi TodoList");

        todoListView.showTodoList();
    }

}
