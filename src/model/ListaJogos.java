package model;

import java.util.ArrayList;
import java.util.List;

public class ListaJogos {
    private static List<Jogo> jogos = new ArrayList<>();

    public static void adicionarJogo(Jogo jogo) {
        jogos.add(jogo);
        System.out.println("Jogo adicionado: " + jogo.getNome());
    }

    public static void removerJogo(Jogo jogo) {
        if (jogos.contains(jogo)) {
            jogos.remove(jogo);
            System.out.println("Jogo removido: " + jogo.getNome());
        } else {
            System.out.println("O jogo não está na lista.");
        }
    }

    public static boolean contains(Jogo jogo) {
        return jogos.contains(jogo);
    }

    public static List<Jogo> getJogos() {
        return new ArrayList<>(jogos);
    }
}
