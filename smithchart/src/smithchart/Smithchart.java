/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smithchart;

import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
//import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author LumiaSun
 */
public class Smithchart extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        //grid.setHgap(10);
        //grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
        
        Button one = new Button("1");
        grid.add(one, 0, 0, 2, 1);
        
        //btn.setOnAction(new EventHandler<ActionEvent>() {
            
        //    @Override
        //    public void handle(ActionEvent event) {
        //        System.out.println("Hello World!");
        //    }
        //});
        
        
        Scene scene = new Scene(grid, 300, 250);
        
        primaryStage.setTitle("Hello World!");
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
