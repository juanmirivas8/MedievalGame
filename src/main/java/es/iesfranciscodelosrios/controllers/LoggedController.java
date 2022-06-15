package es.iesfranciscodelosrios.controllers;

import es.iesfranciscodelosrios.utils.Utils;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class LoggedController extends Controller {

    @FXML
    Button btn_cerrarSesion;

    @FXML
    Button btn_nuevaPartida;

    @FXML
    protected void initialize(){
        btn_cerrarSesion.setOnAction(actionEvent -> {
            activeUser = null;
            App.loadScene(new Stage(),"launch","Bienvenido a Medieval Game",false,false);
            App.closeScene((Stage)btn_cerrarSesion.getScene().getWindow());
        });

        Platform.runLater(()-> Utils.closeRequest((Stage)btn_cerrarSesion.getScene().getWindow()));
    }
}
