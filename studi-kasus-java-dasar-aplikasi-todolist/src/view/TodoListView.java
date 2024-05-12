package view;

import service.TodoListService;
import util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }


    public void showTodoList() {
        while (true) {
            System.out.println("List Todolist: ");
            todoListService.showTodoList();

            System.out.println("MENU: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = InputUtil.input("Pilih");

            if(input.equals("1")) {
                addTodoList();
            } else if (input.equals("2")) {
                removeTodoList();
            } else if (input.equals("x") || input.contains("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public void addTodoList() {
        System.out.println("Menambah Todolist");

        var todo = InputUtil.input("Todo (Tekan x jika batal)");

        if (todo.equals("x")) {
            // batal
//            showTodoList();
        } else {
            todoListService.addTodoList(todo);
        }
    }

    public void removeTodoList() {
        System.out.println("Menghapus Todolist");

        var number = InputUtil.input("Todo (Tekan x jika batal)");

        if (number.equals("x")) {
            // batal
//             showTodoList();
        } else {
            todoListService.removeTodoList(Integer.valueOf(number));
        }
    }

}
