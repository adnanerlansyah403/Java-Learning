package programmer.zaman.now.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + name + " Umur anda adalah " + age);
    }
}
