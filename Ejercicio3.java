/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leccion4;

/**
 *
 * @author macbook
 */
public class Ejercicio3 {

    
    // metodo para llenar el vector recursivamente
    public int[] llenarvector(int[] vector, int contador){

        // condicional que evalua si el contador es menor al tamaño del vector
        if(contador < vector.length){
            //se genera un numero aleatorio y se asigna a la posicion actual del vector
            vector[contador] = (int) (Math.random()*10);
            
            //se imprime en consola para ir viendo el numero aleatorio
            System.out.println(vector[contador]);
            
            //el contador se incrementa en 1
            contador++;
            
            // se llama el metodo llenarvector y se asigna al vector
            vector = llenarvector( vector,  contador );
        }

        // hace return del vector
        return vector;
    }

    //metodo obtener numero mayor dentro del vector
    public int obtenerMayor(int[] vector, int contador, int numMayor){
        
        // condicional que evalua si el contador es menor al tamaño del vector
        if(contador < vector.length){
            
            //condicional que evalua si el numero dentro del espacio actual del vector es mayor al numero mayor anterior
            if( vector[contador] > numMayor ){
                //si se cumple entonces asigna el valor dentro del espacio actual del vector a la variable numero mayor
                numMayor = vector[contador];
                
            }
            //contador incrementa en 1
            contador++;
            
            // se llama el metodo obtenerMayor y se asigna a la variable numMayor
            numMayor = obtenerMayor( vector, contador, numMayor );
        }
        
        // hace return de variable numMayor
        return numMayor;
        
    }
    
}
