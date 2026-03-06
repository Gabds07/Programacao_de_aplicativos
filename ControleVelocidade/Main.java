public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Mercedes", 50, 350);

        carro.acelerar(300);
        System.out.println(carro.getVelocidadeAtual());
        carro.frear(15);
        carro.acelerar(25);
        System.out.println(carro.getVelocidadeAtual());
    }
}
