/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.pkg2.servicios;

import poo3.pkg2.entidades.ParDeNumeros;

/**
 *
 * @author lucia
 * Método mostrarValores que muestra cuáles son los dos números guardados.
 * 
 * Método devolverMayor para retornar cuál de los dos atributos tiene el mayor 
 * valor.
 * 
 * Método calcularPotencia para calcular la potencia del mayor valor de la clase
 * elevado al menor número. Previamente se deben redondear ambos valores.
 * 
 * Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores.
 *
 * Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
public class ParDeNumerosService {
    ParDeNumeros p1 = new ParDeNumeros ();
    public void mostrarValores (){
        System.out.println("Los numeros son:");
        System.out.println(p1.getA() + " y " + p1.getB());
    }
    public double devolverMayor (){
        double mayor = Math.max(p1.getA(), p1.getB());
        System.out.println("El numero mayor es " + (float) mayor);
        return mayor;
    }
    public double calcularPotencia (double mayor){
        double menor = Math.round(Math.min(p1.getA(), p1.getB()));
        mayor = Math.round(mayor);
        System.out.println("La potencia del mayor valor por el menor es " + Math.pow(mayor, menor));
        return Math.abs(menor);
    }
    public void calculaRaiz (double menor){
        System.out.println("La raiz del valor menor es " + Math.sqrt(menor));
    }
}
