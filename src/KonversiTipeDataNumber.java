public class KonversiTipeDataNumber
{
    public static void main(String[] args) {
        byte iniByte = 10;
//        misalkan byte diatas mau dikonversi menjadi short
//        dilakukan secara otomatis

        short iniShort = iniByte;

        System.out.println("Hasilnya adalah :");
        System.out.println(iniByte);
        System.out.println(iniShort);

//        dilakukan dengan menggunakan manual
        int initInt = 1000;
        byte iniByte2 = (byte) initInt; //hasilnya kenapa jadi 24

        System.out.println("Hasilnya adalah :");
        System.out.println(initInt);
        System.out.println(iniByte2); //terkena number overflow karena dia bakal looping
//        harus diperhatikan tampungannya kalo misalkan dia mau di konversi dari yang besar ke yang kecil.



    }
}
