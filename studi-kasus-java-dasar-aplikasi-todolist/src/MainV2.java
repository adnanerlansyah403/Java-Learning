import repository.TodoListRepositoryImpl;
import repository.TodolistRepository;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class MainV2 {
    public static void main(String[] args) {
        TodolistRepository todolistRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todolistRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
