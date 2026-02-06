package atividades.atividade_n1;

import java.util.Scanner;

public class Atividade_n1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Digite o número para mostrar o seu dobro: ");
        number = scanner.nextInt();

        int dobro = number*2;

        System.out.println("O dobro do seu número é: " + dobro);
    }
}
