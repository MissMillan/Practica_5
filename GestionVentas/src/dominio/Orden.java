/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

/**
 *
 * @author milla
 */
public class Orden {
    private final int idOrden;

    private static int contadorOrdenador;
    private static int contadorProductos ;
    private static final int MAX_PRODUCTO= 10;
        Producto productos[] ;
    
    public Orden(){
        productos = new Producto[Orden.MAX_PRODUCTO];
        this.idOrden = ++Orden.contadorOrdenador;
        this.contadorProductos = 0;
    }
    
    public void agregarProducto(Producto producto){
        //va a agregar un producto y nos va a insertar un producto
        if(Orden.contadorOrdenador < Orden.MAX_PRODUCTO){
            productos[Orden.contadorProductos++] = producto;
        }else{
            System.out.println("Has alcanzado el maximo de productos por orden de "
                    + Orden.MAX_PRODUCTO);
        }
    }
    public double calcularTotal(){
        var res = 0.0;
        for (int i = 0; i < Orden.contadorProductos; i++) {
            
            res += productos[i].getPrecio();
        }
        return res;
    }
    
    public void mostrarOrden(){
        //imprimir el listado de los productos
        System.out.println("Id de Orden: "+this.idOrden);
        for (int i = 0; i < Orden.contadorProductos; i++) {
          System.out.println("Nombre Producto [ "+ i + " ]---> "+
                    productos[i].getNombre());
          System.out.println("Precio Producto [ "+ i + " ]---> "+
                    productos[i].getPrecio());
        }
        System.out.println("Total: "+this.calcularTotal());
    }
    
    
    
    
    
    
}



