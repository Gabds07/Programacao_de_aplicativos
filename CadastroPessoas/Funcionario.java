public class Funcionario extends Pessoa {
    private String cargo;

    Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome() + ", idade: " + this.getIdade() + ", cargo: " + this.cargo);
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}