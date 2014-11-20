/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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
        
        //Tehe root is the main layout 
        VBox root = new VBox();
        
        Label nameLabel = new Label("Name:");
        TextField nameTextField = new TextField();
        
        Label addressLabel = new Label("Address:");
        TextField addressTextField = new TextField();
        
        Label phoneLabel = new Label("Phone:");
        TextField phoneTextField = new TextField();
        
        //Do layout for texfield components
        VBox textFieldLayout = new VBox();
        textFieldLayout.getChildren().add(nameLabel);
        textFieldLayout.getChildren().add(nameTextField);
        
        textFieldLayout.getChildren().add(addressLabel);
        textFieldLayout.getChildren().add(addressTextField);
        
        textFieldLayout.getChildren().add(phoneLabel);
        textFieldLayout.getChildren().add(phoneTextField);
        textFieldLayout.setStyle("-fx-spacing: 10" );
        Button closeButton = new Button("Close");
        Button saveButton = new Button("Save");
        
        HBox buttonLayout = new HBox();
        
        
        buttonLayout.getChildren().add(closeButton);
        buttonLayout.getChildren().add(saveButton);
        
        root.getChildren().add(textFieldLayout);
        root.getChildren().add(buttonLayout);
        Scene scene = new Scene(root, 300, 250);
        

        
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
