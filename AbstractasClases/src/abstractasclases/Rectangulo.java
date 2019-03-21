/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractasclases;

/**
 *
 * @author seth
 */
public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    public void dibujar() {
        //Comportamiento de la Clase Hija
        System.out.println("Aquí­ deber­a dibujar un:" 
                + this.getClass().getSimpleName());
    }
    
}
