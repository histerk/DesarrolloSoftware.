/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.adapter;

/**
 *
 * @author migue
 */
public class Alan implements PersonaNueva{
     public String nombre;
     public int edad;
    
    public Alan(String nombre,int edad){
    this.nombre=nombre;
    this.edad = edad;
}
    @Override
    public String getNombre() {
       return this.nombre;
    }
    
      @Override
    public void setNombre(String nombreCompleto) {
    this.nombre=nombreCompleto;
    }

    @Override
    public int getEdad() {
    return this.edad;
    }

  

    @Override
    public void setEdad(int edad) {
    this.edad=edad;
}
    
    
}
