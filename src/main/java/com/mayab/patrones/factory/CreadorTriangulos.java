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
public class CreadorTriangulos extends TrianguloCreate{
    @Override
    public Triangulo CrearTriangulo (String tipo,int a,int b, int c){
         if(tipo.equals("Isosceles")){
             return new TrianguloIsosceles( a, b, c);
         }else if (tipo.equals("Equilatero")){
             return new TrianguloEquilatero( a, b, c);
         }else if (tipo.equals("Escaleno")){
             return new TrianguloEscaleno(a,b,c);
         }else{
             System.out.println("Error: invalid type of trinagulo");
		return null;
         }
    }
    
    
}
