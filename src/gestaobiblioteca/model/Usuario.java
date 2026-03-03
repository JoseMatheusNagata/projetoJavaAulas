package gestaobiblioteca.model;

public class Usuario {
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        if (id <= 0) {
            throw new IllegalArgumentException ("ID invalido");
        }
        this.id = id;
    }

}