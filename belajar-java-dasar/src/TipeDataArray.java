public class TipeDataArray {
    public static void main(String[] args) {
        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Adnan";
        arrayString[1] = "Erlansyah";
        arrayString[2] = arrayString[0] + " " + arrayString[1];

        System.out.println(arrayString[2]);

        String[] namaNama = {
                "Adnan", "Erlansyah"
        };

        namaNama[0] = null;

        int[] arrayInt = new int[]{
                10, 90, 80, 67, 28
        };

        long[] arrayLong = {
                10, 90, 80, 67, 28
        };

        arrayLong[0] = 0;

        // Array di dalam array
        String[][] members = {
                {"Adnan", "Erlansyah"},
                {"Puji", "Bayu"}
        };

        System.out.println(members[0]);
        System.out.println(members[0][1]);
    }
}
