package view;

import java.util.List;
import java.util.Scanner;

import controller.ClienteController;
import model.Cliente;
import model.Jogo;

public class ClienteView {
    private ClienteController clienteController;
    private Cliente clienteLogado;
    private Scanner scanner;

    public ClienteView() {
        this.clienteController = new ClienteController(); // Instanciação do controller
        this.scanner = new Scanner(System.in); // Scanner para entrada do usuário
    }

    public void iniciar() {
        boolean sair = false;
        while (!sair) {
            exibirMenuCliente();
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    verJogosDisponiveis();
                    break;
                case 2:
                    verCarrinho();
                    break;
                case 3:
                    verMeusJogos();
                    break;
                case 4:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Sessão encerrada.");
    }

    public void exibirMenuCliente() {
        System.out.println("===== Menu Cliente =====");
        System.out.println("1. Ver Jogos Disponíveis");
        System.out.println("2. Ver Carrinho");
        System.out.println("3. Ver Meus Jogos");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private void verJogosDisponiveis() {
        List<Jogo> jogosDisponiveis = clienteController.listarJogosDisponiveis();
        System.out.println("===== Jogos Disponíveis =====");
        for (Jogo jogo : jogosDisponiveis) {
            System.out.println("ID: " + jogo.getId() + ", Nome: " + jogo.getNome());
        }
        System.out.println();
        System.out.print("Digite o ID do jogo para adicionar ao carrinho (ou 0 para voltar): ");
        int idJogo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        if (idJogo != 0) {
            Jogo jogoSelecionado = clienteController.buscarJogoPorId(idJogo);
            if (jogoSelecionado != null) {
                adicionarAoCarrinho(jogoSelecionado);
            } else {
                System.out.println("Jogo não encontrado.");
            }
        }
    }

    private void verCarrinho() {
        List<Jogo> carrinho = clienteController.listarItensCarrinho(clienteLogado);
        double totalCompra = clienteController.calcularTotalCompra(clienteLogado);

        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio.");
        } else {
            System.out.println("===== Carrinho de Compras =====");
            for (Jogo jogo : carrinho) {
                System.out.println("ID: " + jogo.getId() + ", Nome: " + jogo.getNome());
            }
            System.out.println("Total da Compra: R$ " + totalCompra);
            System.out.println();
            System.out.println("1. Finalizar Compra");
            System.out.println("2. Remover Item do Carrinho");
            System.out.println("3. Limpar Carrinho");
            System.out.println("4. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    finalizarCompra();
                    break;
                case 2:
                    System.out.print("Digite o ID do jogo para remover do carrinho: ");
                    int idJogo = scanner.nextInt();
                    scanner.nextLine(); // Limpar o buffer do scanner
                    Jogo jogoRemover = clienteController.buscarJogoPorId(idJogo);
                    if (jogoRemover != null) {
                        clienteController.removerJogoDoCarrinho(clienteLogado, jogoRemover);
                        System.out.println("Jogo removido do carrinho com sucesso.");
                    } else {
                        System.out.println("Jogo não encontrado no carrinho.");
                    }
                    break;
                case 3:
                    clienteController.limparCarrinho(clienteLogado);
                    System.out.println("Carrinho limpo com sucesso.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void verMeusJogos() {
        List<Jogo> meusJogos = clienteController.listarCompras(clienteLogado);

        if (meusJogos.isEmpty()) {
            System.out.println("Você ainda não comprou nenhum jogo.");
        } else {
            System.out.println("===== Meus Jogos =====");
            for (Jogo jogo : meusJogos) {
                System.out.println("ID: " + jogo.getId() + ", Nome: " + jogo.getNome());
            }
        }
    }

    private void adicionarAoCarrinho(Jogo jogo) {
        clienteController.adicionarJogoAoCarrinho(clienteLogado, jogo);
        System.out.println("Jogo adicionado ao carrinho com sucesso.");
    }

    private void finalizarCompra() {
        ClienteController.finalizarCompra(clienteLogado, null);
        System.out.println("Compra finalizada com sucesso.");
    }

    public void setClienteLogado(Cliente clienteLogado) {
        this.clienteLogado = clienteLogado;
    }
}
