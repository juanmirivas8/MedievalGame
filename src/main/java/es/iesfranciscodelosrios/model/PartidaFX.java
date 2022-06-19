package es.iesfranciscodelosrios.model;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class PartidaFX {
    public SimpleIntegerProperty turnos,tabernas,cuarteles,hospitales,escuelas,iglesias,bancos,id,userid;
    public SimpleDoubleProperty poblacion,poblacionCambio,corrupcion,corrupcionCambio,estabilidad,estabilidadCambio,dinero,
            impuestos, inflacion,inflacionCambio,soldados,soldadosCambio;
    public SimpleStringProperty nombre;
    public Usuario usuario;

    public PartidaFX(Partida p) {
        turnos = new SimpleIntegerProperty(p.getTurnos());
        tabernas = new SimpleIntegerProperty(p.getTabernas());
        cuarteles = new SimpleIntegerProperty(p.getCuarteles());
        hospitales = new SimpleIntegerProperty(p.getHospitales());
        escuelas = new SimpleIntegerProperty(p.getEscuelas());
        iglesias = new SimpleIntegerProperty(p.getIglesias());
        bancos = new SimpleIntegerProperty(p.getBancos());
        id = new SimpleIntegerProperty(p.getId());
        userid = new SimpleIntegerProperty(p.getUserid());
        poblacion = new SimpleDoubleProperty(p.getPoblacion());
        poblacionCambio = new SimpleDoubleProperty(p.getPoblacionCambio());
        corrupcion = new SimpleDoubleProperty(p.getCorrupcion());
        corrupcionCambio = new SimpleDoubleProperty(p.getCorrupcionCambio());
        estabilidad = new SimpleDoubleProperty(p.getEstabilidad());
        estabilidadCambio = new SimpleDoubleProperty(p.getEstabilidadCambio());
        dinero = new SimpleDoubleProperty(p.getDinero());
        impuestos = new SimpleDoubleProperty(p.getImpuestos());
        inflacion = new SimpleDoubleProperty(p.getInflacion());
        inflacionCambio = new SimpleDoubleProperty(p.getInflacionCambio());
        soldados = new SimpleDoubleProperty(p.getSoldados());
        soldadosCambio = new SimpleDoubleProperty(p.getSoldadosCambio());
        nombre = new SimpleStringProperty(p.getNombre());
        usuario = p.getUsuario();
    }

    public Partida generatePartida() {
        Partida p = new Partida();
        p.setTurnos(turnos.get());
        p.setTabernas(tabernas.get());
        p.setCuarteles(cuarteles.get());
        p.setHospitales(hospitales.get());
        p.setEscuelas(escuelas.get());
        p.setIglesias(iglesias.get());
        p.setBancos(bancos.get());
        p.setId(id.get());
        p.setUserid(userid.get());
        p.setPoblacion(poblacion.get());
        p.setPoblacionCambio(poblacionCambio.get());
        p.setCorrupcion(corrupcion.get());
        p.setCorrupcionCambio(corrupcionCambio.get());
        p.setEstabilidad(estabilidad.get());
        p.setEstabilidadCambio(estabilidadCambio.get());
        p.setDinero(dinero.get());
        p.setImpuestos(impuestos.get());
        p.setInflacion(inflacion.get());
        p.setInflacionCambio(inflacionCambio.get());
        p.setSoldados(soldados.get());
        p.setSoldadosCambio(soldadosCambio.get());
        p.setNombre(nombre.get());
        p.setUsuario(usuario);
        return p;
    }
}
