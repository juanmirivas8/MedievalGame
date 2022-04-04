package modelo;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Ranking implements Serializable {
    private String nombreJugador;
    private Integer turnos;
    private LocalDateTime fecha;

    private Ranking(){

    }

    public Ranking(String nombreJugador, Integer turnos, LocalDateTime fecha) throws IllegalArgumentException{
        this.setNombreJugador(nombreJugador);
        this.setTurnos(turnos);
        this.setFecha(fecha);
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) throws IllegalArgumentException{
        if(nombreJugador == null)
            throw new IllegalArgumentException("Error - Campo jugador no puede ser null");
        if(nombreJugador.equals(""))
            throw new IllegalArgumentException("Error - Campo jugador no puede ser una cadena vacia");
        this.nombreJugador = nombreJugador;
    }

    public Integer getTurnos() {
        return turnos;
    }

    public void setTurnos(Integer turnos)throws IllegalArgumentException {
        if(turnos == null)
            throw new IllegalArgumentException("Error - Turno no puede ser null");
        if(turnos < 0)
            throw new IllegalArgumentException("Error - Turno no puede ser negativo");
        this.turnos = turnos;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) throws IllegalArgumentException{
        if(fecha == null)
            throw new IllegalArgumentException("Error - Fecha no puede ser null");
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ranking{" +
                "nombreJugador='" + nombreJugador + '\'' +
                ", turnos=" + turnos +
                ", fecha=" + fecha +
                '}';
    }
}
