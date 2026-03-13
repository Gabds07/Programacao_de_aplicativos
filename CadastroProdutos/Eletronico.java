public class Eletronico extends Produto{
    private String garantia;

    Eletronico(String nome, double preco, String garantia) {
        super(nome, preco);
        this.garantia = garantia;
    }

    @Override
    public void mostrarProdutos() {
        System.out.println("Nome do produto: " + this.getNome() + ", preço: " + this.getPreco() + ", garantia: " + this.garantia);
    }

    public String getGarantia() {
        return this.garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    } 
}
