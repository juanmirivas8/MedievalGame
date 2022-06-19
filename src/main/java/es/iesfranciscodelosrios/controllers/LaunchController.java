package es.iesfranciscodelosrios.controllers;

import es.iesfranciscodelosrios.model.Usuario;

import es.iesfranciscodelosrios.utils.Utils;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.logging.Level;


public class LaunchController extends Controller {

    public LaunchController(){
        super();
    }

    @FXML
    private Button btn_login;

    @FXML
    private Button btn_register;

    @FXML
    private TextField txt_user_login;

    @FXML
    private TextField txt_user_register;

    @FXML
    private PasswordField txt_pw_login;

    @FXML
    private PasswordField txt_pw_register;


    @FXML
    protected void initialize(){
        btn_login.setOnAction(actionEvent -> {
            String nickname = txt_user_login.getText();
            String password = Utils.encryptSHA256(txt_pw_login.getText());
            txt_user_login.setText("");
            txt_pw_login.setText("");

            if(nickname.equals("") || password.equals("")){
                Alert alertDialog = new Alert(Alert.AlertType.ERROR);
                alertDialog.setTitle("Inicio de Sesión fallido");
                alertDialog.setHeaderText("Campos vacios");
                alertDialog.setContentText("Por favor no deje los campos sin rellenar");
                alertDialog.show();
                Stage s =(Stage)alertDialog.getDialogPane().getScene().getWindow();
                s.toFront();
            }else{
                Usuario user = users.identify(nickname,password);
                Log.log(Level.SEVERE, String.valueOf(user.getPartidas().size()));
                if (user != null){
                    activeUser = user;
                    App.loadScene(new Stage(),"loggedMenu","Medieval Game",false,false);
                    App.closeScene((Stage)btn_login.getScene().getWindow());
                }else{
                    Alert alertDialog = new Alert(Alert.AlertType.ERROR);
                    alertDialog.setTitle("Inicio de Sesión fallido");
                    alertDialog.setHeaderText("Credenciales no válidas");
                    alertDialog.setContentText("El usuario no existe o la contraseña es incorrecta");
                    alertDialog.show();
                    Stage s =(Stage)alertDialog.getDialogPane().getScene().getWindow();
                    s.toFront();
                }
            }
        });

        btn_register.setOnAction(actionEvent -> {
            String nickname = txt_user_register.getText();
            String password = Utils.encryptSHA256(txt_pw_register.getText());
            txt_user_register.setText("");
            txt_pw_register.setText("");
            if(nickname.equals("") || password.equals("")){
                Alert alertDialog = new Alert(Alert.AlertType.ERROR);
                alertDialog.setTitle("Registro fallido");
                alertDialog.setHeaderText("Campos vacios");
                alertDialog.setContentText("Por favor no deje los campos sin rellenar");
                alertDialog.show();
                Stage s =(Stage)alertDialog.getDialogPane().getScene().getWindow();
                s.toFront();
            }else{
            Usuario user = new Usuario(nickname,password,null,null);

            Boolean res = users.insert(user);


            if (res){
                Alert alertDialog = new Alert(Alert.AlertType.INFORMATION);
                alertDialog.setTitle("Registro Correcto");
                alertDialog.setHeaderText("Registro Correcto");
                alertDialog.setContentText("Dirijase a la pestaña de inicio para iniciar sesión con sus credenciales");
                alertDialog.show();
                Stage s =(Stage)alertDialog.getDialogPane().getScene().getWindow();
                s.toFront();
            }else{
                Alert alertDialog = new Alert(Alert.AlertType.ERROR);
                alertDialog.setTitle("Registro fallido");
                alertDialog.setHeaderText("Nombre ya existe");
                alertDialog.setContentText("El nombre que ha escogido ya existe");
                alertDialog.show();
                Stage s =(Stage)alertDialog.getDialogPane().getScene().getWindow();
                s.toFront();
            }}
        });
        Utils.addTextLimiter(txt_user_login,30);
        Utils.addTextLimiter(txt_user_register,30);
        Platform.runLater(()->Utils.closeRequest((Stage)btn_login.getScene().getWindow()));
    }


}
