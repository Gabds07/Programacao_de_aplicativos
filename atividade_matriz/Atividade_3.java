package atividades.matriz;

public class Atividade_3 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 6}, {0, 4, 7}, {2, 5, 8}};

        for(int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][matriz.length - 1 - i]);
        }
    }
}
