public class BreakContinue {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan Ke-" + counter);

            counter++;

            if(counter > 10) {
                break;
            }
        }

        System.out.println("Perulangan Berhasil");

        for (int counter2 = 1; counter2 <= 100; counter2++) {
            if (counter2 % 2 == 0) {
                continue;
            }

            System.out.println("Perulangan Ganjil-" + counter2);
        }
    }
}
