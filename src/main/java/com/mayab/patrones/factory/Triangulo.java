/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factory;

/**
 *
 * @author migue
 */
public abstract class Triangulo {
     public String nombre;
     public  int[] lados = new int[3];
    
    
    public void Area(){
        double suma=0;
        for(int i=0;i<lados.length;i++){
            suma=suma+lados[i];
        }
        suma=suma/2;
        double resltado=0;
        resltado = suma*(suma-lados[0])*(suma-lados[1])*(suma-lados[2]);
        resltado = Math.sqrt(resltado);
        System.out.println("AREA: "+resltado);
    }
   
    
    public void Perimetro(){
        double suma=0;
        for(int i=0;i<lados.length;i++){
            suma=suma+lados[i];
        }
        System.out.println("PERIMETRO: " + suma);
    }
    
    
    public String getNombre(){
        return nombre;
    }
    
}
