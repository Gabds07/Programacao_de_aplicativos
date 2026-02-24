package atividades.matriz;

public class Atividade_2 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 6}, {0, 4, 7}, {2, 5, 8}};

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(i == j) {
                    System.out.print(matriz[i][j]);
                }
            }
        }
    }
}
