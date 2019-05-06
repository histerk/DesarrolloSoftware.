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
public class FactoryController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TrianguloCreate trian = new CreadorTriangulos();
        Triangulo equi = trian.calculos("Escaleno",5,3,7);
        equi = trian.calculos("Equilatero",5,5,5);
        equi = trian.calculos("Isosceles",6,6,3);
        
    }
    
}
