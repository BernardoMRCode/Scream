package controller;

import model.Cliente;
import model.Compra;
import model.Jogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClienteController {
    private static List<Cliente> clientes;
    private Map<Integer, Jogo> jogos;
    private static List<Compra> compras;
    private static int proximoIdCompra; // Contador para gerar IDs de compra sequencialmente

    public ClienteController() {
        ClienteController.clientes = new ArrayList<>();
        this.jogos = new HashMap<>();
        ClienteController.compras = new ArrayList<>();
        ClienteController.proximoIdCompra = 1; // Inicia o ID de compra a partir de 1
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente getClienteLogado() {
        if (verificarSessaoAtiva()) {
            // Lógica fictícia para obter o cliente logado
            return new Cliente(1, "Cliente Logado", "cliente.logado@example.com", "senha123");
        } else {
            return null;
        }
    }

    private boolean sessaoAtiva = false;

    private boolean verificarSessaoAtiva() {
        return sessaoAtiva;
    }

    public void setSessaoAtiva(boolean ativa) {
        this.sessaoAtiva = ativa;
    }

    public void adicionarJogoAoCarrinho(Cliente cliente, Jogo jogo) {
        cliente.adicionarAoCarrinho(jogo);
    }

    public static void finalizarCompra(Cliente cliente, Compra compra) {
        @SuppressWarnings("unused")
        double total = CompraController.calcularTotalCompra(compra);
        compra.setId(proximoIdCompra++);
        compra.setData(LocalDate.now());
        compras.add(compra);
        cliente.limparCarrinho(); // Limpa o carrinho após finalizar a compra
    }

    public void removerJogoDoCarrinho(Cliente cliente, Jogo jogo) {
        cliente.removerJogoDoCarrinho(jogo);
    }

    @SuppressWarnings("unlikely-arg-type")
    public List<Compra> getComprasPorCliente(Cliente cliente) {
        List<Compra> comprasDoCliente = new ArrayList<>();
        for (Compra compra : compras) {
            if (compra.getClass().equals(cliente)) {
                comprasDoCliente.add(compra);
            }
        }
        return comprasDoCliente;
    }

    public List<Compra> getTodasAsCompras() {
        return compras;
    }

    public Jogo buscarJogoPorId(int idJogo) {
        return jogos.get(idJogo);
    }

    public List<Jogo> listarJogosDisponiveis() {
        return new ArrayList<>(jogos.values());
    }

    public List<Jogo> listarItensCarrinho(Cliente cliente) {
        return cliente.getCarrinho();
    }

    public void limparCarrinho(Cliente cliente) {
        cliente.limparCarrinho();
    }

    @SuppressWarnings("unlikely-arg-type")
    public List<Jogo> listarCompras(Cliente cliente) {
        List<Jogo> jogosComprados = new ArrayList<>();
        for (Compra compra : compras) {
            if (compra.getClass().equals(cliente)) {
                jogosComprados.addAll(compra.getJogos());
            }
        }
        return jogosComprados;
    }

    public Cliente loginCliente(String email, String senha) {
        Cliente cliente = buscarClientePorEmail(email);
        if (cliente != null && cliente.getSenha().equals(senha)) {
            setSessaoAtiva(true);
            return cliente;
        }
        setSessaoAtiva(false);
        return null;
    }

    public Cliente buscarClientePorEmail(String id) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equalsIgnoreCase(id)) {
                return cliente;
            }
        }
        return null;
    }

    public static List<Cliente> listarClientes() {
        return clientes;
    }

    public void atualizarCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getId() == cliente.getId()) {
                c.setNome(cliente.getNome());
                c.setEmail(cliente.getEmail());
                c.setTelefone(cliente.getTelefone());
                return;
            }
        }
        throw new IllegalArgumentException("Cliente não encontrado para atualização");
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public double calcularTotalCompra(Cliente clienteLogado) {
        // Implementação fictícia para cálculo do total da compra
        double total = 0.0;
        for (int i = 0; i < clienteLogado.getQuantidade(); i++) {
            total += clienteLogado.getPrecoUnitario();
        }
        return total;
    }

    public void cadastrarNovoCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarClientePorEmail(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'buscarClientePorEmail'");
    }
}
