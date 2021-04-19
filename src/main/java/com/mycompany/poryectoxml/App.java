package com.mycompany.poryectoxml;

import java.time.LocalDate;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
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
        StackPane root = new StackPane();
        var scene = new Scene(root, 640, 480);
        stage.setScene(scene);
        stage.show();
        
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        root.getChildren().add(textArea);
        
        Videojuegos videojuegos = UtilVideojuegos.crear();
        
        String strXML = UtilXML.getXMLVideojuego(videojuegos);
        textArea.setText(strXML);
        System.out.println(strXML);
        
        UtilXML.VideojuegosToXmlFile(videojuegos);
    }

    public static void main(String[] args) {
        launch();
    }

}