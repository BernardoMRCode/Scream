package view;

import controller.JogoController;
import controller.ProdutoraController;
import model.Jogo;
import model.Produtora;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class UsuarioView {

    @SuppressWarnings("unused")
    private static final JogoController jogoController = new JogoController();
    private static final ProdutoraController produtoraController = new ProdutoraController();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        exibirMenu();
    }

    public static void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Listar todos os jogos");
            System.out.println("2. Buscar jogo por ID");
            System.out.println("3. Listar todas as produtoras");
            System.out.println("4. Buscar produtora por ID");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = obterOpcaoMenu();
            processarOpcao(opcao);
        } while (opcao != 0);
    }

    private static int obterOpcaoMenu() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.next(); // limpar o buffer do scanner
            System.out.println("Opção inválida. Digite um número válido.");
            return -1;
        }
    }

    private static void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                listarTodosOsJogos();
                break;
            case 2:
                buscarJogoPorId();
                break;
            case 3:
                listarTodasAsProdutoras();
                break;
            case 4:
                buscarProdutoraPorId();
                break;
            case 0:
                System.out.println("Encerrando o programa. Até mais!");
                break;
            default:
                System.out.println("Opção inválida. Escolha uma opção válida do menu.");
        }
    }

    private static void listarTodosOsJogos() {
        List<Jogo> jogos = JogoController.listarJogos();
        if (jogos.isEmpty()) {
            System.out.println("Não há jogos cadastrados.");
        } else {
            System.out.println("Lista de Jogos:");
            for (Jogo jogo : jogos) {
                System.out.println(jogo);
            }
        }
    }

    private static void buscarJogoPorId() {
        System.out.print("Digite o ID do jogo que deseja buscar: ");
        int id = obterOpcaoMenu();
        Jogo jogo = JogoController.buscarJogoPorId(id);
        if (jogo == null) {
            System.out.println("Jogo não encontrado para o ID: " + id);
        } else {
            System.out.println("Jogo encontrado:");
            System.out.println(jogo);
        }
    }

    private static void listarTodasAsProdutoras() {
        List<Produtora> produtoras = ProdutoraController.listarProdutoras();
        if (produtoras.isEmpty()) {
            System.out.println("Não há produtoras cadastradas.");
        } else {
            System.out.println("Lista de Produtoras:");
            for (Produtora produtora : produtoras) {
                System.out.println(produtora);
            }
        }
    }

    private static void buscarProdutoraPorId() {
        System.out.print("Digite o ID da produtora que deseja buscar: ");
        int id = obterOpcaoMenu();
        Produtora produtora = produtoraController.buscarProdutoraPorId(id);
        if (produtora == null) {
            System.out.println("Produtora não encontrada para o ID: " + id);
        } else {
            System.out.println("Produtora encontrada:");
            System.out.println(produtora);
        }
    }
}
