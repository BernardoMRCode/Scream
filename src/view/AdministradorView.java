package view;

import controller.ClienteController;
import controller.FuncionarioController;
import controller.JogoController;
import controller.ProdutoraController;
import model.Cliente;
import model.Funcionario;
import model.Jogo;
import model.Produtora;

import java.util.List;
import java.util.Scanner;

public class AdministradorView {

    private ClienteController clienteController;
    private FuncionarioController funcionarioController;
    private JogoController jogoController;
    private ProdutoraController produtoraController;
    private Scanner scanner;

    public AdministradorView() {
        this.clienteController = new ClienteController();
        this.funcionarioController = new FuncionarioController();
        this.jogoController = new JogoController();
        this.produtoraController = new ProdutoraController();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarVisaoGeral() {
        List<Cliente> totalClientes = ClienteController.listarClientes();
        List<Funcionario> totalFuncionarios = funcionarioController.listarFuncionarios();

        System.out.println("Visão Geral:");
        System.out.println("Total de Clientes: " + totalClientes);
        System.out.println("Clientes:");
        @SuppressWarnings("static-access")
        List<Cliente> clientes = clienteController.listarClientes();
        for (Cliente cliente : clientes) {
            System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome());
        }

        System.out.println();
        System.out.println("Total de Funcionários: " + totalFuncionarios);
        System.out.println("Funcionários:");
        List<Funcionario> funcionarios = funcionarioController.listarFuncionarios();
        for (Funcionario funcionario : funcionarios) {
            System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome());
        }
    }

    public void exibirMenuAdministrador() {
        boolean sair = false;
        while (!sair) {
            System.out.println("===== Menu Administrador =====");
            System.out.println("1. Ver Visão Geral");
            System.out.println("2. Gerenciar Clientes");
            System.out.println("3. Gerenciar Funcionários");
            System.out.println("4. Gerenciar Jogos");
            System.out.println("5. Gerenciar Produtoras");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    mostrarVisaoGeral();
                    break;
                case 2:
                    menuClientes();
                    break;
                case 3:
                    menuFuncionarios();
                    break;
                case 4:
                    menuJogos();
                    break;
                case 5:
                    menuProdutoras();
                    break;
                case 6:
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        System.out.println("Encerrando sessão do administrador.");
    }

    private void menuClientes() {
        boolean sair = false;
        while (!sair) {
            System.out.println("===== Menu Clientes =====");
            System.out.println("1. Listar Clientes");
            System.out.println("2. Adicionar Cliente");
            System.out.println("3. Atualizar Cliente");
            System.out.println("4. Remover Cliente");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    listarClientes();
                    break;
                case 2:
                    adicionarCliente();
                    break;
                case 3:
                    atualizarCliente();
                    break;
                case 4:
                    removerCliente();
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

    private void menuFuncionarios() {
        boolean sair = false;
        while (!sair) {
            System.out.println("===== Menu Funcionários =====");
            System.out.println("1. Listar Funcionários");
            System.out.println("2. Adicionar Funcionário");
            System.out.println("3. Atualizar Salário de Funcionário");
            System.out.println("4. Remover Funcionário");
            System.out.println("5. Voltar");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    listarFuncionarios();
                    break;
                case 2:
                    adicionarFuncionario();
                    break;
                case 3:
                    atualizarSalarioFuncionario();
                    break;
                case 4:
                    removerFuncionario();
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

    private void listarClientes() {
        @SuppressWarnings("static-access")
        List<Cliente> clientes = clienteController.listarClientes();
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
        } else {
            System.out.println("Lista de Clientes:");
            for (Cliente cliente : clientes) {
                System.out.println("ID: " + cliente.getId() + ", Nome: " + cliente.getNome());
            }
        }
    }

    private void adicionarCliente() {
        System.out.println("===== Adicionar Novo Cliente =====");
        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();
        Cliente novoCliente = new Cliente(0, nome, nome, nome);
        clienteController.adicionarCliente(novoCliente);
        System.out.println("Cliente adicionado com sucesso.");
    }

    private void atualizarCliente() {
        System.out.println("===== Atualizar Cliente =====");
        System.out.print("Digite o ID do cliente a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Cliente cliente = clienteController.buscarClientePorEmail(id);
        if (cliente != null) {
            System.out.print("Digite o novo nome do cliente (ou deixe em branco para manter o mesmo): ");
            String novoNome = scanner.nextLine().trim();
            if (!novoNome.isEmpty()) {
                cliente.setNome(novoNome);
            }
            clienteController.atualizarCliente(cliente);
            System.out.println("Cliente atualizado com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void removerCliente() {
        System.out.println("===== Remover Cliente =====");
        System.out.print("Digite o ID do cliente a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Cliente cliente = clienteController.buscarClientePorEmail(id);
        if (cliente != null) {
            clienteController.removerCliente(cliente);
            System.out.println("Cliente removido com sucesso.");
        } else {
            System.out.println("Cliente não encontrado.");
        }
    }

    private void listarFuncionarios() {
        List<Funcionario> funcionarios = funcionarioController.listarFuncionarios();
        if (funcionarios.isEmpty()) {
            System.out.println("Não há funcionários cadastrados.");
        } else {
            System.out.println("Lista de Funcionários:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println("ID: " + funcionario.getId() + ", Nome: " + funcionario.getNome());
            }
        }
    }

    private void adicionarFuncionario() {
        System.out.println("===== Adicionar Novo Funcionário =====");
        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        Funcionario novoFuncionario = new Funcionario(0, nome, 0, nome, nome, nome);
        funcionarioController.criarFuncionario(novoFuncionario);
        System.out.println("Funcionário adicionado com sucesso.");
    }

    private void atualizarSalarioFuncionario() {
        System.out.println("===== Atualizar Salário do Funcionário =====");
        System.out.print("Digite o ID do funcionário cujo salário será atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Funcionario funcionario = funcionarioController.buscarFuncionarioPorId(id);
        if (funcionario != null) {
            System.out.print("Digite o novo salário do funcionário: ");
            double novoSalario = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do scanner
            funcionario.setSalario(novoSalario);
            funcionarioController.criarFuncionario(funcionario);
            System.out.println("Salário do funcionário atualizado com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void removerFuncionario() {
        System.out.println("===== Remover Funcionário =====");
        System.out.print("Digite o ID do funcionário a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Funcionario funcionario = funcionarioController.buscarFuncionarioPorId(id);
        if (funcionario != null) {
            funcionarioController.criarFuncionario(funcionario);
            System.out.println("Funcionário removido com sucesso.");
        } else {
            System.out.println("Funcionário não encontrado.");
        }
    }

    private void listarJogos() {
        List<Jogo> jogos = JogoController.listarJogos();
        if (jogos.isEmpty()) {
            System.out.println("Não há jogos cadastrados.");
        } else {
            System.out.println("Lista de Jogos:");
            for (Jogo jogo : jogos) {
                System.out.println("ID: " + jogo.getId() + ", Nome: " + jogo.getNome());
            }
        }
    }

    private void cadastrarNovoJogo() {
        System.out.println("===== Cadastrar Novo Jogo =====");
        System.out.print("Digite o nome do jogo: ");
        String nome = scanner.nextLine();
        Jogo novoJogo = new Jogo(0, nome, 0, 0, nome);
        jogoController.criarJogo(novoJogo);
        System.out.println("Jogo cadastrado com sucesso.");
    }

    @SuppressWarnings("static-access")
    private void atualizarJogo() {
        System.out.println("===== Atualizar Jogo =====");
        System.out.print("Digite o ID do jogo a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        @SuppressWarnings("static-access")
        Jogo jogo = jogoController.buscarJogoPorId(id);
        if (jogo != null) {
            System.out.print("Digite o novo nome do jogo (ou deixe em branco para manter o mesmo): ");
            String novoNome = scanner.nextLine().trim();
            if (!novoNome.isEmpty()) {
                jogo.setNome(novoNome);
            }
            jogoController.atualizarJogo(jogo);
            System.out.println("Jogo atualizado com sucesso.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    private void removerJogo() {
        System.out.println("===== Remover Jogo =====");
        System.out.print("Digite o ID do jogo a ser removido: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Jogo jogo = JogoController.buscarJogoPorId(id);
        if (jogo != null) {
            JogoController.removerJogo(id);
            System.out.println("Jogo removido com sucesso.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    private void listarProdutoras() {
        List<Produtora> produtoras = ProdutoraController.listarProdutoras();
        if (produtoras.isEmpty()) {
            System.out.println("Não há produtoras cadastradas.");
        } else {
            System.out.println("Lista de Produtoras:");
            for (Produtora produtora : produtoras) {
                System.out.println("ID: " + produtora.getId() + ", Nome: " + produtora.getNome());
            }
        }
    }

    private void cadastrarNovaProdutora() {
        System.out.println("===== Cadastrar Nova Produtora =====");
        System.out.print("Digite o nome da produtora: ");
        String nome = scanner.nextLine();
        Produtora novaProdutora = new Produtora(0, nome);
        produtoraController.cadastrarNovaProdutora(novaProdutora);
        System.out.println("Produtora cadastrada com sucesso.");
    }

    private void atualizarProdutora() {
        System.out.println("===== Atualizar Produtora =====");
        System.out.print("Digite o ID da produtora a ser atualizada: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Produtora produtora = produtoraController.buscarProdutoraPorId(id);
        if (produtora != null) {
            System.out.print("Digite o novo nome da produtora (ou deixe em branco para manter o mesmo): ");
            String novoNome = scanner.nextLine().trim();
            if (!novoNome.isEmpty()) {
                produtora.setNome(novoNome);
            }
            produtoraController.atualizarProdutora(produtora);
            System.out.println("Produtora atualizada com sucesso.");
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

    private void removerProdutora() {
        System.out.println("===== Remover Produtora =====");
        System.out.print("Digite o ID da produtora a ser removida: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Produtora produtora = produtoraController.buscarProdutoraPorId(id);
        if (produtora != null) {
            produtoraController.removerProdutora(produtora);
            System.out.println("Produtora removida com sucesso.");
        } else {
            System.out.println("Produtora não encontrada.");
        }
    }

public static void main(String[] args) {
    AdministradorView view = new AdministradorView();
    view.exibirMenuAdministrador();
}
}