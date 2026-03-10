package gestaobiblioteca.model;

public class Aluno extends Usuario{

    public Aluno(Long id, String nome, String email, String login, String senha, boolean primeiroAcesso,
            Perfil perfil) {
        super(id, nome, email, login, senha, primeiroAcesso, Perfil.ALUNO);
    }
    
    
}
