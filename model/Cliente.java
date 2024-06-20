public abstract class Cliente extends Usuario {

    public Cliente(String nome, String cpf, int telefone, String endereco, String email, String senha) {
        super(nome, cpf, telefone, endereco, email, senha);
        
    }

    public abstract void mostrarInformacoes();
    
}
