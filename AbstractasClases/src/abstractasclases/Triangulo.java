
package abstractasclases;
/**
 *
 * @author seth
 */
public class Triangulo extends FiguraGeometrica {

    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    @Override
    public void dibujar() {
        /*Implementacion del metodo dibujar heredado 
        de la clase FiguraGeometrica */
        System.out.println("Aquí­ deber­a dibujar un:" 
                + this.getClass().getSimpleName());
    }
    
}
