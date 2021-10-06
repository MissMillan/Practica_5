/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.domain;

/**
 *
 * @author PLANTA 3 DERECHA
 */
public class Empleado extends Persona{

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(){
        // super();
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    public Empleado(String nombre, double sueldo){
        this();
        this.nombre = nombre;
        this.sueldo = sueldo;        
    }
    
//    public Empleado(double sueldo, String nombre, char genero, int edad, String direccion) {
//        super(nombre, genero, edad, direccion);
//        this.sueldo = sueldo;
//    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    public static int getContadorEmpleado() {
        return contadorEmpleado;
    }

    public static void setContadorEmpleado(int aContadorEmpleado) {
        contadorEmpleado = aContadorEmpleado;
    }   

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo + " , " + super.toString() + '}';
    }
    
    
    
    
    
}
