package model;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private int id;
    private String nome;
    private int idProdutora;
    private double preco;
    private String email; // Novo atributo email

    public Jogo(int id, String nome, int idProdutora, double preco, String email) {
        this.id = id;
        this.nome = nome;
        this.idProdutora = idProdutora;
        this.preco = preco;
        this.email = email; // Inicializando o atributo email
    }

    // Getters e Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdProdutora() {
        return idProdutora;
    }

    public void setIdProdutora(int idProdutora) {
        this.idProdutora = idProdutora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idProdutora=" + idProdutora +
                ", preco=" + preco +
                ", email='" + email + '\'' +
                '}';
    }

    public String getTelefone() {
        throw new UnsupportedOperationException("Unimplemented method 'getTelefone'");
    }

    @SuppressWarnings("unused")
    public void remove(Jogo j) {
        // Implementação para remover o jogo da lista de jogos
        // Supondo que a lista de jogos seja uma variável estática ou seja passada como parâmetro
        if (this != null) {
            // Implemente aqui a lógica para remover o jogo da lista
            // Por exemplo, se a lista de jogos estiver em uma classe externa chamada ListaJogos
            ListaJogos.removerJogo(this);
        } else {
            throw new IllegalArgumentException("Jogo a ser removido não pode ser nulo");
        }
    }

    public static class ProdutoraController {

    private static final List<Produtora> produtoras = new ArrayList<>();

    // Métodos existentes omitidos...

    public void remove(Jogo jogo) {
        for (Produtora produtora : produtoras) {
            if (produtora.getJogos().contains(jogo)) {
                produtora.removerJogo(jogo);
                System.out.println("Jogo removido da produtora " + produtora.getNome() + ": " + jogo.getNome());
                return;
            }
        }
        System.out.println("Jogo não encontrado em nenhuma produtora.");
    }
}

}
