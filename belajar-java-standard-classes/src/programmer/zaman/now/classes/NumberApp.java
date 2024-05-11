package programmer.zaman.now.classes;

public class NumberApp {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Number.html
        // parseXxx(string) untuk non-primitive
        // valueOf(string) untuk primitive
        Integer intValue = 10;
        Long longValue = intValue.longValue();
        Double doubleValue = longValue.doubleValue();
        Short shortValue = doubleValue.shortValue();

        String contoh = "100000";

        Integer contohInt = Integer.valueOf(contoh);
        System.out.println(contohInt);

        Double contohDouble = Double.valueOf(contoh);
        System.out.println(contohDouble);


    }
}
