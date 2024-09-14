public class SwitchStatement {
    public static void main(String[] args) {
        var nilaiAkhir = "A";

        switch (nilaiAkhir){
            case "A" :
                System.out.println("Selamat kamu lulus dengan baik !");
                break;
            case "B" :
                System.out.println("Selamat kamu lulus, Lumayan lah B !");
                break;
            case "C" :
                System.out.println("Selamat kamu lulus, Tapi C awokaowkwok !");
                break;
            case "D" :
                System.out.println("Ahhhh madesu, gak lulus! Ngulang awkoakwokao");
                break;
            default:
                System.out.println("Kamu memasukkan nilai yang salah BROW ! Silahkan hubungi dosen terkait");
        }

//        Switch Lambda
        switch (nilaiAkhir){
            case "A" -> {
                System.out.println("ini dari lambda a");
            }
            case "B", "C" -> {
                System.out.println("ini dari B dan C");
            }
            case "D" -> System.out.println("ini dari D");
            default -> {
                System.out.println("ini dari default lambda");
            }
        }
    }
}
