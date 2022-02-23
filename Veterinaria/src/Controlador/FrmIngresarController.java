/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import modelo.Conexion;

/**
 * FXML Controller class
 *
 * @author gvalarezo
 */
public class FrmIngresarController implements Initializable {
    @FXML
    private TextField txtEditor;
    
    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtAlter;
    
    @FXML
    private TextField txtPrimera;

    @FXML
    private TextField txtPersonaje;    
            ;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void guardar(ActionEvent actionEvent) throws SQLException{
        Conexion con = new Conexion();
        con.GUARDAR("INSERT INTO HEROES (editor, nombre, alterego, primera, personaje) values ('" + txtEditor.getText() + "', '" + 
                     txtNombre.getText() + "', '" + 
                     txtAlter.getText()  + "', '" +
                     txtPrimera.getText() + "', '" +
                     txtPersonaje.getText() + "')"
        );
    }
}
