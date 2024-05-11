public class Manager extends Employee {

    String company;
//    Manager() {
//
//    } // Default Constructor dan masih bisa membuat constructor di class childnya

    Manager(String name) {
        super(name);
    }

    Manager(String name, String company) {
        super(name);
        this.company = company;
    }


    void sayHello(String name) {
        System.out.println("Hi " + name + " My name is Manager " + this.name);
    }
}


