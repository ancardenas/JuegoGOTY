/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablero;

/**
 *
 * @author Estudiante
 */
public class Carro {
    private int x;
    private int y;
    private Llanta llantas[];
    private Chasis chasis ;

    public Carro(int x, int y) {
        this.x = x;
        this.y = y;
        this.chasis = new Chasis(x, y);
        this.llantas = new Llanta [2];
        this.llantas[0]= new Llanta(x+30,y+15);
        this.llantas[1]= new Llanta(x+70,y+15);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Llanta getLlantas(int i) {
        return llantas[i];
    }

    public void setLlantas(Llanta[] llantas) {
        this.llantas = llantas;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    public void mover(){
        this.setX(this.getX()+1);
        this.llantas[0].setX(x+30);
    }
    
}
