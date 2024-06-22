package view;

import controller.FuncionarioController;
import controller.JogoController;
import model.Funcionario;
import model.Jogo;
import model.Produtora;

import java.util.List;
import java.util.Scanner;

public class FuncionarioView {

    private FuncionarioController FuncionarioController;
    private Scanner scanner;

    public FuncionarioView(FuncionarioController FuncionarioController) {
        this.FuncionarioController = FuncionarioController;
        this.scanner = new Scanner(System.in);
    }

    public void exibirDetalhesFuncionario(int idFuncionario) {
        Funcionario funcionario = FuncionarioController.buscarFuncionarioPorId(idFuncionario);
        if (funcionario != null) {
            System.out.println("Detalhes do Funcionário:");
            System.out.println("ID: " + funcionario.getId());
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println();
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    public void listarFuncionarios() {
        List<Funcionario> funcionarios = FuncionarioController.listarFuncionarios();
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome() + ", Salário: "
                        + funcionario.getSalario());
            }
        }
    }

    public void exibirMenuFuncionario() {
        boolean sair = false;
        while (!sair) {
            System.out.println("===== Menu Funcionário =====");
            System.out.println("1. Gerenciar Jogos");
            System.out.println("2. Gerenciar Produtoras");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    menuJogos();
                    break;
                case 2:
                    menuProdutoras();
                    break;
                case 3:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Encerrando sessão do funcionário.");
    }

    private void menuJogos() {
        boolean sair = false;
        while (!sair) {
            System.out.println("===== Menu Jogos =====");
            System.out.println("1. Listar Jogos");
            System.out.println("2. Cadastrar Novo Jogo");
            System.out.println("3. Atualizar Jogo");
            System.out.println("4. Remover Jogo");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    listarJogos();
                    break;
                case 2:
                    cadastrarNovoJogo();
                    break;
                case 3:
                    atualizarJogo();
                    break;
                case 4:
                    removerJogo();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void menuProdutoras() {
        boolean sair = false;
        while (!sair) {
            System.out.println("===== Menu Produtoras =====");
            System.out.println("1. Listar Produtoras");
            System.out.println("2. Cadastrar Nova Produtora");
            System.out.println("3. Atualizar Produtora");
            System.out.println("4. Remover Produtora");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    listarProdutoras();
                    break;
                case 2:
                    cadastrarNovaProdutora();
                    break;
                case 3:
                    atualizarProdutora();
                    break;
                case 4:
                    removerProdutora();
                    break;
                case 5:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private void cadastrarNovaProdutora() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrarNovaProdutora'");
    }

    private void listarJogos() {
        List<Jogo> jogos = FuncionarioController.listarJogos();
        if (jogos.isEmpty()) {
            System.out.println("Não há jogos cadastrados.");
        } else {
            System.out.println("Lista de Jogos:");
            for (Jogo jogo : jogos) {
                System.out.println("ID: " + jogo.getId() + ", Nome: " + jogo.getNome() + ", Preço: " + jogo.getPreco());
            }
        }
    }

    private void cadastrarNovoJogo() {
        System.out.println("===== Cadastrar Novo Jogo =====");
        System.out.print("Digite o nome do jogo: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do jogo: ");
        double preco = scanner.nextDouble();
        scanner.nextLine(); // Limpar o buffer do scanner

        Jogo novoJogo = new Jogo(0, nome, 0, preco, nome);
        FuncionarioController.cadastrarNovaProdutora(novoJogo);
        System.out.println("Jogo cadastrado com sucesso.");
    }

    private void atualizarJogo() {
        System.out.println("===== Atualizar Jogo =====");
        System.out.print("Digite o ID do jogo a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Jogo jogo = JogoController.buscarJogoPorId(id);
        if (jogo != null) {
            System.out.print("Digite o novo nome do jogo (ou deixe em branco para manter o mesmo): ");
            String novoNome = scanner.nextLine().trim();
            if (!novoNome.isEmpty()) {
                jogo.setNome(novoNome);
            }
            System.out.print("Digite o novo preço do jogo (ou deixe 0 para manter o mesmo): ");
            double novoPreco = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner
            if (novoPreco != 0) {
                jogo.setPreco(novoPreco);
            }
            JogoController.atualizarJogo(jogo);
            System.out.println("Jogo atualizado com sucesso.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    private void listarProdutoras() {
        List<Produtora> produtoras = FuncionarioController.listarProdutoras();
        if (produtoras.isEmpty()) {
            System.out.println("Não há produtoras cadastradas.");
        } else {
            System.out.println("Lista de Produtoras:");
            for (Produtora produtora : produtoras) {
                System.out.println("ID: " + produtora.getId() + ", Nome: " + produtora.getNome());
            }
        }
    }


    private void atualizarProdutora() {
        System.out.println("===== Atualizar Produtora =====");
        System.out.print("Digite o ID da produtora a ser atualizada: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Produtora produtora = FuncionarioController.buscarProdutoraPorId(id);
        if (produtora != null) {
            System.out.print("Digite o novo nome da produtora (ou deixe em branco para manter o mesmo): ");
            String novoNome = scanner.nextLine().trim();
            if (!novoNome.isEmpty()) {
                produtora.setNome(novoNome);
            }
            FuncionarioController.atualizarJogo(produtora);
            System.out.println("Produtora atualizada com sucesso.");
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

    private void removerJogo() {
        System.out.println("===== Remover Jogo =====");
        System.out.print("Digite o ID do jogo a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Funcionario jogo = FuncionarioController.buscarFuncionarioPorId(id);
        if (jogo != null) {
            FuncionarioController.removerJogo(jogo);
            System.out.println("Jogo removido com sucesso.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    private void removerProdutora() {
        System.out.println("===== Remover Produtora =====");
        System.out.print("Digite o ID da produtora a ser removida: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Produtora produtora = FuncionarioController.buscarProdutoraPorId(id);
        if (produtora != null) {
            FuncionarioController.removerProdutora(produtora);
            System.out.println("Produtora removida com sucesso.");
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

}
