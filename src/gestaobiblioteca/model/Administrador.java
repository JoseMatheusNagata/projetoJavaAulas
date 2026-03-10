package gestaobiblioteca.model;

public class Administrador extends Usuario{

    public Administrador(Long id, String nome, String email, String login, String senha, boolean primeiroAcesso,
            Perfil perfil) {
        super(id, nome, email, login, senha, primeiroAcesso, Perfil.ADMIN);
    }

}
