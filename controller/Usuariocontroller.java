package controller;

import model.Usuario;

public class UsuarioController {

    private List<Usuario> usuarios = new ArrayList<>();

    public void criarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void atualizarUsuario(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                usuarios.set(i, usuario);
                break;
            }
        }
    }

    public void deletarUsuario(int id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }

    // Classe Usuario (exemplo)
    static abstract class Usuario {
        private int id;
        private String nome;

        public Usuario(int id, String nome) {
            this.id = id;
            this.nome = nome;
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }
    }

}
