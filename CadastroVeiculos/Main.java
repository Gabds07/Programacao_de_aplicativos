public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Mercedes", 2021, 2);
        Moto moto = new Moto("Mitsubishi", 2019, 1100);

        carro.exibirInformacoes();
        moto.exibirInformacoes();
    }
}
