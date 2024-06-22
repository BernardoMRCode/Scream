package controller;

import java.util.ArrayList;
import java.util.List;

import model.Jogo;
import model.Produtora;

public class ProdutoraController {

    private static List<Produtora> produtoras = new ArrayList<>();

    public void criarProdutora(Produtora produtora) {
        produtoras.add(produtora);
    }

    public Produtora buscarProdutoraPorId(int id) {
        for (Produtora produtora : produtoras) {
            if (produtora.getId() == id) {
                return produtora;
            }
        }
        return null;
    }

    public void atualizarProdutora(Produtora produtora) {
        for (int i = 0; i < produtoras.size(); i++) {
            if (produtoras.get(i).getId() == produtora.getId()) {
                produtoras.set(i, produtora);
                break;
            }
        }
    }

    public void deletarProdutora(int id) {
        produtoras.removeIf(produtora -> produtora.getId() == id);
    }

    public void cadastrarNovoJogo(Produtora produtora, Jogo jogo) {
        if (produtoras.contains(produtora)) {
            produtora.adicionarJogo(jogo);
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

    public void atualizarJogo(Produtora produtora, Jogo jogo) {
        if (produtoras.contains(produtora)) {
            produtora.atualizarJogo(jogo);
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

    public void removerJogo(Produtora produtora, Jogo jogo) {
        if (produtoras.contains(produtora)) {
            produtora.removerJogo(jogo);
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

    public void listarJogos(Produtora produtora) {
        if (produtoras.contains(produtora)) {
            List<Jogo> jogos = produtora.getJogos();
            if (jogos.isEmpty()) {
                System.out.println("Não há jogos cadastrados para esta produtora.");
            } else {
                System.out.println("Lista de Jogos da Produtora " + produtora.getNome() + ":");
                for (Jogo jogo : jogos) {
                    System.out.println("ID: " + jogo.getId() + ", Nome: " + jogo.getNome());
                }
            }
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

    public void cadastrarNovaProdutora(Produtora novaProdutora) {
        produtoras.add(novaProdutora);
    }

    public void atualizarProdutora(Produtora produtora, String novoNome) {
        if (produtoras.contains(produtora)) {
            produtora.setNome(novoNome);
            System.out.println("Produtora atualizada com sucesso.");
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

    public void removerProdutora(Produtora produtora) {
        produtoras.remove(produtora);
    }

    public static List<Produtora> listarProdutoras() {
        return new ArrayList<>(produtoras);
    }

    public static void add(Jogo novoJogo) {
        for (Produtora produtora : produtoras) {
            produtora.adicionarJogo(novoJogo);
            return;
        }
        System.out.println("Nenhuma produtora encontrada para adicionar o jogo.");
    }
}
