public class Main {
        public static void main(String[] args) {
    
            // Criando um cliente
            Cliente cliente = new Cliente("João Silva", "12345678900", 987909870, "Rua das Flores, 123", "joao@example.com", "senha123");
    
            // Criando produtoras
            Produtora produtora1 = new Produtora(1, "EA Sports", 1991);
            Produtora produtora2 = new Produtora(2, "Rockstar Games", 1998);
            Produtora produtora3 = new Produtora(3, "Ubisoft", 1986);
            Produtora produtora4 = new Produtora(4, "Nintendo", 1889);
            Produtora produtora5 = new Produtora(5, "Square Enix", 1975);
    
            // Criando jogos
            Jogo fifa2024 = new Jogo(101, "FIFA 2024", "PlayStation 5", 59.99, "Esportes", "Simulador de futebol", "1.0", produtora1);
            Jogo gtaV = new Jogo(201, "Grand Theft Auto V", "PC", 29.99, "Ação e Aventura", "Mundo aberto de crime", "1.5", produtora2);
            Jogo acValhalla = new Jogo(301, "Assassin's Creed Valhalla", "Xbox Series X", 49.99, "Ação e Aventura", "Exploração viking na Inglaterra medieval", "2.0", produtora3);
            Jogo marioOdyssey = new Jogo(401, "Super Mario Odyssey", "Nintendo Switch", 39.99, "Plataforma", "Aventuras do Mario pelo mundo", "1.2", produtora4);
            Jogo ffVII = new Jogo(501, "Final Fantasy VII Remake", "PlayStation 4", 49.99, "RPG", "Reimaginação épica", "1.1", produtora5);
    
            // Exibindo informações iniciais do cliente
            System.out.println("=== Informações do Cliente ===");
            cliente.mostrarInformacoes();
            System.out.println();
    
            // Realizando login do cliente
            System.out.println("=== Login do Cliente ===");
            cliente.fazerLogin("joao@example.com", "senha123");
            System.out.println();
    
            // Atualizando perfil do cliente
            System.out.println("=== Atualizando Perfil do Cliente ===");
            cliente.atualizarPerfil("João da Silva", "Av. Central, 456", 888887777, "joao.silva@example.com");
            cliente.mostrarInformacoes();
            System.out.println();
    
            // Exibindo informações das produtoras
            System.out.println("=== Informações das Produtoras ===");
            System.out.println(produtora1);
            System.out.println(produtora2);
            System.out.println(produtora3);
            System.out.println(produtora4);
            System.out.println(produtora5);
            System.out.println();
    
            // Exibindo informações dos jogos
            System.out.println("=== Informações dos Jogos ===");
            System.out.println(fifa2024);
            System.out.println(gtaV);
            System.out.println(acValhalla);
            System.out.println(marioOdyssey);
            System.out.println(ffVII);
        }
        
}