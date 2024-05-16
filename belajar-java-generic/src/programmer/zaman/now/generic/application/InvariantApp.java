package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Adnan");
//        doIt(stringMyData); // Error
//        MyData<Object> objectMyData = stringMyData; // Error

        MyData<Object> objectMyData = new MyData<>(1000);
//        MyData<Integer> integerMyData = objectMyData; // Error
//        doItInteger(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData) {

    }

    public static void doItInteger(MyData<Integer> objectMyData) {

    }
}
