public class Testes {

    public static void main(String[] args) {
        // Teste para Cliente
        testarCliente();

        // Teste para Funcionário
        testarFuncionario();
    }

    private static void testarCliente() {
        Cliente cliente = new Cliente("João Silva", "12345678900", 999998888, "Rua das Flores, 123", "joao@example.com", "senha123");

        // Teste do método mostrarInformacoes
        System.out.println("=== Teste do Cliente ===");
        System.out.println("Informações iniciais do Cliente:");
        cliente.mostrarInformacoes();
        
        // Teste do método fazerLogin
        System.out.println("\nTeste de Login para Cliente:");
        if (cliente.fazerLogin("joao@example.com", "senha123")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login.");
        }

        // Teste do método atualizarPerfil
        System.out.println("\nAtualizando Perfil do Cliente:");
        cliente.atualizarPerfil("João da Silva", "Av. Central, 456", 888887777, "joao.silva@example.com");
        System.out.println("Novas informações do Cliente:");
        cliente.mostrarInformacoes();
    }

    private static void testarFuncionario() {
        Funcionario funcionario = new Funcionario("Maria Souza", "98765432100", 1199988777, "Av. Principal, 456", "maria@example.com", "senha456", 5000.0);

        // Teste do método mostrarInformacoes
        System.out.println("\n=== Teste do Funcionário ===");
        System.out.println("Informações iniciais do Funcionário:");
        funcionario.mostrarInformacoes();

        // Teste do método fazerLogin
        System.out.println("\nTeste de Login para Funcionário:");
        if (funcionario.fazerLogin("maria@example.com", "senha456")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login.");
        }

        // Teste do método atualizarPerfil
        System.out.println("\nAtualizando Perfil do Funcionário:");
        funcionario.atualizarPerfil("Maria da Silva", "Rua Central, 789", 1199888777, "maria.silva@example.com");
        System.out.println("Novas informações do Funcionário:");
        funcionario.mostrarInformacoes();
    }
}
