import java.util.Scanner;

public class MediaAluno {
    public static void main(String[] args) {
        resultado();
    }

    public static int media() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ======= MÉDIA FINAL ======= \n");
        System.out.println("FAVOR INFORMAR OS NÚMEROS SEM CASA DECIMAL!\n");
        int nota = 0;
        int input;
        for (int i = 1; i <= 4; i++) {
            System.out.println("Favor informar a nota " + i + ":");
            input = sc.nextInt();
            nota += input;
        }
        return nota / 4;
    }

    public static void resultado() {
        int media = media();
        if (media >= 7)
            System.out.println("Com a média final de " + media + ", o aluno está APROVADO!");
        else if (media >= 5)
            System.out.println("Com a média final de " + media + ", o aluno está de RECUPERAÇÃO");
        else
            System.out.println("Com a média final de " + media + ", o aluno está REPROVADO!");
    }
}
