public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.depositar(500);
        System.out.println(conta.getSaldo());
        conta.sacar(20);
        System.out.println(conta.getSaldo());
    }
}
