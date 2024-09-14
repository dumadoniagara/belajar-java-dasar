public class Primitif {
    public static void main(String[] args) {
//        Tipe data primitif seperti int, char, boolean adalah tipe data yang tidak bisa diubah lagi.
//        Tipe data non-primitif adalah tipe data yang punya function/method.
//        tipe data primitif selalu punya default value, sedangkan non-primitf tidak mempunyai default value.
//        sehingga default valuenya akan null
//        contoh tipe data non-primitif adalah String.

//        di JAVA semua tipe data primitif mempunyai representasi tipe data non-primitif nya.
//        Semua tipe data non-primitf akan mempunyai default value null



        Integer iniInteger = 100;
        Byte iniByte = null;

        System.out.println(iniByte);

//        konversi dari primitf ke non-primitif
        int iniIntegerPrimitif = 100;

        Integer iniInteger2 = iniIntegerPrimitif;

        System.out.println(iniInteger2);



        int age = 30;
        Integer ageObject = age;

        int ageAgain = age;

        Short shortAge = ageObject.shortValue();
        Byte byteAge = ageObject.byteValue();
        Long longAge = ageObject.longValue();

        System.out.println(longAge);
    }
}
