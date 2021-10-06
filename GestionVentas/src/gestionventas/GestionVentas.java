/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionventas;

import dominio.Orden;
import dominio.Producto;

/**
 *
 * @author milla
 */
public class GestionVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Producto prod1 = new Producto("Peras", 5.4);
        
        Producto prod2 = new Producto("Manzanas", 6.4);
        
        Producto prod3 = new Producto("Platanos", 7);
        Orden pedido1 = new Orden();
        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod2);
      
        
        pedido1.mostrarOrden();
       
        Orden pedido2 = new Orden();
        pedido2.agregarProducto(prod3);
        System.out.println("Mostrar pedido 2");
        pedido2.mostrarOrden();
    }
    
}
