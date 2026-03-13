public class Cachorro extends Animal {
    private String raca;

    public Cachorro(String nome, double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    @Override
    public void mostrarAnimal() {
        System.out.println("Nome do cachorro: " + this.getNome() + ", peso do cachorro: " + this.getPeso() + " Kg" + ", raça do cachorro: " + this.raca);
    } 

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
