public class ForEach {
    public static void main(String[] args) {
        String[] array = {
                "Adnan", "Erlansyah", "Bayu", "Ilyas"
        };

        // for (int i = 0; i < array.length; i++) {
            // System.out.println(array[i]);
        // }

        for (var value : array) {
            System.out.println(value);
        }
    }
}
