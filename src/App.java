public class Main {
    public static void main(String[] args) {
    
        Produtora produtora1 = new Produtora(1, "EA Sports", 1991);
        Produtora.criarProdutora(produtora1);
        Produtora produtora2 = new Produtora(2, "Rockstar Games", 1998);
        Produtora.criarProdutora(produtora2);
        Produtora produtora3 = new Produtora(3, "Ubisoft", 1986);
        Produtora.criarProdutora(produtora3);
        Produtora produtora4 = new Produtora(4, "Nintendo", 1889);
        Produtora.criarProdutora(produtora4);
        Produtora produtora5 = new Produtora(5, "Square Enix", 1975);
        Produtora.criarProdutora(produtora5);

        Jogo fifa2024 = new Jogo(101, "FIFA 2024", "PlayStation 5", 59.99, "Esportes", "Simulador de futebol","1.0", produtora1);
        Jogo.criarJogo(fifa2024);
        Jogo gtaV = new Jogo(201, "Grand Theft Auto V", "PC", 29.99, "Ação e Aventura", "Mundo aberto de crime","1.5", produtora2);
        Jogo.criarJogo(gtaV);
        Jogo acValhalla = new Jogo(301, "Assassin's Creed Valhalla", "Xbox Series X", 49.99, "Ação e Aventura","Exploração viking na Inglaterra medieval", "2.0", produtora3);
        Jogo.criarJogo(acValhalla);
        Jogo marioOdyssey = new Jogo(401, "Super Mario Odyssey", "Nintendo Switch", 39.99, "Plataforma","Aventuras do Mario pelo mundo", "1.2", produtora4);
        Jogo.criarJogo(marioOdyssey);
        Jogo ffVII = new Jogo(501, "Final Fantasy VII Remake", "PlayStation 4", 49.99, "RPG", "Reimaginação épica", "1.1", produtora5);
        Jogo.criarJogo(ffVII);
        

    

        
    }
}




    

