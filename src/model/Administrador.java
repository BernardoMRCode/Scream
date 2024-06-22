package model;

public class Administrador extends Usuario {

    private static Administrador instancia;

    // Construtor privado para impedir a criação direta de instâncias
    private Administrador(int id, String nome) {
        super(id, nome);
    }

    // Método estático para obter a instância única do administrador
    public static Administrador getInstance() {
        if (instancia == null) {
            instancia = new Administrador(007, "Admin007"); // Exemplo de criação com ID e nome fixos
        }
        return instancia;
    }

    // Métodos específicos para o administrador, se necessário
}
