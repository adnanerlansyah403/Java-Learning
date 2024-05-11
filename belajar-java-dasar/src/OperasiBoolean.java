public class OperasiBoolean {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAKhir = 80;

        boolean lulusAbsen = absen >= 75;
        boolean lulusNilai = nilaiAKhir >= 75;

        var lulus = lulusAbsen && lulusNilai;
        System.out.println(lulus);
    }
}
