// Classe abstrata Usuario
public abstract class Usuario {

    // Atributos da classe Usuario
    private String nome;
    private String endereco;
    private String email;
    private String senha;
    private String cpf;
    private int telefone;

    // Construtor da classe Usuario
    public Usuario(String nome, String cpf, int telefone, String endereco, String email, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }

    // Método getter para o atributo nome
    public String getNome() {
        return nome;
    }

    // Método setter para o atributo nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método getter para o atributo endereco
    public String getEndereco() {
        return endereco;
    }

    // Método setter para o atributo endereco
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método getter para o atributo email
    public String getEmail() {
        return email;
    }

    // Método setter para o atributo email
    public void setEmail(String email) {
        this.email = email;
    }

    // Método getter para o atributo senha
    public String getSenha() {
        return senha;
    }

    // Método setter para o atributo senha
    public void setSenha(String senha) {
        this.senha = senha;
    }

    // Método getter para o atributo cpf
    public String getCpf() {
        return cpf;
    }

    // Método setter para o atributo cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Método getter para o atributo telefone
    public int getTelefone() {
        return telefone;
    }

    // Método setter para o atributo telefone
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    // Método abstrato que deve ser implementado nas subclasses
    public abstract void mostrarInformacoes();

    public abstract boolean fazerLogin(String email, String senha);

    // Método abstrato para atualizar perfil
    public abstract void atualizarPerfil(String nome, String endereco, int telefone, String email);
}
