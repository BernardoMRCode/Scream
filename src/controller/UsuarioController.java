package controller;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import model.Cliente;
import model.Funcionario;

public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void atualizarUsuario(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                usuarios.set(i, usuario);
                break;
            }
        }
    }

    public void deletarUsuario(int id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }

    public int contarClientes() {
        return (int) usuarios.stream().filter(usuario -> usuario instanceof Cliente).count();
    }

    public int contarFuncionarios() {
        return (int) usuarios.stream().filter(usuario -> usuario instanceof Funcionario).count();
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Cliente) {
                clientes.add((Cliente) usuario);
            }
        }
        return clientes;
    }

    public List<Funcionario> listarFuncionarios() {
        List<Funcionario> funcionarios = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Funcionario) {
                funcionarios.add((Funcionario) usuario);
            }
        }
        return funcionarios;
    }

    public List<Usuario> buscarTodosUsuarios() {
        return new ArrayList<>(usuarios);
    }

    public boolean loginAdministrador(String email, String senha) {
        if ("admin@example.com".equals(email) && "admin123".equals(senha)) {
            return true;
        } else {
            return false;
        }
    }

    public void adicionarCliente(Cliente novoCliente) {
        usuarios.add(novoCliente);
    }

    public Cliente buscarClientePorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario instanceof Cliente && usuario.getId() == id) {
                return (Cliente) usuario;
            }
        }
        return null;
    }

    public void atualizarCliente(Cliente cliente) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            if (usuario instanceof Cliente && usuario.getId() == cliente.getId()) {
                usuarios.set(i, cliente);
                break;
            }
        }
    }

    public void removerCliente(Cliente cliente) {
        usuarios.remove(cliente);
    }

    public void adicionarFuncionario(Funcionario novoFuncionario) {
        usuarios.add(novoFuncionario);
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = usuarios.get(i);
            if (usuario instanceof Funcionario && usuario.getId() == funcionario.getId()) {
                usuarios.set(i, funcionario);
                break;
            }
        }
    }

    public void removerFuncionario(Funcionario funcionario) {
        usuarios.remove(funcionario);
    }
}
