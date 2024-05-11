package programmer.zaman.now.data;

public class Avanza
        implements Car
//        IsMaintenance
{

    public void drive() {
        System.out.println("Driving car avanza");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaitenance() {
        return false;
    }

    public boolean isBig() {
        return true;
    }
}
