public class BreakAndContinue {
    public static void main(String[] args) {
        var counter = 1;

//        Break akan menghentikan perulangan dan keluar dari block perulangan tersebut, gak peduli apakah dia masih ada 100 atau 1000 perulangan lagi.


        while(true){
            System.out.println("Perulangan " + counter);
            counter++;

            if(counter > 10){
                break;
            };
        }

        System.out.println("Perulangan Berhenti");


//        CONTINUE adalah dia akan men-skip block dibawahnya dan lanjut ke iteration berikutnya.
//        Tidak menghentikan seluruh perulangan.

        for(int iterator = 1; iterator <= 100; iterator++){
           if(iterator % 2 == 0){
               continue;
           };
            System.out.println("Angka Ganjil == " + iterator );
        };
    }
}
