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
public class TrianguloIsosceles extends Triangulo{
     public TrianguloIsosceles(int a,int b, int c){
        this.nombre="Isosceles";
        this.lados[0]=a;
        this.lados[1]=b;
        this.lados[2]=c;
}
    
}
