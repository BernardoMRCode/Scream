package model;

import java.util.ArrayList;
import java.util.List;

public class Produtora {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private List<Jogo> jogos;

    public Produtora(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.jogos = new ArrayList<>();
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public void atualizarJogo(Jogo jogoAtualizado) {
        for (int i = 0; i < jogos.size(); i++) {
            if (jogos.get(i).getId() == jogoAtualizado.getId()) {
                jogos.set(i, jogoAtualizado);
                return;
            }
        }
        throw new IllegalArgumentException("Jogo não encontrado para atualização");
    }

    public void removerJogo(Jogo jogo) {
        jogos.remove(jogo);
    }

    public List<Jogo> getJogos() {
        return new ArrayList<>(jogos);
    }

    @Override
    public String toString() {
        return "Produtora{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", jogos=" + jogos +
                '}';
    }
}
