package atividades.arrays;

import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        int[] nums = new int[3];
        Scanner scanner = new Scanner(System.in);
        int soma = 0, soma_pedido = 0;
        int i = 0;
        while(i < 3) {
            soma_pedido++;
            System.out.print("Digite um número: ");
            int valor = 0;
            try {
                valor = scanner.nextInt();
                nums[i] = valor;
                soma += nums[i];
            } catch (Exception e) {
                System.out.println("Digite um valor numerico. Tente novamente.");
                scanner.nextLine();
                continue;
            }
            i++;
        }
        for(int elemento : nums) {
            System.out.println(elemento);
        }
        System.out.println("Foram pedidas para digitar: " + soma_pedido);
        System.out.println("A soma dos valores é: " + soma);
    }
}
