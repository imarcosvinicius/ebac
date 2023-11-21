import java.util.*;

public class Tarefa2 {

    public static void main(String[] args) {
        // Obtém o input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes, separados por vírgula: ");
        String nomes = scanner.nextLine(); // Input Ex: Jessica - F, Romeu - M, Murilo - M, Nycolle - F, Renata - F, Paulo - M

        // Converte os nomes em uma lista
        List<String> listaNomes = Arrays.asList(nomes.split(", "));

        List<String> sexoMasculino = new ArrayList<>();
        List<String> sexoFeminino = new ArrayList<>();

        // Separando os de lista nomes de acordo com o sexo
        for (String listaNome : listaNomes) {
            if (listaNome.endsWith("F")) {
                sexoFeminino.add(listaNome);
            } else {
                sexoMasculino.add(listaNome);
            }
        }

        // Imprime a lista Feminina
        System.out.println("Os nomes do Seox Feminina: ");
        for (String nome : sexoFeminino) {
            System.out.println(nome);
        }

        // Imprime a lista Masculina
        System.out.println("Os nomes do Sexo Masculino: ");
        for (String nome : sexoMasculino) {
            System.out.println(nome);
        }
        /*
        Os nomes da lista Feminina:
        Jessica - F
        Nycolle - F
        Renata - F
        Os nomes da lista Masculina:
        Romeu - M
        Murilo - M
        Paulo - M
         */

    }

}