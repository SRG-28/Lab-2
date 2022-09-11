/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfinal; //Equivalente a Controller

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import View.*;
import Model.*;
/**
 *
 * @author sofia
 */
public class LabFinal extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Login.main(args);
    }
      public String getMessage() {
        try {
            Modelo model = new Modelo();
            return model.getData();
        } catch (Exception er) {
            return "There was an error.";
        }
    }
    
    public boolean writeMessage(String message) {
        try {
            Modelo model = new Modelo();
            return model.writeData(message);
        } catch (Exception er) {
            return false;
        }
    }
     public String getLogin() {
        try {
            ModelLogin modelo = new ModelLogin();
            return modelo.getLogin();
        } catch (Exception er) {
            return "There was an error.";
        }
    }
}
