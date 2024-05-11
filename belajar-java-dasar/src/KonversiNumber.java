public class KonversiNumber {
    public static void main(String[] args) {
        // Widening Casting (Otomatis): byte -> short -> int -> long -> float -> double
        // Narrowing Casting (Manual): double -> float -> long -> int -> short -> byte
        byte iniByte = 10;
        short iniShort = iniByte;
        int inInt = iniShort;

        int iniInt2 = 1000;
        byte iniByte2 = (byte) inInt; // Force to convert

    }
}
