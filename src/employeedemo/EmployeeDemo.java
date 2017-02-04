/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeedemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author csc190
 */
public class EmployeeDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        //1. prepare data
        Employee [] arrEm = new Employee []{
          new Employee("Jack", 20),
           new Employee("Alice", 30),
           new Employee("Jimmy", 40),
           new Employee("Cathy", 50),
           new Employee("Alex", 20),
           new Employee("Bob", 30),
           new Employee("Janice", 40),
           new Employee("Catlina", 50),
        };
        
        Button btn = new Button();
        btn.setText("Show Employees");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                EmployeeListForm elf = new EmployeeListForm(arrEm);
                elf.refresh();
                elf.showAndWait();
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
          //TEST USE -- Branch EmployeeForm
        Employee e1 = new Employee("Jack", 10);
        EmployeeForm ef = new EmployeeForm(e1);
        ef.showAndWait();
        System.out.println("name: " + e1.name + ", age: " + e1.age);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
      
        
    }
    
}
