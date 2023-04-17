/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.pkg2.servicios;

import java.util.Arrays;

/**
 *
 * @author lucia
 * Método inicializarA recibe un arreglo por parámetro y lo inicializa con 
 * números aleatorios.
 * Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
 * Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
 * Método inicializarB copia los primeros 10 números del arreglo A en el arreglo 
 * B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
 */
public class ArregloService {
    public double[] inicializarA (double[] arreglo1){
       for (int i = 0; i < 49; i++) {
           arreglo1[i]= Math.random()*10;
       }
 
 return arreglo1;
}
public void mostrarArreglo (double[] arreglo1){
    System.out.println(Arrays.toString(arreglo1));
        
    }
public double[] ordenar (double[] arreglo1){
    double[] arregloaux = new double [50];
    Arrays.sort(arreglo1);
    int j=49;
    for (int i = 0; i < 10; i++){
   
        arregloaux[i]=arreglo1[j];
        j--;
        }
      return arregloaux;


}
public double[] inicializarB (double [] arreglo1, double[] arreglo2){
    for (int i = 0; i < 10; i++) {
        arreglo2[i]= arreglo1[i];
        }
    Arrays.fill(arreglo2,10,19,0.5);
return arreglo2;
  
}public void mostrarArreglo2 (double[] arreglo2){
    System.out.println(Arrays.toString(arreglo2));
}
}
//      Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
//Luego llenar las últimas 10 posiciones del arreglo B con 0.5.

