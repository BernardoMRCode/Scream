package controller;

import model.Cliente;
import model.Compra;
import model.Jogo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CompraController {
    private List<Cliente> clientes;
    @SuppressWarnings("unused")
    private int proximoIdCliente;

    public CompraController() {
        this.clientes = new ArrayList<>();
        this.proximoIdCliente = 1; // Inicializa o ID para clientes
    }

    public Cliente cadastrarCliente(String nome, String cpf, int telefone, String endereco, String email, String senha) {
        Cliente cliente = new Cliente(telefone, endereco, email, senha);
        clientes.add(cliente);
        System.out.println("Cliente cadastrado com sucesso.");
        return cliente;
    }

    public Cliente getClienteLogado(String email, String senha) {
        for (Cliente cliente : clientes) {
            if (cliente.fazerLogin(email, senha)) {
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado ou credenciais incorretas.");
        return null;
    }

    public void adicionarJogoAoCarrinho(Cliente cliente, Jogo jogo) {
        if (cliente != null && jogo != null) {
            cliente.adicionarAoCarrinho(jogo);
            System.out.println("Jogo adicionado ao carrinho.");
        } else {
            System.out.println("Erro ao adicionar jogo ao carrinho: cliente ou jogo inválido.");
        }
    }

    public static void finalizarCompra(Cliente cliente, Compra compra2) {
        List<Jogo> carrinho = cliente.getCarrinho();
        if (!carrinho.isEmpty()) {
            Compra compra = new Compra(LocalDateTime.now(), new ArrayList<>(carrinho));
            cliente.comprarJogo(compra);
            cliente.limparCarrinho();
            System.out.println("Compra finalizada com sucesso.");
        } else {
            System.out.println("Carrinho vazio. Não foi possível finalizar a compra.");
        }
    }

    public void removerJogoDoCarrinho(Cliente cliente, Jogo jogo) {
        if (cliente != null && jogo != null) {
            cliente.removerJogoDoCarrinho(jogo);
            System.out.println("Jogo removido do carrinho.");
        } else {
            System.out.println("Erro ao remover jogo do carrinho: cliente ou jogo inválido.");
        }
    }

    public List<Compra> getComprasPorCliente(Cliente cliente) {
        if (cliente != null) {
            return cliente.getCompras();
        } else {
            System.out.println("Cliente inválido.");
            return new ArrayList<>();
        }
    }

    public Jogo buscarJogoPorId(int idJogo) {
        // Implementação fictícia para buscar jogo por ID
        System.out.println("Método buscarJogoPorId não implementado.");
        return null;
    }

    public static double CalcularTotalCompra(Compra compra) {
        double total = 0.0;
        for (Jogo jogo : compra.getJogos()) {
            total += jogo.getPreco();
        }
        return total;
    }

    public static double calcularTotalCompra(Compra compra) {
        if (compra != null) {
            double total = 0.0;
            for (Jogo jogo : compra.getJogos()) {
                total += jogo.getPreco();
            }
            return total;
        } else {
            System.out.println("Compra inválida.");
            return 0.0;
        }
    }
}
