package programmer.zaman.now.data;

import java.util.Objects;

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

//    public boolean equals(Object o) {
//        if(this == o) return true;
//        if(!(o instanceof Product)) return false;
//
//        Product product = (Product) o;
//
//        if(this.price != product.price) return false;
//
//        if(this.name != null) return this.name.equals(product.name);
//        else {
//            return product.name == null;
//        }
//    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Product product = (Product) o;
//        if(price != product.price) return false;
//        return name != null ? name.equals(product.name) : product.name == null;
//    }

}
