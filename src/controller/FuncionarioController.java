package controller;

import model.*;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    private static final Jogo[] Jogo = null;
    private List<Funcionario> funcionarios;

    public FuncionarioController() {
        this.funcionarios = new ArrayList<>();
    }

    public void criarFuncionario(Funcionario funcionario) {
        if (funcionario != null && funcionario.getId() != 0) {
            funcionarios.add(funcionario);
            System.out.println("Funcionário criado com sucesso.");
        } else {
            System.out.println("Erro ao criar funcionário: dados inválidos.");
        }
    }

    public void atualizarInformacoes(Funcionario funcionario) {
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == funcionario.getId()) {
                funcionarios.set(i, funcionario);
                System.out.println("Informações do funcionário atualizadas com sucesso.");
                return;
            }
        }
        System.out.println("Erro ao atualizar informações: funcionário não encontrado.");
    }

    public Funcionario buscarFuncionarioPorId(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        System.out.println("Funcionário não encontrado.");
        return null;
    }

    public Funcionario buscarFuncionarioPorEmail(String email) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getEmail().equals(email)) {
                return funcionario;
            }
        }
        System.out.println("Funcionário não encontrado.");
        return null;
    }

    public void deletarFuncionario(int id) {
        Funcionario funcionario = buscarFuncionarioPorId(id);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            System.out.println("Funcionário deletado com sucesso.");
        } else {
            System.out.println("Erro ao deletar funcionário: funcionário não encontrado.");
        }
    }

    public List<Funcionario> listarFuncionarios() {
        return new ArrayList<>(funcionarios);
    }

    public Funcionario loginFuncionario(String email, String senha) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getEmail().equals(email) && funcionario.getSenha().equals(senha)) {
                return funcionario;
            }
        }
        return null;
    }

    @SuppressWarnings("unused")
    private void atualizarSalarioFuncionario(Funcionario funcionario, double percentualAumento) {
        double salarioAtual = funcionario.getSalario();
        double aumento = salarioAtual * (percentualAumento / 100.0);
        double novoSalario = salarioAtual + aumento;

        funcionario.setSalario(novoSalario);

        System.out.println("Salário de " + funcionario.getNome() + " atualizado para R$ " + novoSalario);
    }

    @SuppressWarnings("unused")
    private void adicionarFuncionario(int id, String nome, double salario, String email, String cpf, String telefone) {
        Funcionario novoFuncionario = new Funcionario(id, nome, salario, email, cpf, telefone);

        funcionarios.add(novoFuncionario);

        System.out.println("Funcionário " + nome + " adicionado com sucesso.");
    }

    public List<Jogo> listarJogos() {
        List<Jogo> listaJogos = new ArrayList<>();

        listaJogos.add(new Jogo(1, "Jogo 1", 0, 0, "Descrição do Jogo 1"));
        listaJogos.add(new Jogo(2, "Jogo 2", 0, 0, "Descrição do Jogo 2"));
        listaJogos.add(new Jogo(3, "Jogo 3", 0, 0, "Descrição do Jogo 3"));
        return listaJogos;
    }

    public List<Produtora> listarProdutoras() {
        List<Produtora> listaProdutoras = new ArrayList<>();

        listaProdutoras.add(new Produtora(1, "Produtora 1"));
        listaProdutoras.add(new Produtora(2, "Produtora 2"));
        listaProdutoras.add(new Produtora(3, "Produtora 3"));
        return listaProdutoras;
    }

    public void cadastrarNovoJogo(Jogo novoJogo) {

        System.out.println("Novo jogo cadastrado com sucesso: " + novoJogo.getNome());
    }

    public void atualizarJogo(Produtora produtora) {

        System.out.println("Jogo atualizado com sucesso para a produtora: " + produtora.getNome());
    }

    public void cadastrarNovaProdutora(Jogo novoJogo) {

        System.out.println("Nova produtora cadastrada com sucesso: " + novoJogo.getNome());
    }

    public Produtora buscarProdutoraPorId(int id) {

        return new Produtora(id, "Produtora Encontrada");
    }

    public void removerJogo(Funcionario jogo) {

        System.out.println("Jogo removido com sucesso: " + jogo.getNome());
    }

    public void removerProdutora(Produtora produtora) {

        System.out.println("Produtora removida com sucesso: " + produtora.getNome());
    }

    public void removerJogo(Jogo jogo) {
        for (Jogo j : Jogo) {
            if (j.equals(jogo)) {
                jogo.remove(j);
                System.out.println("Jogo removido com sucesso.");
                return;
            }
        }
        System.out.println("Erro ao remover jogo: jogo não encontrado.");
    }
    
    public void CadastrarNovoJogo(Jogo novoJogo) {
        JogoController.adicionarJogo(novoJogo);
        System.out.println("Novo jogo cadastrado com sucesso.");
    }
    
    public void CadastrarNovaProdutora(Jogo novoJogo) {
        ProdutoraController.add(novoJogo);
        System.out.println("Nova produtora cadastrada com sucesso.");
    }
    

}
