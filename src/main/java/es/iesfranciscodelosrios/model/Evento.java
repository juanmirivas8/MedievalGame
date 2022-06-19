package es.iesfranciscodelosrios.model;

public abstract class Evento {
    protected String enunciado;
    protected String opcionA;
    protected String opcionB;

    public abstract void aplicarEvento(PartidaFX p , Boolean opcion);

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getOpcionA() {
        return opcionA;
    }

    public void setOpcionA(String opcionA) {
        this.opcionA = opcionA;
    }

    public String getOpcionB() {
        return opcionB;
    }

    public void setOpcionB(String opcionB) {
        this.opcionB = opcionB;
    }
}
