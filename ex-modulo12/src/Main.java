import java.util.*;

public class Main {

    public static void main(String[] args) {
        // Obtém o input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes, separados por vírgula: ");
        String nomes = scanner.nextLine(); // Input Ex: Fernanda - F, Diego - M, Osvaldo - M, Patricia - F, Isababela - F, Bruno - M

        // Converte os nomes em uma lista
        String[] listaNomes = nomes.split(", ");

        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        // Separando os de lista nomes de acordo com o sexo
        for (String listaNome : listaNomes) {
            if (listaNome.endsWith("F")) {
                grupoFeminino.add(listaNome);
            } else {
                grupoMasculino.add(listaNome);
            }
        }

        // Imprime a lista Feminina
        System.out.println("Nomes do grupo Feminina: ");
        for (String nome : grupoFeminino) {
            System.out.println(nome);
        }

        // Imprime a lista Masculina
        System.out.println("Nomes do grupo Masculino: ");
        for (String nome : grupoMasculino) {
            System.out.println(nome);
        }
        /*
        Nomes do grupo Feminina:
        Fernanda - F
        Patricia - F
        Isababela - F
        Nomes do grupo Masculino:
        Diego - M
        Osvaldo - M
        Bruno - M
         */

    }

}