/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author epin
 */
public class FrmMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void getBuscar(ActionEvent actionEvent) throws Exception{
        URI uri = Paths.get("src/vista/FrmBusqueda.fxml").toAbsolutePath().toUri();
        Parent root = FXMLLoader.load(uri.toURL());

        Stage stage = new Stage();
        stage.setScene(new Scene(root));  
        stage.show();        
    }
    public void getIngresar(ActionEvent actionEvent) throws Exception {
        URI uri = Paths.get("src/vista/FrmIngresar.fxml").toAbsolutePath().toUri();
        Parent root = FXMLLoader.load(uri.toURL());

        Stage stage = new Stage();
        stage.setScene(new Scene(root));  
        stage.show();         
    }
}
