package programmer.zaman.now.data;

public interface Car extends HasBrand, IsMaintenance {

    void drive(); // default nya public abstract

    int getTier();

    default boolean isBig() {
        return false;
    } // Berfungsi untuk membuat class2 turunan lainnya tidak mengimplementasikan method nya secara langsung di classnya karena sudah otomatis terpasang di class turunan nya tersebut

}
