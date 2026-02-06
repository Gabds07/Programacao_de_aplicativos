package atividades.atividade_n3;

import java.util.Scanner;

public class Atividade_n3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome, cidade;

        System.out.print("Digite seu nome: ");
        nome = scanner.next();
        System.out.print("Digite a cidade em que reside cidade: ");
        cidade = scanner.next();

        System.out.println(nome + ", " + "vive em: " + cidade);
    }
}
