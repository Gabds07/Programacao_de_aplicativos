public class Main {
    public static void main(String[] args) {
        Alimento batata = new Alimento("Batata", 3.75, "28/03");
        Eletronico celular = new Eletronico("Celular", 1765.70, "1 Ano");

        batata.mostrarProdutos();
        celular.mostrarProdutos();
    }
}
