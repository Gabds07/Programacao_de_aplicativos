public class Gato extends Animal {
    private String cor;

    Gato(String nome, double peso, String raca) {
        super(nome, peso);
        this.cor = raca;
    }

    @Override
    public void mostrarAnimal() {
        System.out.println("Nome do gato: " + this.getNome() + ", peso do gato: " + this.getPeso() + " Kg" + ", cor do gato: " + this.cor);
    } 

    public String getCor() {
        return this.cor;
    }

    public void setCor(String raca) {
        this.cor = raca;
    }
}
