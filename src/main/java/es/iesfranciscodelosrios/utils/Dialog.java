package es.iesfranciscodelosrios.utils;

import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;

import java.util.Optional;

/**
 * Clase que permite mostrar mensajes de alerta y preguntas de texto.
 * @author Juan Miguel Rivas Velasco
 */
public class Dialog {
    /**
     * Muestra un mensaje de error con una ventana de alerta.
     * @param title Titulo de la ventana.
     * @param header Cabecera del mensaje.
     * @param description Descripcion del mensaje.
     */
    public static void showError(String title, String header, String description) {
        showDialog(Alert.AlertType.ERROR, title, header, description);
    }

    /**
     * Muestra un mensaje de Warning con una ventana de alerta.
     * @param title Titulo de la ventana.
     * @param header Cabecera del mensaje.
     * @param description Descripcion del mensaje.
     */
    public static void showWarning(String title, String header, String description) {
        showDialog(Alert.AlertType.WARNING, title, header, description);
    }

    /**
     * Muestra un mensaje de informacion con una ventana de alerta.
     * @param title Titulo de la ventana.
     * @param header Cabecera del mensaje.
     * @param description Descripcion del mensaje.
     */
    public static void showInformation(String title, String header, String description) {
        showDialog(Alert.AlertType.INFORMATION, title, header, description);
    }

    /**
     * Muestra un mensaje de confirmacion con una ventana de alerta.
     * @param title Titulo de la ventana.
     * @param header Cabecera del mensaje.
     * @param description Descripcion del mensaje.
     * @return True si se pulsa Aceptar, false si se pulsa Cancelar.
     */
    public static boolean showConfirmation(String title, String header, String description) {
        return showDialogBoolean(title, header, description);
    }

    /**
     * Muestra una ventana de alerta con un mensaje de pregunta.
     * @param title Titulo de la ventana.
     * @param type Tipo de alerta.
     * @param title Titulo de la ventana.
     * @param header Cabecera del mensaje.
     * @param description Descripcion del mensaje.
     */
    private static void showDialog(Alert.AlertType type, String title, String header, String description) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(description);
        alert.showAndWait();
    }

    /**
     * Muestra un mensaje de confirmacion con una ventana de alerta.
     * @param title Titulo de la ventana.
     * @param header Cabecera del mensaje.
     * @param description Descripcion del mensaje.
     * @return True si se pulsa Aceptar, false si se pulsa Cancelar.
     */
    private static boolean showDialogBoolean(String title, String header, String description) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(description);
        alert.showAndWait();
        return alert.getResult().getButtonData().isDefaultButton();
    }

    /**
     * This dialog shows a textfield and return the text that user puts in
     *
     * @param title       title of the dialog
     * @param header      the content of the dialog
     * @param description the description of the dialog
     * @return null if closed or press Cancel, otherwhise the string that user input
     */

    public static String showDialogString(String title, String header, String description, String prevValue) {
        TextInputDialog dialog = new TextInputDialog(prevValue);
        dialog.setTitle(title);
        dialog.setHeaderText(header);
        dialog.setContentText(description);
        Optional<String> result = dialog.showAndWait();
        return result.orElse(null);
    }
}
