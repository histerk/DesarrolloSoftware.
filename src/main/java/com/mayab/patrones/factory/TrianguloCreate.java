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
public abstract class TrianguloCreate {  
    abstract Triangulo CrearTriangulo(String tipo,int a,int b,int c);
 
	public Triangulo calculos(String type,int a,int b,int c){
		 Triangulo triangulo = CrearTriangulo(type,a,b,c);
                System.out.println("Es un: "+triangulo.getNombre());
                triangulo.Perimetro();
                triangulo.Area();
                System.out.println();
                return triangulo;
	}
}
