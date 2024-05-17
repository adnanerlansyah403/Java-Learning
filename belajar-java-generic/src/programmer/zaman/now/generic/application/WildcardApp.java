package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<>("Adnan"));
        print(new MyData<>(100));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));

    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
