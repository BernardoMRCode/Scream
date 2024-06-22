import java.util.Scanner;

import controller.ClienteController;
import controller.FuncionarioController;
import controller.LoginController;
import controller.UsuarioController;
import model.Cliente;
import model.Funcionario;

@SuppressWarnings("unused")
public class Main {

    public static void main(String[] args) {
        UsuarioController usuarioController = new UsuarioController();
        ClienteController clienteController = new ClienteController();
        FuncionarioController funcionarioController = new FuncionarioController();
        Scanner scanner = new Scanner(System.in);

        // Inicialização dos dados
        Cliente cliente1 = new Cliente(1, "Carlos", "carlos@email.com", "senha123");
        Cliente cliente2 = new Cliente(2, "Ana", "ana@email.com", "senha456");
        clienteController.adicionarCliente(cliente1);
        clienteController.adicionarCliente(cliente2);

        Funcionario funcionario1 = new Funcionario(1, "Bernardo", 2500,"BernardoMr2004@gmail.com", null, null);
        Funcionario funcionario2 = new Funcionario(2, "Maria", 3000.0, null, null, null);
        funcionarioController.criarFuncionario(funcionario1);
        funcionarioController.criarFuncionario(funcionario2);

        // Criar o controlador de login e iniciar o menu de login
        LoginController loginController = new LoginController(usuarioController, clienteController, funcionarioController, scanner);
        loginController.exibirMenuLogin();

        // Fechar o scanner ao finalizar
        scanner.close();
    }
}
