package model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Compra {
    private int id;
    private LocalDate data;
    private List<Jogo> jogos;
    private double total;

    public Compra(int id, LocalDate data, List<Jogo> jogos) {
        this.id = id;
        this.data = data;
        this.jogos = jogos;
        this.total = calcularTotal();
    }

    public Compra(LocalDateTime now, Object object) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public double getTotal() {
        return total;
    }

    private double calcularTotal() {
        double total = 0.0;
        if (jogos != null) {
            for (Jogo jogo : jogos) {
                total += jogo.getPreco();
            }
        }
        return total;
    }

    public double getPrecoUnitario() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrecoUnitario'");
    }

    public int getQuantidade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getQuantidade'");
    }
}
