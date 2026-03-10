package gestaobiblioteca.model;

public abstract class Usuario implements Autenticavel {
    private Long id;
    private String nome;
    private String email;
    private String login;
    private String senha;
    private boolean primeiroAcesso = true;
    private Perfil perfil;

    public void autenticar(){
    }

    public void alterarSenha(){
    }

    public Usuario(Long id, String nome, String email, String login,
     String senha, boolean primeiroAcesso, Perfil perfil){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
        this.primeiroAcesso = primeiroAcesso;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        if (id <= 0) {
            throw new IllegalArgumentException ("ID invalido");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isPrimeiroAcesso() {
        return primeiroAcesso;
    }

    public void setPrimeiroAcesso(boolean primeiroAcesso) {
        this.primeiroAcesso = primeiroAcesso;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    

}