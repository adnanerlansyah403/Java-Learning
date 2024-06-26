package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {

//        try {
//            String[] names = {
//              "Adnan", "Erlansyah"
//            };
//            System.out.println(names[100]);
//        } catch (Throwable throwable) {
//            StackTraceElement[] stackTraceElements = throwable.getStackTrace();
//
//            throwable.printStackTrace();
//        }

        try {
            sampleError();
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

    }

    public static void sampleError() {

        try {
            String[] names = {
                    "Adnan", "Erlansyah"
            };
            System.out.println(names[100]);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }

    }
}
