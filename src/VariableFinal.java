public class VariableFinal {
    public static void main(String[] args) {
        var name = "Duma Doniagara Sambora";
        name = "Duma Doniagara Suswono";

        final String description = "Ganteng sekali"; // kaya const di JS gabisa diubah;

        var nameAndDescription = name + " " + description;

        System.out.println(nameAndDescription);

    }
}
