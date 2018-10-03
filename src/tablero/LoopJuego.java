/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;


import javafx.animation.AnimationTimer;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

/**
 *
 * @author Estudiante
 */
public class LoopJuego extends AnimationTimer{

    private GraphicsContext gc;
    private Image fondo;
    private Image ufo;
    private Image cat;
    private Image man;
    private int time =0;
    private int a =0;
    public LoopJuego(GraphicsContext gc) {
        for (int i = 0; i < 6; i++) {
            
        }
        this.gc = gc;
        this.fondo = new Image("Imagenes/fondo.png");
        this.ufo = new Image("Imagenes/ufo_0.png");
        this.cat = new Image("Imagenes/cats.gif");
        this.man = new Image("Imagenes/down1.png");
        
    }




    
    
    @Override
    public void handle(long now) {

     
     gc.clearRect(0, 0, 1024, 512);
     gc.drawImage(fondo, 0, 0);
     gc.drawImage(ufo, 0, 0);
     gc.strokeRect(200, 389, 30, 49);
     gc.drawImage(man, 200, 389);
     gc.strokeRect(9+a, 360, 100, 70);
     gc.drawImage(cat, 132*(time%6), 0, 132, 80, 0+a, 350, 132, 80);
     Shape sCat =new Rectangle(9+a, 360, 100, 70);
     
     Shape sMan = new Rectangle (200, 389, 30, 49);
     
     Shape intersection =SVGPath.intersect(sCat,sMan);
     if(intersection.getBoundsInLocal().getWidth()!=-1){
         stop();
     }
     
     
     a++;   
     if (a%4==0) {
            time++;
        }
     if (a%1024==0){
         a=0;
     }
    }
    
}
