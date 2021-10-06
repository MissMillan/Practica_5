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
public class Producto {
    //atributos 
    private final int idProducto;//esto es static para que no se altere el id
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    //definimos metodos

    public Producto() {
        this.idProducto = ++Producto.contadorProducto;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public  int getIdProducto() {
        return this.idProducto;
    }
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProducto() {
        return contadorProducto;
    }

    public static void setContadorProducto(int contadorProducto) {
        Producto.contadorProducto = contadorProducto;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }
    
            
}
