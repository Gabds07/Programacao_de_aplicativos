public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Gabriel", 18, "Inspetor");
        Cliente cliente = new Cliente("Yuri", 18, "yuri@gmail.com");

        funcionario.exibirDados();
        cliente.exibirDados();
    }
}
