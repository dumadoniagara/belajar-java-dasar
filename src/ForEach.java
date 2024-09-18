public class ForEach {
    public static void main(String[] args) {

        String[] names = {
            "Duma",
            "Doniagara",
            "Sambora",
            "Eka",
            "Aulia",
            "Lestari",
        };

//        TANPA MENGGUNAKAN FOREACH
        for(var i=0; i < names.length; i++){
            System.out.println(names[i]);
        };

//        Dengan menggunakan FOREACH;
        for(var name: names){
            System.out.println("name dari for each : " + name);
        }
    }
}
