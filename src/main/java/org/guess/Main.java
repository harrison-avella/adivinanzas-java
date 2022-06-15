package org.guess;

import java.io.InputStream;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    //Cargar configuraciones Iniciales
    public void init() {
        
    }
    //Cargar metodos UI
     public void start(Stage PrimerEscenario) {

        //Se crean objetos visuales y se ajusta su tamaño
        Label Bienvenida=new Label("Bienvenido a Animalia");
        Bienvenida.setFont(new Font(30));

        Label NombreUsuario=new Label("Escriba su Nombre");
        NombreUsuario.setFont(new Font(15));

        Label VidaUsuario=new Label("Numero de vidas actuales");
        VidaUsuario.setFont(new Font(15));

        Label numVidasUsuario= new Label("3");
        numVidasUsuario.setFont(new Font(15));

        Button btnAgregarNombre=new Button("Registrar Nombre");
        btnAgregarNombre.setMaxWidth(150);
        btnAgregarNombre.setCursor(Cursor.HAND);

        //se cren campos de texto
        TextField txtNombreUsuario= new TextField();
        txtNombreUsuario.setMaxWidth(150);

        //Se crea imagen para cargar
        ImageView ImagenVida;
        InputStream inputStream;
        inputStream= getClass().getResourceAsStream("/Imagenes/Corazones.jpg");
        Image image = new Image(inputStream);

        ImagenVida=new ImageView(image);
        ImagenVida.setFitWidth(150);
        ImagenVida.setPreserveRatio(true);


        //Se crea contenedor raiz 
        VBox root=new VBox();
        Scene escenario=new Scene(root,500,500);

        //Se establces los nodos u objetos visuales en el contenedor raiz
        root.getChildren().addAll(Bienvenida,NombreUsuario,txtNombreUsuario,VidaUsuario,ImagenVida,numVidasUsuario,btnAgregarNombre);
        root.setBackground(new Background(new BackgroundFill(Color.WHITE,CornerRadii.EMPTY,Insets.EMPTY)));
        root.setAlignment(Pos.CENTER);

        //se establece margenes para cada objeto
        VBox.setMargin(Bienvenida, new Insets(20));
        VBox.setMargin(NombreUsuario, new Insets(10));
        VBox.setMargin(VidaUsuario, new Insets(10));
        VBox.setMargin(txtNombreUsuario, new Insets(10));
        VBox.setMargin(numVidasUsuario, new Insets(10));
        VBox.setMargin(btnAgregarNombre, new Insets(10));


        //se muestra la escena generada
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
