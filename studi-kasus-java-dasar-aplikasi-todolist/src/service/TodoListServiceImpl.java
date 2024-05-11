package service;

import entity.Todolist;
import repository.TodolistRepository;

public class TodoListServiceImpl implements TodoListService {

    private TodolistRepository todolistRepository;

    public TodoListServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void showTodoList() {
        Todolist[] model= todolistRepository.getAll();
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("Sukses menambah data todo " + todo);
    }

    @Override
    public void removeTodoList(Integer number) {

    }
}
