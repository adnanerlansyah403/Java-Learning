//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var person1 = new Person("Adnan Erlansyah", "Bekasi");
        var person2 = new Person("Adnan");
        var person3 = new Person();
//        Person person2 = new Person();
//        Person person3;
//        person3 = new Person();

//        person1.name = "Adnan Erlansyah";
//        person1.address = "Bekasi";
//        person1.country = "Amerika";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("Adnan");

//        System.out.println(person1);
//        System.out.println(person2);
//        System.out.println(person3);
//        person3.sayHello("Budi");

    }
}