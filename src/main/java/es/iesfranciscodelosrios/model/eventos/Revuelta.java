package es.iesfranciscodelosrios.model.eventos;

import es.iesfranciscodelosrios.model.Evento;
import es.iesfranciscodelosrios.model.PartidaFX;

public class Revuelta extends Evento {
    public Revuelta() {
        enunciado = "Hay una revuelta en la ciudad. ¿Qué hacer?";
        opcionA = "Mitigar la revuelta - Pierdes 10 soldados";
        opcionB = "Dejarlo estar - -0.1 al cambio de estabilidad cada turno";
    }
    @Override
    public void aplicarEvento(PartidaFX p, Boolean opcion) {
        if(opcion){
            p.soldados.set(p.soldados.get() - 10);
        }else{
            p.estabilidadCambio.set(p.estabilidadCambio.get() - 0.1);
        }
    }
}
