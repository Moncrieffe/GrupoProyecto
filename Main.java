/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.leccion4;

import java.util.Arrays;

/**
 *
 * @author macbook
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] vector = new int[6];
        int contador = 0;
        Ejercicio3 main = new Ejercicio3();
        vector = main.llenarvector(vector,contador);
        
        System.out.println(Arrays.toString(vector));
        
        int numMayor = 0;
        
        numMayor = main.obtenerMayor( vector, contador, numMayor );
        System.out.println(numMayor);
        
        
        
        int sumatoria = 0;
        contador = 0;
        Ejercicio4 sumandoVector = new Ejercicio4();
        
        vector = sumandoVector.llenarvector(vector, contador);
        System.out.println(Arrays.toString(vector));
        
        sumatoria = sumandoVector.sumatotal(vector, contador, sumatoria);
        System.out.println(sumatoria);
    }
    
    
}
