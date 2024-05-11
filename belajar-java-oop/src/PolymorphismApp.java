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
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
//        System.out.println("Hello " + employee.getClass() + " " + employee.name);
    }
}
