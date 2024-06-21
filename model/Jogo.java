import java.util.ArrayList;
import java.util.List;

class Jogo {
    private int id;
    private String nome;
    private String plataforma;
    private double valor;
    private String genero;
    private String descricao;
    private String versao;
    private Produtora produtora;
    
    public Jogo(int id, String nome, String plataforma, double valor, String genero, String descricao, String versao,
            Produtora produtora) {
        this.id = id;
        this.nome = nome;
        this.plataforma = plataforma;
        this.valor = valor;
        this.genero = genero;
        this.descricao = descricao;
        this.versao = versao;
        this.produtora = produtora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getVersao() {
        return versao;
    }

    public void setVersao(String versao) {
        this.versao = versao;
    }

    public Produtora getProdutora() {
        return produtora;
    }

    public void setProdutora(Produtora produtora) {
        this.produtora = produtora;
    }

    
    public static List<Jogo> jogos = new ArrayList<>();


    public static void criarJogo(Jogo jogo) {
        jogos.add(jogo);
    }


    public static Jogo buscarJogoPorId(int id) {
        for (Jogo jogo : jogos) {
            if (jogo.id == id) {
                return jogo;
            }
        }
        return null;
    }

    public static void atualizarJogo(Jogo jogo) {
        for (int i = 0; i < jogos.size(); i++) {
            if (jogos.get(i).id == jogo.id) {
                jogos.set(i, jogo);
                break;
            }
        }
    }



    public static void deletarJogo(int id) {
        jogos.removeIf(jogo -> jogo.id == id);
    }
   
    
}