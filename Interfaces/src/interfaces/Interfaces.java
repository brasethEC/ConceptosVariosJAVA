/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author seth
 */
public class Interfaces {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {

        AccesoDatos datos = new ImplementacionMySQL();
        ejecutar(datos,"listar");
        
        datos = new ImplementacionSQLSERVER();
        ejecutar(datos,"insertar");
    }
    
    private static void ejecutar(AccesoDatos datos, 
            String accion){
        if("listar".equals(accion)){
            datos.listar();
        }
        else if("insertar".equals(accion)){
            datos.insertar();
        }
    }
    
    
}
