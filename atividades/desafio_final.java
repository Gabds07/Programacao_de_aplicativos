package atividades.desafio_final;

import java.util.Scanner;

public class DesafioFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeProduto;
        double preco;
        int qtd;

        System.out.print("Qual o nome do produto? ");
        nomeProduto = scanner.next();
        System.out.print("Digite o preço do produto? ");
        preco = scanner.nextDouble();
        System.out.println("Digite a quantidade do produto: ");
        qtd = scanner.nextInt();

        double total = (double) qtd *preco;
        System.out.println(nomeProduto + ": " + total);
    } 
}
