public class Moto extends Veiculo{
    private int cilindradas;

    Moto(String marca, int ano, int cilindradas) {
        super(marca, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Marca da moto: " + this.getMarca() + ", ano da moto: " + this.getAno() + ", número de cilindradas: " + this.cilindradas);
    }

    public int getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
