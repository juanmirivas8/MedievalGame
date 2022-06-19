package es.iesfranciscodelosrios.model.eventos;

import es.iesfranciscodelosrios.model.Evento;
import es.iesfranciscodelosrios.model.PartidaFX;

public class Bancarrota extends Evento {
    public Bancarrota() {
        enunciado = "Un banco está a punto de colapsar. ¿Qué hacer?";
        opcionA = "Salvar el banco - Pierdes 1000 oro";
        opcionB = "No es nuestro asunto - Inflacion sube 20 puntos";
    }
    @Override
    public void aplicarEvento(PartidaFX p, Boolean opcion) {
        if(opcion){
            p.dinero.set(p.dinero.get() - 1000);
        }else{
            p.inflacion.set(p.inflacion.get() + 20);
        }
    }
}
