public class Produto {
    private String nome;
    private double preco;

    Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void mostrarProdutos() {
        System.out.println("Nome do produto: " + this.nome + ", preço: " + this.preco);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    } 

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    } 
}
