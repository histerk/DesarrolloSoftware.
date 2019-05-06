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
public class personaEquis implements personaVieja{
     public String nombre;
    public String apellido;
    public String fecha;
    
    public personaEquis(String nombre,String apellido,String fecha){
        this.nombre = nombre;
        this.apellido=apellido;
        this.fecha=fecha;
    }
     @Override
    public String getNombre(){
        return this.nombre;
    }
     @Override
    public String getApellido(){
        return this.apellido;
    }
     @Override
    public String getFecha(){
        return this.fecha;
    }
     @Override
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
     @Override
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
     @Override
    public void setFecha(String fecha){
        this.fecha=fecha;
}
}
