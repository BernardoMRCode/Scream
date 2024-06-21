public class TesteIntegracao {

    public static void main(String[] args) {
        // Teste de integração para Cliente
        testarCliente();

        // Teste de integração para Funcionário
        testarFuncionario();
    }

    private static void testarCliente() {
        Cliente cliente = new Cliente("João Silva", "12345678900", 999998888, "Rua das Flores, 123", "joao@example.com", "senha123");

        System.out.println("\n=== Teste de Integração para Cliente ===");
        // Teste de mostrarInformacoes()
        System.out.println("Informações iniciais do Cliente:");
        cliente.mostrarInformacoes();
        
        // Teste de fazerLogin()
        System.out.println("\nTeste de Login para Cliente:");
        if (cliente.fazerLogin("joao@example.com", "senha123")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login.");
        }

        // Teste de atualizarPerfil()
        System.out.println("\nAtualizando Perfil do Cliente:");
        cliente.atualizarPerfil("João da Silva", "Av. Central, 456", 888887777, "joao.silva@example.com");
        System.out.println("Novas informações do Cliente:");
        cliente.mostrarInformacoes();
    }

    private static void testarFuncionario() {
        Funcionario funcionario = new Funcionario("Maria Souza", "98765432100", 1199988777, "Av. Principal, 456", "maria@example.com", "senha456", 5000.0);

        System.out.println("\n=== Teste de Integração para Funcionário ===");
        // Teste de mostrarInformacoes()
        System.out.println("Informações iniciais do Funcionário:");
        funcionario.mostrarInformacoes();

        // Teste de fazerLogin()
        System.out.println("\nTeste de Login para Funcionário:");
        if (funcionario.fazerLogin("maria@example.com", "senha456")) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Falha no login.");
        }

        // Teste de atualizarPerfil()
        System.out.println("\nAtualizando Perfil do Funcionário:");
        funcionario.atualizarPerfil("Maria da Silva", "Rua Central, 789", 1199888777, "maria.silva@example.com");
        System.out.println("Novas informações do Funcionário:");
        funcionario.mostrarInformacoes();
    }
}
