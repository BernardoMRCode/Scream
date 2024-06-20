import java.util.ArrayList;
import java.util.List;

class Jogo {
    private int id;
    private String plataforma;
    private String genero;
    private double valor;
    private String descricao;
    private String versao;
    private Produtora produtora;

 public Jogo(int id, String plataforma, String genero, double valor, String descricao, String versao, Produtora produtora) {
        this.id = id;
        this.plataforma = plataforma;
        this.genero = genero;
        this.valor = valor;
        this.descricao = descricao;
        this.versao = versao;
        this.produtora = produtora;
        

}