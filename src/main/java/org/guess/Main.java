package org.guess;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    //Cargar configuraciones Iniciales
    public void init() {
        
    }
    //Cargar metodos UI
     public void start(Stage PrimerEscenario) {

        StackPane root=new StackPane();
        Scene escenario=new Scene(root,500,500);

        PrimerEscenario.setScene(escenario);
        PrimerEscenario.setTitle("Animalia");
        PrimerEscenario.show();
     }
     //Operaciones de finalizacion de la aplicacion
     public void Stop() {
        
    }




    public static void main(String[] args) {
        //metodo que permite lanzar la ventana inicial
        launch(args);
    }
}
