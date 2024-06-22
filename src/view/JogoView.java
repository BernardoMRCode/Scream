package view;

import controller.JogoController;
import model.Jogo;

import java.util.List;

public class JogoView {
    private JogoController jogoController;

    public JogoView(JogoController jogoController) {
        this.jogoController = jogoController;
    }

    @SuppressWarnings("static-access")
    public void exibirDetalhesJogo(int idJogo) {
        Jogo jogo = jogoController.buscarJogoPorId(idJogo);
        if (jogo != null) {
            System.out.println("Detalhes do Jogo:");
            System.out.println("ID: " + jogo.getId());
            System.out.println("Nome: " + jogo.getNome());
            System.out.println("ID da Produtora: " + jogo.getIdProdutora());
            System.out.println();
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    public void listarJogos() {
        List<Jogo> jogos = JogoController.listarJogos();
        if (jogos.isEmpty()) {
            System.out.println("Não há jogos cadastrados.");
        } else {
            System.out.println("Lista de Jogos:");
            for (Jogo jogo : jogos) {
                System.out.println("ID: " + jogo.getId() + ", Nome: " + jogo.getNome() + ", ID da Produtora: " + jogo.getIdProdutora());
            }
        }
    }
}



