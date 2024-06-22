package controller;

import java.util.List;

import model.Usuario;
import model.Cliente;
import model.Compra;
import model.Funcionario;

public class AdministradorController {
    private UsuarioController usuarioController;
    private FuncionarioController funcionarioController;
    @SuppressWarnings("unused")
    private ClienteController clienteController;

    public AdministradorController() {
        this.usuarioController = new UsuarioController();
        this.funcionarioController = new FuncionarioController();
        this.clienteController = new ClienteController();
    }

    public void criarFuncionario(Funcionario funcionario) {
        funcionarioController.criarFuncionario(funcionario);
    }

    public Funcionario buscarFuncionarioPorId(int id) {
        return funcionarioController.buscarFuncionarioPorId(id);
    }

    public void atualizarSalario(int id, double novoSalario) {
        Funcionario funcionario = funcionarioController.buscarFuncionarioPorId(id);
        if (funcionario != null) {
            funcionario.setSalario(novoSalario);
            funcionarioController.atualizarInformacoes(funcionario);
        }
    }

    public void atualizarInformacoes(Funcionario funcionario) {
        funcionarioController.atualizarInformacoes(funcionario);
    }

    public void deletarFuncionario(int id) {
        funcionarioController.deletarFuncionario(id);
    }

    public List<Usuario> buscarTodosUsuarios() {
        return usuarioController.buscarTodosUsuarios();
    }

    public void deletarUsuario(int id) {
        usuarioController.deletarUsuario(id);
    }

    public void finalizarCompra(Cliente cliente, Compra compra) {
        ClienteController.finalizarCompra(cliente, compra);
    }

    public double calcularTotalCompra(Compra compra) {
        return CompraController.calcularTotalCompra(compra);
    }
}
