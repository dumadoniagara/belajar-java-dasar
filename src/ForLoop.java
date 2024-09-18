public class ForLoop {
    public static void main(String[] args) {

//        recall basic for loop:
//        yang bagian kiri adalah kondisi awal (initial statement)
//        yang bagian tengah adalah kondisi, dimana for loop akan teteap di eksekusi ketika nilai yang tengah bernilai true;
//        yang bagian kanan adalah post statement, yaitu suatu perintah yang akan dieksekusi SETIAP PERULANGAN BERHASIL DIEKSEKUSI.

        for( var counter = 1; counter <= 10; counter++){
            System.out.println("Perulangan dengan nilai counter " + counter*2);
        }
    }
}
