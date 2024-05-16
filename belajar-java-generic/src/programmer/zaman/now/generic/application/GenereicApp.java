package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenereicApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<String>("Adnan");
        MyData<Integer> integerMyData = new MyData<Integer>(10);

        String stringValue = stringMyData.getData();
        Integer integerValue = integerMyData.getData();

        System.out.println(stringValue);
        System.out.println(integerValue);

    }

}
