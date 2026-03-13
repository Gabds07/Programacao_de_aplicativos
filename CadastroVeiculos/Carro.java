public class Carro extends Veiculo {
    private int portas;

    Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca do carro: " + this.getMarca() + ", ano do carro: " + this.getAno() + ", número de portas: " + this.portas);
    }

    public int getPortas() {
        return this.portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
