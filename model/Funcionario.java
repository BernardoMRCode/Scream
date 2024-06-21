public class Funcionario extends Usuario {

    private double salario;

    public Funcionario(String nome, String cpf, int telefone, String endereco, String email, String senha, double salario) {
        super(nome, cpf, telefone, endereco, email, senha);
        this.salario = salario;
    }

    @Override
    public boolean fazerLogin(String email, String senha) {
        if (email.equals(getEmail()) && senha.equals(getSenha())) {
            System.out.println("Login realizado com sucesso como funcionário!");
        } else {
            System.out.println("Email ou senha incorretos para funcionário.");
        }
        return false;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
        System.out.println("Salário: R$ " + salario);
    }

    @Override
    public void atualizarPerfil(String nome, String endereco, int telefone, String email) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
        System.out.println("Perfil atualizado com sucesso!");
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", CPF='" + getCpf() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", salario=" + salario +
                '}';
    }
}
