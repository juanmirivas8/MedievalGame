package modelo;

import java.io.Serializable;
import java.util.Objects;

public class Jugador implements Serializable {
    private String usuario;
    private String password;

    private Jugador(){
    }

    public Jugador(String usuario, String password) throws IllegalArgumentException{
        setPassword(password);
        setUsuario(usuario);
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) throws IllegalArgumentException{
        if(usuario == null)
            throw new IllegalArgumentException("Error - Campo usuario no puede ser null");
        if(usuario.equals(""))
            throw new IllegalArgumentException("Error - Campo usuario no puede ser una cadena vacia");
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password == null)
            throw new IllegalArgumentException("Error - Campo password no puede ser null");
        if(password.equals(""))
            throw new IllegalArgumentException("Error - Campo password no puede ser una cadena vacia");
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(usuario, jugador.usuario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario);
    }
}
