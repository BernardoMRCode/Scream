package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario {
    private String email;
    private String senha;
    private List<Compra> compras = new ArrayList<>();
    private List<Jogo> carrinho = new ArrayList<>();
    @SuppressWarnings("unused")
    private boolean sessaoAtiva;

    public Cliente(int id, String nome, String email, String senha) {
        super(id, nome);
        this.email = email;
        this.senha = senha;
        this.sessaoAtiva = false; // Inicialmente a sessão não está ativa
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public void comprarJogo(Compra compra) {
        compras.add(compra);
    }

    public List<Compra> getCompras() {
        return new ArrayList<>(compras); // Retorna uma cópia da lista para proteger o estado interno
    }

    public void adicionarAoCarrinho(Jogo jogo) {
        carrinho.add(jogo);
    }

    public void removerJogoDoCarrinho(Jogo jogo) {
        carrinho.remove(jogo);
    }

    public List<Jogo> getCarrinho() {
        return new ArrayList<>(carrinho); // Retorna uma cópia da lista para proteger o estado interno
    }

    public void limparCarrinho() {
        carrinho.clear();
    }

    public List<Jogo> getJogosComprados() {
        List<Jogo> jogosComprados = new ArrayList<>();
        for (Compra compra : compras) {
            jogosComprados.addAll(compra.getJogos());
        }
        return jogosComprados;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public boolean fazerLogin(String email2, String senha2) {
        Cliente cliente = buscarClientePorEmail(email2);
        if (cliente != null && cliente.getSenha().equals(senha2)) {
            setSessaoAtiva(true);
            return true;
        }
        setSessaoAtiva(false);
        return false;
    }

    private void setSessaoAtiva(boolean ativa) {
        this.sessaoAtiva = ativa;
    }

    private Cliente buscarClientePorEmail(String email) {
        // for (Cliente cliente : clientes) {
        //     if (cliente.getEmail().equals(email)) {
        //         return cliente;
        //     }
        // }
        return null;
    }

    public String getTelefone() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTelefone'");
    }

    public void setTelefone(String telefone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setTelefone'");
    }

    public void setEmail(String email2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmail'");
    }

    public int getQuantidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQuantidade'");
    }

    public double getPrecoUnitario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecoUnitario'");
    }
}
