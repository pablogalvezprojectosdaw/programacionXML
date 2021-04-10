package com.pablogalvezrodriguez.proyectoxml;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var scene = new Scene(new StackPane(), 640, 480);
        stage.setScene(scene);
        stage.show();
        
        Videojuego videojuego = new Videojuego("1234","Super Smash Bros. Ultimate","Lucha","Sora LTD.", "Nintendo", 60.00);
        try {
            JAXBContext contexto = JAXBContext.newInstance(Videojuego.class) ;
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
            marshaller.marshal(videojuego, System.out);
        } catch (JAXBException ex) {
            System.out.println("Error" + ex.toString());
        }
        
    }

    public static void main(String[] args) {
        launch();
    }

}