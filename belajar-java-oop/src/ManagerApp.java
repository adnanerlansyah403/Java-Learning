public class ManagerApp {

    public static void main(String[] args) {

        var manager = new Manager("Adnan");
//        manager.name = "Adnan";
        manager.sayHello("Erlansyah");

        var vp = new VicePresident("Bayu");
//        vp.name = "Bayu";
        vp.sayHello("Aji");

    }

}
