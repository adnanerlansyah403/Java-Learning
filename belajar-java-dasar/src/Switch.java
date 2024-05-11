public class Switch {
    public static void main(String[] args) {
        var nilai = "a";
        String ucapan;
        switch (nilai) {
            case "a":
                System.out.println("Wow anda lulus dengan baik");
                break;
            case "b":
            case "c":
                System.out.println("Anda Lulus");
                break;
            default:
                System.out.println("Mungkin anda salah jurusan");
        }

        switch (nilai) {
            case "a" -> System.out.println("Wow anda lulus dengan baik");
            case "b", "c" -> System.out.println("Anda Lulus");
            case "d" -> System.out.println("Anda tidak lulus");
            default -> {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
        switch (nilai) {
            case "a" -> ucapan = "Wow anda lulus dengan baik";
            case "b", "c" -> ucapan = "Anda Lulus";
            case "d" -> ucapan = "Anda tidak lulus";
            default -> {
                ucapan = "Mungkin anda salah jurusan";
            }
        }
        System.out.println(ucapan);
        String ucapan2 = switch (nilai) {
            case "a": yield "Wow anda lulus dengan baik";
            case "b", "c": yield  ucapan = "Anda Lulus";
            case "d": yield "Anda tidak lulus";
            default: yield"Mungkin anda salah jurusan";
        };
        System.out.println(ucapan2);
    }
}
