package gestaobiblioteca.model;

public class Professor extends Usuario {

    public Professor(Long id, String nome, String email, String login, String senha, boolean primeiroAcesso,
            Perfil perfil) {
        super(id, nome, email, login, senha, primeiroAcesso, Perfil.PROFESSOR);
    }
    
}
