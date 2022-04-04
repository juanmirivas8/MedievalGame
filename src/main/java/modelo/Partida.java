package modelo;

import interfaces.ICiudad;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Partida implements Serializable {
    private ICiudad city;
    private String nombreJugador;
    private Integer turnos;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaGuardado;

    private Partida(){

    }

    public Partida(ICiudad city, String nombreJugador, Integer turnos, LocalDateTime fechaCreacion)
            throws IllegalArgumentException{
        this.setCity(city);
        this.nombreJugador = nombreJugador;
        this.turnos = turnos;
        this.fechaCreacion = fechaCreacion;
    }

    public ICiudad getCity() {
        return city;
    }

    public void setCity(ICiudad city) throws IllegalArgumentException{
        if (city == null)
            throw new IllegalArgumentException("Error - Ciudad no puede ser null");
        this.city = city;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        if(nombreJugador == null)
            throw new IllegalArgumentException("Error - Campo jugador no puede ser null");
        if(nombreJugador.equals(""))
            throw new IllegalArgumentException("Error - Campo jugador no puede ser una cadena vacia");
        this.nombreJugador = nombreJugador;
    }

    public Integer getTurnos() {
        return turnos;
    }

    public void setTurnos(Integer turnos) {
        if(turnos == null)
            throw new IllegalArgumentException("Error - Turno no puede ser null");
        if(turnos < 0)
            throw new IllegalArgumentException("Error - Turno no puede ser negativo");
        this.turnos = turnos;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        if(fechaCreacion == null)
            throw new IllegalArgumentException("Error - Fecha de creacion no puede ser null");
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaGuardado() {
        return fechaGuardado;
    }

    public void setFechaGuardado(LocalDateTime fechaGuardado) {
        this.fechaGuardado = fechaGuardado;
    }
}
