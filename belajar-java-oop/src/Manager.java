public class Manager {
    String name;

//    Manager() {
//
//    } // Default Constructor dan masih bisa membuat constructor di class childnya

    Manager(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + " My name is Manager " + this.name);
    }
}


