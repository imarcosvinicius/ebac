import java.util.*;

public class Tarefa1 {

    public static void main(String[] args) {
        // Obtém o input do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os nomes, separados por vírgula: ");
        String nomes = scanner.nextLine(); // Input nomes: Ronaldo, Cafú, Roberto Carlos, Amaral, Taffarel

        // Adiciona os nomes em uma lista de Strings
        List<String> listaNomes = Arrays.asList(nomes.split(", "));

        // Ordena a lista em ordem alfabética
        Collections.sort(listaNomes);

        // Imprime a lista em ordem alfabética
        System.out.println("Os nomes em ordem alfabética são: ");
        for (String nome : listaNomes) {
            System.out.println(nome);
        }
        /*Output:
        Amaral
        Cafú
        Roberto Carlos
        Ronaldo
        Taffarel
         */
    }

}