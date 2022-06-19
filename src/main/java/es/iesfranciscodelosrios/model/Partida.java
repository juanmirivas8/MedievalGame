package es.iesfranciscodelosrios.model;



public class Partida {
    private Integer turnos,tabernas,cuarteles,hospitales,escuelas,iglesias,bancos,id,userid;
    private Double poblacion,poblacionCambio,corrupcion,corrupcionCambio,estabilidad,estabilidadCambio,dinero,
           impuestos, inflacion,inflacionCambio,soldados,soldadosCambio;
    private String nombre;
    private Usuario usuario;

    public Partida(){
        turnos = 0;
        poblacion = 10000.0;
        poblacionCambio = 0.05;
        corrupcion = 0.0;
        corrupcionCambio = 0.01;
        estabilidad = 100.0;
        estabilidadCambio = 0.01;
        dinero = 10000.0;
        impuestos = 0.1;
        inflacion = 0.0;
        inflacionCambio = 0.1;
        soldados = 100.0;
        soldadosCambio = 0.1;
        tabernas = 0;
        cuarteles = 0;
        hospitales = 0;
        escuelas = 0;
        iglesias = 0;
        bancos = 0;
        nombre = "default";
        userid = 1;
    }

    public Integer getTurnos() {
        return turnos;
    }

    public void setTurnos(Integer turnos) {
        this.turnos = turnos;
    }

    public Double getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Double poblacion) {
        this.poblacion = poblacion;
    }

    public Double getPoblacionCambio() {
        return poblacionCambio;
    }

    public void setPoblacionCambio(Double poblacionCambio) {
        this.poblacionCambio = poblacionCambio;
    }

    public Double getCorrupcion() {
        return corrupcion;
    }

    public void setCorrupcion(Double corrupcion) {
        this.corrupcion = corrupcion;
    }

    public Double getCorrupcionCambio() {
        return corrupcionCambio;
    }

    public void setCorrupcionCambio(Double corrupcionCambio) {
        this.corrupcionCambio = corrupcionCambio;
    }

    public Double getEstabilidad() {
        return estabilidad;
    }

    public void setEstabilidad(Double estabilidad) {
        this.estabilidad = estabilidad;
    }

    public Double getEstabilidadCambio() {
        return estabilidadCambio;
    }

    public void setEstabilidadCambio(Double estabilidadCambio) {
        this.estabilidadCambio = estabilidadCambio;
    }

    public Double getDinero() {
        return dinero;
    }

    public void setDinero(Double dinero) {
        this.dinero = dinero;
    }
    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public Double getInflacion() {
        return inflacion;
    }

    public void setInflacion(Double inflacion) {
        this.inflacion = inflacion;
    }

    public Double getInflacionCambio() {
        return inflacionCambio;
    }

    public void setInflacionCambio(Double inflacionCambio) {
        this.inflacionCambio = inflacionCambio;
    }

    public Double getSoldados() {
        return soldados;
    }

    public void setSoldados(Double soldados) {
        this.soldados = soldados;
    }

    public Double getSoldadosCambio() {
        return soldadosCambio;
    }

    public void setSoldadosCambio(Double soldadosCambio) {
        this.soldadosCambio = soldadosCambio;
    }

    public Integer getTabernas() {
        return tabernas;
    }

    public void setTabernas(Integer tabernas) {
        this.tabernas = tabernas;
    }

    public Integer getCuarteles() {
        return cuarteles;
    }

    public void setCuarteles(Integer cuarteles) {
        this.cuarteles = cuarteles;
    }

    public Integer getHospitales() {
        return hospitales;
    }

    public void setHospitales(Integer hospitales) {
        this.hospitales = hospitales;
    }

    public Integer getEscuelas() {
        return escuelas;
    }

    public void setEscuelas(Integer escuelas) {
        this.escuelas = escuelas;
    }

    public Integer getIglesias() {
        return iglesias;
    }

    public void setIglesias(Integer iglesias) {
        this.iglesias = iglesias;
    }

    public Integer getBancos() {
        return bancos;
    }

    public void setBancos(Integer bancos) {
        this.bancos = bancos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
