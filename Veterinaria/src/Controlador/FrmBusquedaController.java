/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controlador;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Paths;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author gvalarezo
 */
public class FrmBusquedaController implements Initializable {
    @FXML  
    private GridPane grdBusqueda;
    
    @FXML
    private TextField txtBuscar;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            

            if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("ironman")) {
                URI uri1 = Paths.get("src/resource/ironman.jpg").toAbsolutePath().toUri();
                Image img1 = new Image(uri1.toURL().toString());                
                ImageView imgv1 = new ImageView(img1);
                imgv1.setFitHeight(100);
                imgv1.setFitWidth(100);
                grdBusqueda.add(imgv1, 0, 0);
                
            }
            if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("spiderman")) {
                URI uri1 = Paths.get("src/resource/spiderman.jpeg").toAbsolutePath().toUri();
                Image img1 = new Image(uri1.toURL().toString());                
                ImageView imgv1 = new ImageView(img1);
                imgv1.setFitHeight(100);
                imgv1.setFitWidth(100);
                grdBusqueda.add(imgv1, 1, 0);
            }            
            if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("superman")) {
                URI uri1 = Paths.get("src/resource/superman.jpg").toAbsolutePath().toUri();
                Image img1 = new Image(uri1.toURL().toString());                
                ImageView imgv1 = new ImageView(img1);
                imgv1.setFitHeight(100);
                imgv1.setFitWidth(100);
                grdBusqueda.add(imgv1, 2, 0);
                
            }            
            // TODO
        } catch (MalformedURLException ex) {
            Logger.getLogger(FrmBusquedaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    public void getHeroe(ActionEvent actionEvent){
        try {
            grdBusqueda.getChildren().clear();

            if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("ironman")) {
                URI uri1 = Paths.get("src/resource/ironman.jpg").toAbsolutePath().toUri();
                Image img1 = new Image(uri1.toURL().toString());                
                ImageView imgv1 = new ImageView(img1);
                imgv1.setFitHeight(100);
                imgv1.setFitWidth(100);
                grdBusqueda.add(imgv1, 0, 0);
                
            }
            if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("spiderman")) {
                URI uri1 = Paths.get("src/resource/spiderman.jpeg").toAbsolutePath().toUri();
                Image img1 = new Image(uri1.toURL().toString());                
                ImageView imgv1 = new ImageView(img1);
                imgv1.setFitHeight(100);
                imgv1.setFitWidth(100);
                grdBusqueda.add(imgv1, 1, 0);
            }            
            if (txtBuscar.getText().isEmpty() || txtBuscar.getText().equalsIgnoreCase("superman")) {
                URI uri1 = Paths.get("src/resource/superman.jpg").toAbsolutePath().toUri();
                Image img1 = new Image(uri1.toURL().toString());                
                ImageView imgv1 = new ImageView(img1);
                imgv1.setFitHeight(100);
                imgv1.setFitWidth(100);
                grdBusqueda.add(imgv1, 2, 0);
                
            }            
        } catch (MalformedURLException ex) {
            Logger.getLogger(FrmBusquedaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
