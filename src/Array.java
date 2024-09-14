public class Array {
    public static void main(String[] args) {
//        tipe data array di JAVA tipe data nya harus sama
//        panjangnya harus didefinisikan terlebih dahulu.

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Duma";
        arrayString[1] = "Doniagara";
        arrayString[2] = "Sambora";

//        gak bisa di print kalo misalnya ga dikasih index kaya di JS
        System.out.println(arrayString[2]);

        arrayString[2] = "Suswono";
//        arrayString[3] = "Suswono"; gak bisa melakukan hal ini bakal error.

        System.out.println(arrayString[2]);

        var arrayLength = arrayString.length;
        System.out.println(arrayLength);

//        Penyingkatan cara membuat array

        String[] listNama = {
                "duma", "donigara", "sambora"
        };

//        listNama[3] = "Ahay"; ini juga bakalan error;
        listNama[2] = null; // gak ada istilah menghapus data array di JAVA krn dia bakal ngurangin panjang.jadi harus diganti.

        System.out.println(listNama[1]);
        System.out.println(listNama[2]);

    }
}
