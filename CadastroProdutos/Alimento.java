public class Alimento extends Produto {
    private String dataValidade;

    Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public void mostrarProdutos() {
        System.out.println("Nome do produto: " + this.getNome() + ", preço: " + this.getPreco() + ", data de validade: " + this.dataValidade);
    }

    public String getDataValidade() {
        return this.dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    } 
}
