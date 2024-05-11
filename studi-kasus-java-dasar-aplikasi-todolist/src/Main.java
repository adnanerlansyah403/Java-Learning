//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static String[] model = new String[10];
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
//        testRemoveTodoList();
//        testInput();
//        testViewShowTodoList();
//        testViewAddTodoList();
//        testViewRemoveTodoList();
        viewShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList() {
        for (int i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1;

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList() {
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java Dasar : Aplikasi Todolist";
        showTodoList();
    }

    /**
     * Menambahkan todolist
     */
    public static void addTodoList(String todo) {
        // Cek apakah model / datanya sudah penuh atau belum
        var isFull = true;
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null) {
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }

        // Jika penuh, model nya akan di resize dengan ukuran array 2x lipat
        if(isFull) {
            var temp = model;
            model = new String[model.length * 2]; // Jika seperti ini akan mereplace data yg sebelumnya

            for (int i = 0; i < temp.length; i++) {
                model[i] = temp[i];
            }
        }

        // Tambahkan ke posisi yang data array nya null
        for (int i = 0; i < model.length; i++) {
            if(model[i] == null) {
                model[i] = todo;
                break;
            }
        }
    }

    public static void testAddTodoList() {
        addTodoList("Belajar Baru Lagi");
        addTodoList("Belajar Seru");

        for (int i = 0; i < 25; i++) {
            addTodoList("Contoh Todo Ke." + i);
        }
        showTodoList();
    }

    /**
     * Menghapus todolist
     */
    public static boolean removeTodoList(Integer number) {
        return true;
    }

    public static void testRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(20);
        System.out.println(result);

        result = removeTodoList(7);
        System.out.println(result);

        result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }

    public static String input(String info) {
        System.out.print(info + " : ");
        String data = scanner.nextLine();
        return data;
    }

    public static void testInput() {
        var name = input("Nama");
        System.out.println("Hi " + name);

        var channel = input("Channel");
        System.out.println(channel);
    }

    /**
     * Tampilan untuk todo list
     */
    public static void viewShowTodoList() {
        while (true) {
            System.out.println("List Todolist: ");
            showTodoList();

            System.out.println("MENU: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = input("Pilih");

            if(input.equals("1")) {
                viewAddTodoList();
            } else if (input.equals("2")) {
                viewRemoveTodoList();
            } else if (input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }

    public static void testViewShowTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Limat");
        viewShowTodoList();
    }

    /**
     * Tampilan untuk menambahkan todo list
     */
    public static void viewAddTodoList() {
        System.out.println("Menambah Todolist");

        var todo = input("Todo (Tekan x jika batal)");

        if (todo.equals("x")) {
            // batal
            viewShowTodoList();
        } else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        viewShowTodoList();

        showTodoList();
    }

    /**
     * Tampilan untuk menghapus todo list
     */
    public static void viewRemoveTodoList() {
        System.out.println("Menghapus Todolist");

        var number = input("Todo (Tekan x jika batal)");

        if (number.equals("x")) {
            // batal
            // viewShowTodoList();
        } else {
            boolean isSuccess = removeTodoList(Integer.valueOf(number));
            if (!isSuccess) {
                System.out.println("Gagal menghapus todolist : " + number);
            }
        }
    }

    public static void testViewRemoveTodoList() {
        addTodoList("Satu");
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");
        showTodoList();

        viewRemoveTodoList();

        showTodoList();
    }
}