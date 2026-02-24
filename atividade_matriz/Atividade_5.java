public class Atividade_5 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 6}, {0, 4, 7}, {2, 5, 8}};

        for(int i = 0; i < matriz.length; i++) {
            for(int j = matriz.length - 1 - i + 1; j < matriz.length; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
