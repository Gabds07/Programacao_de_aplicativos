public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        if(valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Não foi possível realizar depósito. Valor menor ou igual a zero.");
        }
    }

    public void sacar(double valor) {

        if(valor <= this.saldo) {
            this.saldo -= valor;

            int cedulas[] = { (int)valor / 100, ((int)valor % 100) / 50, ((int)valor % 50) / 20, ((int)valor % 20) / 10, ((int)valor % 10) / 5, ((int)valor % 5) / 2, ((int)valor % 2) };

            System.out.println("Você terá que usar: " 
            + cedulas[0] + " cédulas de R$100, " 
            + cedulas[1] + " cédulas de R$50, "
            + cedulas[2] + " cédulas de R$20, "
            + cedulas[3] + " cédulas de R$10, " 
            + cedulas[4] + " cédulas de R$5, "
            + cedulas[5] + " cédulas de R$2, "
            + cedulas[6] + " cédulas de R$1.");
        } else {
            System.out.println("Não foi possível realizar saque, valor maior que o disponível no saldo da conta.");
        }
    }
}
