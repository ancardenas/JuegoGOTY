/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Estudiante
 */
public class Tablero extends Application {
    
    @Override
    public void start(Stage stage) {
        Pane panel =new Pane();
        Canvas canvas = new Canvas(1024,512);
        panel.getChildren().add(canvas);
       Scene scene =new Scene(panel,1024,512,Color.TRANSPARENT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        /*gc.setFill(Color.BISQUE);
        gc.fillRect(4, 4, 200, 200);
        gc.setFill(Color.BROWN);
        gc.fillOval(4, 4, 200, 200);
        gc.strokeLine(4, 4, 204, 204);
        gc.strokeLine(204, 4, 4, 204);
        double xpoints[]= {102,204,4};
        double ypoints[]={4,204,204};
        double xpoints1[]= {102,204,4};
        double ypoints1[]={204,4,4};
        gc.setFill(Color.BLUE);
        gc.fillPolygon(xpoints, ypoints, xpoints.length);
        gc.fillPolygon(xpoints1, ypoints1, xpoints.length);*/
       LoopJuego loopjuego = new LoopJuego(gc);
       loopjuego.start();
       
        stage.setTitle("Ejemplo Canvas");
       stage.setScene(scene);
       stage.show();
    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
        
    }
    
}
