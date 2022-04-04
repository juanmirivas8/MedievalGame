package modelo;

import interfaces.ICiudad;

public abstract class Evento {
    protected String descripcion;
    protected Boolean opcion;
    protected ICiudad city;

    protected abstract void trueOpcion();
    protected abstract void falseOpcion();
    public abstract void aplicarEvento();

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) throws IllegalArgumentException{
        if(descripcion == null)
            throw new IllegalArgumentException("Error - Descripcion no puede ser null");
        if(descripcion.equals(""))
            throw new IllegalArgumentException("Error - Descripcion no puede ser una cadena vacia");
        this.descripcion = descripcion;
    }

    public Boolean getOpcion() {
        return opcion;
    }

    public void setOpcion(Boolean opcion) throws IllegalArgumentException{
        if (opcion == null)
            throw new IllegalArgumentException("Opcion no puede ser null");
        this.opcion = opcion;
    }

    public ICiudad getCity() {
        return city;
    }

    public void setCity(ICiudad city) {
        this.city = city;
    }

    @Override
    public String toString(){
        return this.descripcion;
    }

}
