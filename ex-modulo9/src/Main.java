import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input do tipo primitivo
        int idade = sc.nextInt();

        // Casting
        Integer novaIdade = idade;

        // Print em Wrapper
        System.out.println(novaIdade);

    }

}
