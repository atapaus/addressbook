/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonPartial extends HBox implements EventHandler<ActionEvent> {
    
    private final Button closeButton = new Button("Close");
    private final Button saveButton = new Button("Save");
    private final Button printButton = new Button("Print");
    private TextFieldsPartial textFieldsPartial;
    private ArrayList<Person> persons = new ArrayList<Person>();
    private TextArea printTextArea = new TextArea();
    
    public ButtonPartial(TextFieldsPartial partial, TextArea printArea)
    {
        printTextArea = printArea;
        textFieldsPartial = partial;
        this.getChildren().add(closeButton);
        this.getChildren().add(saveButton);
        this.getChildren().add(printButton);
        this.setStyle("-fx-padding:10;-fx-spacing:10");
        closeButton.setOnAction(this);
        saveButton.setOnAction(this);
        printButton.setOnAction(this);
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
        else if(event.getSource().equals(saveButton))
        {
            System.out.println("Saving...");
            textFieldsPartial.getName();
            textFieldsPartial.getAddress();
            textFieldsPartial.getPhone();
            persons.add(new Person(textFieldsPartial.getName(), textFieldsPartial.getAddress(),textFieldsPartial.getPhone() ) );
            textFieldsPartial.clearFields();
        }
        else if(event.getSource().equals(printButton))
        {
            System.out.println("Printing...");
            for(int i = 0; i < persons.size(); i++)
            {
                printTextArea.appendText("Name: " + persons.get(i).getName()+ "\nAddress: " + persons.get(i).getAddress()+ "\nPhone:" + persons.get(i).getPhone()+ "\n");
            }
            

            
            
            
        }
    }
}
