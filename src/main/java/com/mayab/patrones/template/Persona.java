/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author migue
 */
public class Persona extends Catalogo{
    String nombre;
    String direcion;
    int edad;
    
    Persona (String nombre,String dire,int edad){
        this.nombre=nombre;
        this.direcion=dire;
        this.edad=edad;
    }
    
    @Override
    boolean validarDatos(int a) {
      if(a > 18){
            System.out.println("validado");
            return true;
        }else{
            return false;
        }
    }
}
