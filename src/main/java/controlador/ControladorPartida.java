package controlador;
import modelo.Evento;
import java.util.ArrayList;

public class ControladorPartida {
    private ArrayList<modelo.Evento> eventos;

    public ControladorPartida(){
        eventos = new ArrayList<>();

        eventos.add(new modelo.eventos.corruption1());
    }

}
