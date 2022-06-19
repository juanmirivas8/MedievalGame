package es.iesfranciscodelosrios.controllers;

import es.iesfranciscodelosrios.model.Partida;
import es.iesfranciscodelosrios.model.PartidaDAO;
import es.iesfranciscodelosrios.model.PartidaFX;
import es.iesfranciscodelosrios.utils.Utils;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.util.logging.Level;

public class PartidaController extends Controller{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    @FXML
    Label lb_taberna,lb_cuartel,lb_hospital,lb_escuela,lb_iglesia,lb_banco,lb_poblacion,lb_poblacionCambio, lb_corrupcion,lb_corrupcionCambio,lb_estabilidad,
            lb_estabilidadCambio,lb_dinero,lb_dineroCambio,lb_inflacion,lb_inflacionCambio,lb_soldados,lb_soldadosCambio,lb_turnos,lb_titulo;
    @FXML
    Slider sld_adm,sld_soc,sld_mil;

    @FXML
    Button btn_tabernaComprar,btn_tabernaVender,btn_cuartelComprar,btn_cuartelVender,btn_hospitalComprar,btn_hospitalVender,btn_escuelaComprar,
            btn_escuelaVender,btn_iglesiaComprar,btn_iglesiaVender,btn_bancoComprar,btn_bancoVender, btn_nextTurn,btn_exit,btn_save,btn_opcionA,btn_opcionB;

    @FXML
    protected void initialize(){

        btn_exit.setOnAction(actionEvent -> {
            App.loadScene(new Stage(),"loggedMenu","Medieval Game",false,false);
            App.closeScene((Stage)btn_exit.getScene().getWindow());
        });

        btn_save.setOnAction(actionEvent -> {
            Partida p = activePartidaFX.generatePartida();
            String nuevoNombre = Utils.showDialogString((Stage) btn_save.getScene().getWindow(),"Guardar partida",
                    "Introduce el nombre de la partida","",100);
            p.setNombre(nuevoNombre);
            activeUser.getPartidas().add(p);
            partidas.insert(p);
            App.loadScene(new Stage(),"loggedMenu","Medieval Game",false,false);
            App.closeScene((Stage)btn_exit.getScene().getWindow());
        });
        lb_poblacion.textProperty().bind(activePartidaFX.poblacion.asString());
        lb_corrupcion.textProperty().bind(activePartidaFX.corrupcion.asString());
        lb_estabilidad.textProperty().bind(activePartidaFX.estabilidad.asString());
        lb_dinero.textProperty().bind(activePartidaFX.dinero.asString());
        lb_inflacion.textProperty().bind(activePartidaFX.inflacion.asString());
        lb_soldados.textProperty().bind(activePartidaFX.soldados.asString());
        lb_turnos.textProperty().bind(activePartidaFX.turnos.asString());
        lb_taberna.textProperty().bind(activePartidaFX.tabernas.asString());
        lb_cuartel.textProperty().bind(activePartidaFX.cuarteles.asString());
        lb_hospital.textProperty().bind(activePartidaFX.hospitales.asString());
        lb_escuela.textProperty().bind(activePartidaFX.escuelas.asString());
        lb_iglesia.textProperty().bind(activePartidaFX.iglesias.asString());
        lb_banco.textProperty().bind(activePartidaFX.bancos.asString());


        btn_bancoComprar.setOnAction(actionEvent -> {
            if(activePartidaFX.dinero.getValue() >= 1000){
                activePartidaFX.dinero.setValue(activePartidaFX.dinero.getValue() - 1000);
                activePartidaFX.bancos.setValue(activePartidaFX.bancos.getValue() + 1);
            }
        });
        btn_bancoVender.setOnAction(actionEvent -> {
           if(activePartidaFX.bancos.get() > 0){
               activePartidaFX.bancos.set(activePartidaFX.bancos.get() - 1);
               activePartidaFX.dinero.set(activePartidaFX.dinero.get() + 500);
           }
        });
        btn_cuartelComprar.setOnAction(actionEvent -> {
            if(activePartidaFX.dinero.getValue() >= 1000){
                activePartidaFX.dinero.setValue(activePartidaFX.dinero.getValue() - 1000);
                activePartidaFX.cuarteles.setValue(activePartidaFX.cuarteles.getValue() + 1);
            }
        });
        btn_cuartelVender.setOnAction(actionEvent -> {
            if (activePartidaFX.cuarteles.get() > 0) {
                activePartidaFX.cuarteles.set(activePartidaFX.cuarteles.get() - 1);
                activePartidaFX.dinero.set(activePartidaFX.dinero.get() + 500);
            }
        });
        btn_escuelaComprar.setOnAction(actionEvent -> {
            if(activePartidaFX.dinero.getValue() >= 1000){
                activePartidaFX.dinero.setValue(activePartidaFX.dinero.getValue() - 1000);
                activePartidaFX.escuelas.setValue(activePartidaFX.escuelas.getValue() + 1);
            }
        });
        btn_escuelaVender.setOnAction(actionEvent -> {
           if (activePartidaFX.escuelas.get() > 0) {
               activePartidaFX.escuelas.set(activePartidaFX.escuelas.get() - 1);
               activePartidaFX.dinero.set(activePartidaFX.dinero.get() + 500);
           }
        });
        btn_hospitalComprar.setOnAction(actionEvent -> {
            if(activePartidaFX.dinero.getValue() >= 1000){
                activePartidaFX.dinero.setValue(activePartidaFX.dinero.getValue() - 1000);
                activePartidaFX.hospitales.setValue(activePartidaFX.hospitales.getValue() + 1);
            }
        });
        btn_hospitalVender.setOnAction(actionEvent -> {
            if(activePartidaFX.hospitales.get() > 0){
                activePartidaFX.hospitales.set(activePartidaFX.hospitales.get() - 1);
                activePartidaFX.dinero.set(activePartidaFX.dinero.get() + 500);
            }
        });
        btn_iglesiaComprar.setOnAction(actionEvent -> {
            if(activePartidaFX.dinero.getValue() >= 1000){
                activePartidaFX.dinero.setValue(activePartidaFX.dinero.getValue() - 1000);
                activePartidaFX.iglesias.setValue(activePartidaFX.iglesias.getValue() + 1);
            }
        });
        btn_iglesiaVender.setOnAction(actionEvent -> {
            if (activePartidaFX.iglesias.get() > 0) {
                activePartidaFX.iglesias.set(activePartidaFX.iglesias.get() - 1);
                activePartidaFX.dinero.set(activePartidaFX.dinero.get() + 500);
            }
        });
        btn_tabernaComprar.setOnAction(actionEvent -> {
            if(activePartidaFX.dinero.getValue() >= 1000){
                activePartidaFX.dinero.setValue(activePartidaFX.dinero.getValue() - 1000);
                activePartidaFX.tabernas.setValue(activePartidaFX.tabernas.getValue() + 1);
            }
        });
        btn_tabernaVender.setOnAction(actionEvent -> {
            if(activePartidaFX.tabernas.get() > 0){
                activePartidaFX.tabernas.set(activePartidaFX.tabernas.get() - 1);
                activePartidaFX.dinero.set(activePartidaFX.dinero.get() + 500);
            }

        });

        lb_dineroCambio.textProperty().bind(Bindings.createStringBinding(()->{
            return String.format("%.2f",-(sld_adm.valueProperty().getValue()+sld_mil.valueProperty().getValue()+sld_soc.valueProperty().getValue()
            )-(sld_adm.valueProperty().getValue()+sld_mil.valueProperty().getValue()+sld_soc.valueProperty().getValue()
            )*activePartidaFX.inflacion.get() + (activePartidaFX.poblacion.getValue()*(activePartidaFX.impuestos.getValue()+activePartidaFX.tabernas.getValue()*0.01)));
        },sld_adm.valueProperty(),sld_soc.valueProperty(),sld_mil.valueProperty(),activePartidaFX.tabernas));

       lb_poblacionCambio.textProperty().bind(Bindings.createStringBinding(()->{
           return String.format("%.2f",activePartidaFX.poblacion.getValue()*(activePartidaFX.poblacionCambio.getValue()+activePartidaFX.hospitales.getValue()*0.01));
       },activePartidaFX.poblacionCambio,activePartidaFX.hospitales));

       lb_corrupcionCambio.textProperty().bind(Bindings.createStringBinding(()-> {
           return String.format("%.2f",-0.01*activePartidaFX.escuelas.getValue() - sld_adm.valueProperty().getValue()/1000);
               },activePartidaFX.escuelas,sld_adm.valueProperty()));

        lb_estabilidadCambio.textProperty().bind(Bindings.createStringBinding(()->{
            return String.format("%.2f",0.01*activePartidaFX.iglesias.getValue() + sld_soc.valueProperty().getValue()/1000);
        },activePartidaFX.iglesias,sld_soc.valueProperty()));

        lb_inflacionCambio.textProperty().bind(Bindings.createStringBinding(()->{
            return String.format("%.2f",activePartidaFX.inflacionCambio.getValue() - activePartidaFX.bancos.getValue()*0.01);
        },activePartidaFX.inflacionCambio,activePartidaFX.bancos));

        lb_soldadosCambio.textProperty().bind(Bindings.createStringBinding(()->{
            return String.format("%.2f",0.01*activePartidaFX.cuarteles.getValue() + sld_mil.valueProperty().getValue()/1000);
        },activePartidaFX.cuarteles,sld_mil.valueProperty()));

        btn_nextTurn.setOnAction(actionEvent -> {
          activePartidaFX.turnos.set(activePartidaFX.turnos.get() + 1);
          activePartidaFX.dinero.set(Double.parseDouble(String.format("%.2f",activePartidaFX.dinero.get() + Double.parseDouble(lb_dineroCambio.textProperty().getValue()))));
          activePartidaFX.poblacion.set(Double.parseDouble(String.format("%.2f",activePartidaFX.poblacion.get() + Double.parseDouble(lb_poblacionCambio.textProperty().getValue()))));
          activePartidaFX.corrupcion.set(Double.parseDouble(String.format("%.2f",activePartidaFX.corrupcion.get() + Double.parseDouble(lb_corrupcionCambio.textProperty().getValue()))));
          activePartidaFX.inflacion.set(Double.parseDouble(String.format("%.2f",activePartidaFX.inflacion.get() + Double.parseDouble(lb_inflacionCambio.textProperty().getValue()))));
          activePartidaFX.estabilidad.set(Double.parseDouble(String.format("%.2f",activePartidaFX.estabilidad.get() + Double.parseDouble(lb_estabilidadCambio.textProperty().getValue()))));
          activePartidaFX.soldados.set(Double.parseDouble(String.format("%.2f",activePartidaFX.soldados.get() + Double.parseDouble(lb_soldadosCambio.textProperty().getValue()))));

        });
        Platform.runLater(()-> Utils.closeRequest((Stage)btn_exit.getScene().getWindow()));
    }
}
