package atividades.atividade_n1;
import java.util.Scanner;

public class Atividade_n1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro valor: ");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        n2 = scanner.nextInt();

        int soma = n1 + n2;
        System.out.println("A soma dos dois números é: " + soma);
    }
    
}
