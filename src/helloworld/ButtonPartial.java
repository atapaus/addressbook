/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox implements EventHandler<ActionEvent> {
    
    private final Button closeButton = new Button("Close");
    private final Button saveButton = new Button("Save");
    
    public ButtonPartial()
    {
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        this.setStyle("-fx-padding:10;-fx-spacing:10");
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        //Inline implementation for EnentHandler interface
        //closeButton.setOnAction(new EventHandler<ActionEvent>() {

          //  @Override
          //  public void handle(ActionEvent event) {
            //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           // }
     //   });
    }

    @Override
    public void handle(ActionEvent event) 
    {
        if(event.getSource().equals(closeButton))
        {
           Platform.exit(); 
        }
        else
        {
            System.out.println("Saving...");
        }
    }
}
