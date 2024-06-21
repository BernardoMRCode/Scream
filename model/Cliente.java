public class Cliente extends Usuario {

    public Cliente(String nome, String cpf, int telefone, String endereco, String email, String senha) {
        super(nome, cpf, telefone, endereco, email, senha);
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("Email: " + getEmail());
    }

    public boolean fazerLogin(String email, String senha) {
        if (email.equals(getEmail()) && senha.equals(getSenha())) {
            System.out.println("Login realizado com sucesso!");
            return true;  // Retorna true se o login for bem-sucedido
        } else {
            System.out.println("Email ou senha incorretos.");
            return false;  // Retorna false se o login falhar
        }
    }

    @Override
    public void atualizarPerfil(String nome, String endereco, int telefone, String email) {
        setNome(nome);
        setEndereco(endereco);
        setTelefone(telefone);
        setEmail(email);
        System.out.println("Perfil atualizado com sucesso!");
    }
}
