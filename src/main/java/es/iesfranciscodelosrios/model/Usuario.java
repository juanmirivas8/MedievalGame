package es.iesfranciscodelosrios.model;

public class Usuario {
    private String nombre;
    private String password;
    private Integer id;

    public Usuario(String nombre, String password, Integer id) {
        this.nombre = nombre;
        this.password = password;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
