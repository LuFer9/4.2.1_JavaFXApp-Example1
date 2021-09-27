/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import java.time.Clock;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Luis
 */
public class JavaFXApp extends Application {
    @Override
    public void init(){
        
        System.out.println("inicio init");
    }
    
    
    
    
    
    
    @Override
    public void start(Stage primaryStage) {
        
        System.out.println("inicio start");
        
        Button btn = new Button();
        Button btn2 = new Button();
        
        btn.setText("Cerrar");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
                System.exit(0);
            }
        });
        
        btn2.setText("Abre otra stage");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World v2.0!");
                  abreOtraStage();
            }
        });
        
        HBox root = new HBox();
        root.getChildren().addAll(btn, btn2);
     
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
       
        
    }
    
      public void abreOtraStage(){
          
           Button btn2 = new Button("Grabar");
           Scene scene2 = new Scene(btn2, 300, 300);
           
           Stage stage2 = new Stage(StageStyle.UTILITY);
           
           stage2.setTitle("otra ventana");
           stage2.setScene(scene2);
      
           stage2.show();
       
    }
    
    @Override
    public void stop(){
        System.out.println("inicio stop");
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
 
    
}
