package view;

import controller.ProdutoraController;
import model.Produtora;

import java.util.List;

public class ProdutoraView {
    private ProdutoraController produtoraController;

    public ProdutoraView() {
        this.produtoraController = new ProdutoraController();
    }

    public void exibirDetalhesProdutora(Produtora produtora) {
        System.out.println("Detalhes da Produtora:");
        System.out.println("ID: " + produtora.getId());
        System.out.println("Nome: " + produtora.getNome());
        System.out.println();
    }

    @SuppressWarnings("static-access")
    public void listarProdutoras() {
        List<Produtora> produtoras = produtoraController.listarProdutoras();

        if (produtoras.isEmpty()) {
            System.out.println("Nenhuma produtora cadastrada.");
        } else {
            System.out.println("Lista de Produtoras:");
            for (Produtora produtora : produtoras) {
                System.out.println("ID: " + produtora.getId());
                System.out.println("Nome: " + produtora.getNome());
                System.out.println();
            }
        }
    }
}
