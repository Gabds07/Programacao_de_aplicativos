public class Atividade_4 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 3, 6}, {0, 4, 7}, {2, 5, 8}};

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < i; j++) {
                System.out.println(matriz[i][j]);
            }
        }
    }
}
