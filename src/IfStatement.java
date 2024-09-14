public class IfStatement {
    public static void main(String[] args) {
        var nilai = 65;
        var absen = 10;
        Boolean isLulus = false;
        Boolean isNgulang = false;

        String expression = "Selamat Anda Lulus";
        String expression2 = "Mohon maaf Anda tidak Lulus";
        String expression3 = "Mohon maaf Anda harus mengikuti UTS 3, untuk menentukan Anda lulus atau tidak";

        if (nilai > 75 && absen >= 9) {
            isLulus = true;
            isNgulang = false;
        } else if (nilai == 75 && absen == 10) {
            isLulus = true;
            isNgulang = true;
        } else {
            isLulus = false;
            isNgulang = false;
        }

        if (isLulus && !isNgulang) {
            System.out.print(expression);
        } else if (isLulus && isNgulang) {
            System.out.println(expression3);
        } else {
            System.out.println(expression2);
        }
    }
}
