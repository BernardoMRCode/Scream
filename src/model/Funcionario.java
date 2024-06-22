package model;

public class Funcionario extends Usuario {
    private double salario;
    private String email;
    private String cpf;
    private String telefone;

    public Funcionario(int id, String nome, double salario, String email, String cpf, String telefone) {
        super(id, nome);
        this.salario = salario;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return "";
    }

    public void setPreco(double novoPreco) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPreco'");
    }
}
