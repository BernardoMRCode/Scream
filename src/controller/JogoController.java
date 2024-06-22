package controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Jogo;

public class JogoController {
    private static List<Jogo> jogos = new ArrayList<>();

    public void criarJogo(Jogo jogo) {
        jogos.add(jogo);
    }

    public static Jogo buscarJogoPorId(int id) {
        for (Jogo jogo : jogos) {
            if (jogo.getId() == id) {
                return jogo;
            }
        }
        return null;
    }

    public static void atualizarJogo(Jogo jogoAtualizado) {
        for (int i = 0; i < jogos.size(); i++) {
            if (jogos.get(i).getId() == jogoAtualizado.getId()) {
                jogos.set(i, jogoAtualizado);
                return;
            }
        }
        throw new IllegalArgumentException("Jogo não encontrado para atualização");
    }

    public void deletarJogo(int id) {
        jogos.removeIf(jogo -> jogo.getId() == id);
    }

    public static List<Jogo> listarJogos() {
        return new ArrayList<>(jogos);
    }

    public void cadastrarNovoJogo(Jogo novoJogo) {
        jogos.add(novoJogo);
    }

    @SuppressWarnings("unlikely-arg-type")
    public static void removerJogo() {
        jogos.remove(jogos);
    }

    public static void removerJogo(int id) {
        Iterator<Jogo> iterator = jogos.iterator();
        while (iterator.hasNext()) {
            Jogo jogo = iterator.next();
            if (jogo.getId() == id) {
                iterator.remove();
                return;
            }
        }
        throw new IllegalArgumentException("Jogo não encontrado para remoção");
    }

    public static void adicionarJogo(Jogo novoJogo) {
        if (buscarJogoPorId(novoJogo.getId()) != null) {
            System.out.println("Jogo com ID " + novoJogo.getId() + " já existe na lista.");
            return;
        }

        jogos.add(novoJogo);
        System.out.println("Jogo adicionado com sucesso: " + novoJogo);
    }
}
