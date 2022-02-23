/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package main;

import java.net.URI;

import java.nio.file.Paths;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author gvalarezo
 */
public class fxMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        URI uri = Paths.get("src/vista/FrmLogin.fxml").toAbsolutePath().toUri();
        Parent root = FXMLLoader.load(uri.toURL());
        
        Scene scene = new Scene(root, 600, 250);
        
        primaryStage.setTitle("Bienvenidos al Sistema");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        //Conexion con = new Conexion();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
