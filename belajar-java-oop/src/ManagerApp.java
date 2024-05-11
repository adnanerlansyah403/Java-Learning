public class ManagerApp {

    public static void main(String[] args) {

        var manager = new Manager();
        manager.name = "Adnan";
        manager.sayHello("Erlansyah");

        var vp = new VicePresident();
        vp.name = "Bayu";
        vp.sayHello("Aji");

    }

}
