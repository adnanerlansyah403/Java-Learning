package programmer.zaman.now.generic.application;

public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(1L);

//        NumberData<String> stringNumberData = new NumberData<String>("Adnan"); // Error

    }

    public static class NumberData<T extends Number> { // hanya boleh extends 1 class dan sisa nya itu harus interface, jadi seperti ini <T extends Number & CanSayHello>

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        private T data;



    }
}
