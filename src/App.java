public class Main {
    public static void main(String[] args) {
    
        Produtora produtora1 = new Produtora(1, "EA Sports", 1991);
        Produtora produtora2 = new Produtora(2, "Rockstar Games", 1998);
        Produtora produtora3 = new Produtora(3, "Ubisoft", 1986);
        Produtora produtora4 = new Produtora(4, "Nintendo", 1889);
        Produtora produtora5 = new Produtora(5, "Square Enix", 1975);

        Produtora.criarProdutora(produtora1);
        Produtora.criarProdutora(produtora2);
        Produtora.criarProdutora(produtora3);
        Produtora.criarProdutora(produtora4);
        Produtora.criarProdutora(produtora5);

       
        Jogo jogo1 = new Jogo(101, "PlayStation", "Ação", 59.99, "Jogo de aventura emocionante", "1.0", produtora1);
        Jogo jogo2 = new Jogo(102, "Xbox", "RPG", 49.99, "Mundo aberto com missões épicas", "2.5", produtora2);
        Jogo jogo3 = new Jogo(103, "PC", "Estratégia", 29.99, "Construa seu império", "3.2", produtora3);
        Jogo jogo4 = new Jogo(104, "Nintendo Switch", "Plataforma", 39.99, "Salve a princesa!", "1.8", produtora4);
        Jogo jogo5 = new Jogo(105, "PlayStation", "Esportes", 19.99, "Partidas de futebol emocionantes", "4.0", produtora5);

      
        Jogo.criarJogo(jogo1);
        Jogo.criarJogo(jogo2);
        Jogo.criarJogo(jogo3);
        Jogo.criarJogo(jogo4);
        Jogo.criarJogo(jogo5);

    

        
    }
}




    

