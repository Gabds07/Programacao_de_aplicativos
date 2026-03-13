public class Cliente extends Pessoa {
    private String email;

    Cliente(String nome, int idade, String email) {
        super(nome, idade);
        this.email = email;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.getNome() + ", idade: " + this.getIdade() + ", email: " + this.email);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
