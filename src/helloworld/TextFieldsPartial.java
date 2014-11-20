/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextFieldsPartial extends VBox{    
        private final Label nameLabel = new Label("Name:");
        private final TextField nameTextField = new TextField();       
        private final Label addressLabel = new Label("Address:");
        private final TextField addressTextField = new TextField();        
        private final Label phoneLabel = new Label("Phone:");
        private final TextField phoneTextField = new TextField();

    
        
    public TextFieldsPartial()
    {     
        VBox.setMargin(this, new Insets(10, 10, 10, 10));
        this.getChildren().add(nameLabel);
        this.getChildren().add(nameTextField); 
        nameTextField.setStyle("-fx-spacing: 10");
        this.getChildren().add(addressLabel);
        this.getChildren().add(addressTextField); 
        addressTextField.setStyle("-fx-spacing: 10");
        this.getChildren().add(phoneLabel);
        this.getChildren().add(phoneTextField);
        this.setStyle("-fx-spacing: 10;-fx-padding:10" );
    }
}
