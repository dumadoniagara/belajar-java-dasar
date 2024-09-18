public class DoWhileLoop {
    public static void main(String[] args) {
        var counter = 100;

//        do while loop itu simplenya kaya while loop  tapi pengecekannya di akhir.
//        jadi minimal banget bakalan di eksekusi sekali kalaupun kondisi di whilenya tidak terpenuhi.

        do{
            System.out.println("Perulangan dieksekusi " + counter);
        }while(counter <= 10);
    }
}
