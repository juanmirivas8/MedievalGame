package modelo;

public class Ciudad {
    private Integer poblacion;
    private Double oro;
    private Double estabilidad;
    private Double corrupcion;
    private Double inflacion;
    private Integer soldadesca;
    private Double soldadescaMaxima;
    private Double recuperacionSoldadesca;
    private Double impuestos;
    private Double modificadorEstabilidad;
    private Double modificadorCorrupcion;
    private Double modificadorInflacion;
    private Double mantenimientoAdministracion;
    private Double mantenimientoHacienda;
    private Double mantenimientoFFAA;
    private Double gastos;
    private Double ingresos;

    public Ciudad(){

    }
    public Ciudad(Integer poblacion, Double oro, Double estabilidad, Double corrupcion, Double inflacion
            , Integer soldadesca, Double soldadescaMaxima, Double recuperacionSoldadesca, Double impuestos
            , Double modificadorEstabilidad, Double modificadorCorrupcion, Double modificadorInflacion
            , Double mantenimientoAdministracion, Double mantenimientoHacienda, Double mantenimientoFFAA
            , Double gastos, Double ingresos) {
        this.poblacion = poblacion;
        this.oro = oro;
        this.estabilidad = estabilidad;
        this.corrupcion = corrupcion;
        this.inflacion = inflacion;
        this.soldadesca = soldadesca;
        this.soldadescaMaxima = soldadescaMaxima;
        this.recuperacionSoldadesca = recuperacionSoldadesca;
        this.impuestos = impuestos;
        this.modificadorEstabilidad = modificadorEstabilidad;
        this.modificadorCorrupcion = modificadorCorrupcion;
        this.modificadorInflacion = modificadorInflacion;
        this.mantenimientoAdministracion = mantenimientoAdministracion;
        this.mantenimientoHacienda = mantenimientoHacienda;
        this.mantenimientoFFAA = mantenimientoFFAA;
        this.gastos = gastos;
        this.ingresos = ingresos;
    }

    public Integer getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(Integer poblacion) {
        this.poblacion = poblacion;
    }

    public Double getOro() {
        return oro;
    }

    public void setOro(Double oro) {
        this.oro = oro;
    }

    public Double getEstabilidad() {
        return estabilidad;
    }

    public void setEstabilidad(Double estabilidad) {
        this.estabilidad = estabilidad;
    }

    public Double getCorrupcion() {
        return corrupcion;
    }

    public void setCorrupcion(Double corrupcion) {
        this.corrupcion = corrupcion;
    }

    public Double getInflacion() {
        return inflacion;
    }

    public void setInflacion(Double inflacion) {
        this.inflacion = inflacion;
    }

    public Integer getSoldadesca() {
        return soldadesca;
    }

    public void setSoldadesca(Integer soldadesca) {
        this.soldadesca = soldadesca;
    }

    public Double getSoldadescaMaxima() {
        return soldadescaMaxima;
    }

    public void setSoldadescaMaxima(Double soldadescaMaxima) {
        this.soldadescaMaxima = soldadescaMaxima;
    }

    public Double getRecuperacionSoldadesca() {
        return recuperacionSoldadesca;
    }

    public void setRecuperacionSoldadesca(Double recuperacionSoldadesca) {
        this.recuperacionSoldadesca = recuperacionSoldadesca;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    public Double getModificadorEstabilidad() {
        return modificadorEstabilidad;
    }

    public void setModificadorEstabilidad(Double modificadorEstabilidad) {
        this.modificadorEstabilidad = modificadorEstabilidad;
    }

    public Double getModificadorCorrupcion() {
        return modificadorCorrupcion;
    }

    public void setModificadorCorrupcion(Double modificadorCorrupcion) {
        this.modificadorCorrupcion = modificadorCorrupcion;
    }

    public Double getModificadorInflacion() {
        return modificadorInflacion;
    }

    public void setModificadorInflacion(Double modificadorInflacion) {
        this.modificadorInflacion = modificadorInflacion;
    }

    public Double getMantenimientoAdministracion() {
        return mantenimientoAdministracion;
    }

    public void setMantenimientoAdministracion(Double mantenimientoAdministracion) {
        this.mantenimientoAdministracion = mantenimientoAdministracion;
    }

    public Double getMantenimientoHacienda() {
        return mantenimientoHacienda;
    }

    public void setMantenimientoHacienda(Double mantenimientoHacienda) {
        this.mantenimientoHacienda = mantenimientoHacienda;
    }

    public Double getMantenimientoFFAA() {
        return mantenimientoFFAA;
    }

    public void setMantenimientoFFAA(Double mantenimientoFFAA) {
        this.mantenimientoFFAA = mantenimientoFFAA;
    }

    public Double getGastos() {
        return gastos;
    }

    public void setGastos(Double gastos) {
        this.gastos = gastos;
    }

    public Double getIngresos() {
        return ingresos;
    }

    public void setIngresos(Double ingresos) {
        this.ingresos = ingresos;
    }
}
