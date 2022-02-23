/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import modelo.Conexion;
import java.sql.ResultSet;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author gvalarezo
 */
public class FrmLoginController implements Initializable {
    @FXML
    private TextField txtNombre;
    
    @FXML
    private PasswordField txtContrasena;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void getAcceso(ActionEvent actionEvent) throws Exception{
        System.out.println("usuario " + txtNombre.getText());
        System.out.println("Password " + txtContrasena.getText());
        Conexion con = new Conexion();
        System.out.println("establezco conexion");
        ResultSet rs = con.CONSULTAR("select * from usuario where usuario = '" + txtNombre.getText() + "' and contrasena = '" + txtContrasena.getText() + "'");
        System.out.println("obtengo el rs");
        if (rs.next() == false) {
            System.out.println("Acceso Incorrecto");
        } else {
            System.out.println("Bienvenido al sistema");
            URI uri = Paths.get("src/vista/FrmMenu.fxml").toAbsolutePath().toUri();
            Parent root = FXMLLoader.load(uri.toURL());

            Stage stage = new Stage(); 
            stage.setScene(new Scene(root));  
            stage.show();              
        }
        
    }
    
    public void salir(ActionEvent actionEvent) {
        Node source = (Node) actionEvent.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        stage.close();        
    }
}
