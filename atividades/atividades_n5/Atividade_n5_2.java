package atividades.atividade_n5;

import java.util.Scanner;

public class Atividade_n5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charName;

        System.out.println("Digite a primeira letra do seu nome: ");
        charName = scanner.next().charAt(0);

        System.out.println("A primeira letra do seu nome é: " + charName);
    }
}
