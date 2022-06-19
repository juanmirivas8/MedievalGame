package es.iesfranciscodelosrios.controllers;

import es.iesfranciscodelosrios.model.Partida;
import es.iesfranciscodelosrios.model.PartidaFX;
import es.iesfranciscodelosrios.utils.Utils;
import javafx.application.Platform;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class LoggedController extends Controller {

    @FXML
    Button btn_cerrarSesion;

    @FXML
    Button btn_nuevaPartida;

    @FXML
    Button btn_cargar;

    @FXML
    Button btn_eliminar;
    @FXML
    TableView tb;

    @FXML
    TableColumn<Partida,String> tc_nombre;

   @FXML
   TableColumn<Partida,String> tc_turnos;



    @FXML
    protected void initialize(){
        activePartidaFX = null;
        activePartida = null;
        ObservableList<Partida> p = FXCollections.observableList(activeUser.getPartidas());
        tb.setItems(p);
        tc_turnos.setCellValueFactory(each -> new SimpleStringProperty(each.getValue().getTurnos().toString()));
        tc_nombre.setCellValueFactory(each -> new SimpleStringProperty(each.getValue().getNombre()));
        btn_cerrarSesion.setOnAction(actionEvent -> {
            activeUser = null;
            App.loadScene(new Stage(),"launch","Bienvenido a Medieval Game",false,false);
            App.closeScene((Stage)btn_cerrarSesion.getScene().getWindow());
        });

        btn_nuevaPartida.setOnAction(actionEvent -> {
            Partida newPartida = new Partida();
            newPartida.setUsuario(activeUser);
            newPartida.setUserid(activeUser.getId());
            newPartida.setId(-1);
            activePartida = newPartida;
            activePartidaFX = new PartidaFX(activePartida);
            App.loadScene(new Stage(),"partida","Partida",false,false);
            App.closeScene((Stage)btn_cerrarSesion.getScene().getWindow());
        });

        btn_cargar.setOnAction(actionEvent -> {
           if(tb.getSelectionModel().getSelectedItem() != null){
               activePartida = (Partida) tb.getSelectionModel().getSelectedItem();
               activePartidaFX = new PartidaFX(activePartida);
               App.loadScene(new Stage(),"partida","Partida",false,false);
               App.closeScene((Stage)btn_cerrarSesion.getScene().getWindow());
           }
        });

        btn_eliminar.setOnAction(actionEvent -> {
            if(tb.getSelectionModel().getSelectedItem() != null){
                partidas.eliminar(((Partida)tb.getSelectionModel().getSelectedItem()).getId());
                p.remove(tb.getSelectionModel().getSelectedItem());
            }
        });

        Platform.runLater(()-> Utils.closeRequest((Stage)btn_cerrarSesion.getScene().getWindow()));
    }
}
