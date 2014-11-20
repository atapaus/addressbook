/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
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
        TextArea printTextArea = new TextArea();
        TextFieldsPartial textFieldsPartial = new TextFieldsPartial();
        ButtonPartial buttonPartial = new ButtonPartial(textFieldsPartial, printTextArea);
        
        VBox root = new VBox(); 
        HBox hBox1 = new HBox();
        VBox vBox1 = new VBox();
        //root.getChildren().add(new TextFieldsPartial());
        //root.getChildren().add(new ButtonPartial());
        root.getChildren().add(hBox1);
        root.getChildren().add(buttonPartial);
        hBox1.getChildren().add(vBox1);
        
        

        //hBox1.getChildren().add(new ButtonPartial());
        hBox1.getChildren().add(textFieldsPartial);
        hBox1.getChildren().add(printTextArea);
        //VBox.setMargin(root, new Insets (10, 10, 10, 10)); 
        Scene scene = new Scene(root, 600, 300);
        

        
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
