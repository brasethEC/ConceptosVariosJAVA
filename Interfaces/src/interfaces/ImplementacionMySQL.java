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
public class ImplementacionMySQL implements AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde MYSQL");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde MYSQL");
    }

    
}
