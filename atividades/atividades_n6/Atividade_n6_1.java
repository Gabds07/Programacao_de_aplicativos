package atividades.atividade_n6;

import java.util.Scanner;

public class Atividade_n6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;
        double altura;

        System.out.print("Digite o nome da pessoa: ");
        nome = scanner.next();
        System.out.print("Digite a idade da pessoa: ");
        idade = scanner.nextInt();
        System.out.print("Digite a altura da pessoa: ");
        altura = scanner.nextDouble();

        System.out.println("Seu nome é: "+ nome + ", você tem: " + idade + " anos, e tem: "
            + altura + "m de altura"
        );
    }
}
