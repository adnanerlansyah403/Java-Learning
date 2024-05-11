public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Adnan Build");
        employee.sayHello("Erlan");

        employee = new Manager("Adnan");
        employee.sayHello("Bayu");

        employee = new VicePresident("Adnan");
        employee.sayHello("Joko");

        sayHello(new Employee("Adnan"));
        sayHello(new Manager("Bayu"));
        sayHello(new VicePresident("Aji"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.getClass() + " " + employee.name);
    }
}
