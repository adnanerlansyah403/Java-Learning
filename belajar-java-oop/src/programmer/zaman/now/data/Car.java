package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintenance {

    void drive(); // default nya public abstract

    int getTier();

}
