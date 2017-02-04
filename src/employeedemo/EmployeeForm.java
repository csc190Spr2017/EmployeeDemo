/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class EmployeeForm extends Stage{
    public EmployeeForm(Employee em){
        //set up the layout
        this.employee = em;
        GridPane gp = new GridPane();
        Label lblName= new Label("Name");
        this.tfName = new TextField();
        this.tfName.setText(em.name);
        Label lblAge = new Label("Age");
        this.tfAge = new TextField();
        this.tfAge.setText(String.valueOf(em.age));
        Button btn = new Button();
        btn.setText("Save");
        
        gp.add(lblName, 0, 0);
        gp.add(lblAge, 0, 1);
        gp.add(tfName, 1, 0);
        gp.add(tfAge, 1, 1);
        gp.add(btn, 1, 2);
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                save();
            }
        });
        
        Scene scene = new Scene(gp, 300, 250);
        this.setScene(scene);
    }
    public void save(){
        employee.name = this.tfName.getText();
        employee.age = Integer.parseInt(this.tfAge.getText());
        this.close();
    }
    
    //data members
    protected TextField tfName;
    protected TextField tfAge;
    protected Employee employee;
}
