package programmer.zaman.now.data;

public class Product {
    public String name;
    public int price;
//    protected String name;
//    protected int price;
//    private String name;
//    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price= price;
    }

    public String toString() { // Override method toString() from root Object
        return "Product name: " + name + " , price: " + price;
    }

}
