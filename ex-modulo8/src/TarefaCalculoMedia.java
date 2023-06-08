import java.util.Locale;

public class TarefaCalculoMedia {

    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        calculoMedia();
    }

    private static void calculoMedia() {
        double nota1 = 6.5;
        double nota2 = 7.8;
        double nota3 = 7.5;
        double nota4 = 8.1;

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.printf("Media: %.1f", media);
    }

}