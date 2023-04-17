/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.pkg2.entidades;

/**
 *
 * @author lucia
 * Realizar una clase llamada ParDeNumeros que tenga como atributos dos números 
 * reales con los cuales se realizarán diferentes operaciones matemáticas. 
 * La clase debe tener un constructor vacío, getters y setters.  
 * En el constructor vacío se usará el Math.random para generar los dos números.
 */
public class ParDeNumeros {
    private double A, B;

    public ParDeNumeros() {
        this.A = Math.random()*10;
        this.B = Math.random()*10;
    }

    public double getA() {
        return A;
    }

    public double getB() {
        return B;
    }

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }
    
    
    
}
