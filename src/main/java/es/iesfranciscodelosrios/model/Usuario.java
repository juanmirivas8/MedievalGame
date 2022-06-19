package es.iesfranciscodelosrios.model;

import java.util.List;

public class Usuario {
    private String nombre;
    private String password;
    private Integer id;

    private List<Partida> partidas;
    public Usuario(String nombre, String password, Integer id,List<Partida> partidas) {
        this.nombre = nombre;
        this.password = password;
        this.id = id;
        this.partidas = partidas;
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

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }
}
