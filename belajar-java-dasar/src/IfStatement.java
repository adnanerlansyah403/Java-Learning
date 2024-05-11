public class IfStatement {
    public static void main(String[] args) {
        var nilai = 70;
        var absen = 70;

        if(nilai >= 70 && absen >= 70) {
            System.out.println("Selamat anda Lulus");
        } else if (nilai >= 60 && absen >= 60) {
            System.out.println("Teruslah mencoba");
        } else {
            System.out.println("Silah coba lagi tahun depan");
        }
    }
}
