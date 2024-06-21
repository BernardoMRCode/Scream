import java.util.ArrayList;
import java.util.List;

class Produtora {
    private int id;
    private String nome;
    private int fundacao;
    
    public Produtora(int id, String nome, int fundacao) {
        this.id = id;
        this.nome = nome;
        this.fundacao = fundacao;
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

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }


    public static List<Produtora> produtoras = new ArrayList<>();


    public static void criarProdutora(Produtora produtora) {
        produtoras.add(produtora);
    }


    public static Produtora buscarProdutoraPorId(int id) {
        for (Produtora prod : produtoras) {
            if (prod.id == id) {
                return prod;
            }
        }
        return null;
    }


    public static void atualizarProdutora(Produtora produtora) {
        for (int i = 0; i < produtoras.size(); i++) {
            if (produtoras.get(i).id == produtora.id) {
                produtoras.set(i, produtora);
                break;
            }
        }
    }


    public static void deletarProdutora(int id) {
        produtoras.removeIf(prod -> prod.id == id);
    }
}