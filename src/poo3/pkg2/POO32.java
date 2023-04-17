/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.pkg2;

import poo3.pkg2.entidades.ParDeNumeros;
import poo3.pkg2.servicios.ArregloService;
import poo3.pkg2.servicios.ParDeNumerosService;

/**
 *
 * @author lucia
 */
public class POO32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        /*ParDeNumerosService dato = new ParDeNumerosService ();
        dato.mostrarValores();
        double mayor = dato.devolverMayor();
        double menor = dato.calcularPotencia(mayor);
        dato.calculaRaiz(menor);*/
        
        double [] arreglo1 = new double [50];
        double [] arreglo2 = new double [20];
         ArregloService as1 = new ArregloService();
        as1.inicializarA(arreglo1);
        as1.mostrarArreglo(arreglo1);
        arreglo1=as1.ordenar(arreglo1);
        as1.mostrarArreglo(arreglo1);
        as1.inicializarB(arreglo1,arreglo2);
        as1.mostrarArreglo2(arreglo2);
        }
            
        
    }
