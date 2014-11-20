/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
public class HelloWorld extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox root = new VBox();                                             
        root.getChildren().add(new TextFieldsPartial());
        root.getChildren().add(new ButtonPartial());
        VBox.setMargin(root, new Insets (10, 10, 10, 10)); 
        Scene scene = new Scene(root, 300, 300);
        

        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
