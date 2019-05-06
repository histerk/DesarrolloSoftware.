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
public class PersonaAdapter implements personaVieja{
    PersonaNueva nueva;
    
    public PersonaAdapter(PersonaNueva personaNueva){
    this.nueva=personaNueva;
    }

    @Override
    public String getNombre() {
    String[] separado = nueva.getNombre().split("\\s+");
    return separado[0];
    }
    
    @Override
    public void setNombre(String nombre) {
    nueva.setNombre(nombre);
    }


    @Override
    public String getApellido() {
    String[] separado = nueva.getNombre().split("\\s+");
    return separado[1];
    }
    
    @Override
    public void setApellido(String apellido) {
    String name = nueva.getNombre();
    name = name + " " + apellido;
    nueva.setNombre(name);
    }

    @Override
    public String getFecha() {
    int año = 2019-nueva.getEdad();
    return ("18/junio/"+año);
    }


    @Override
    public void setFecha(String fecha){
    String anno = fecha.substring(fecha.length() - 4);
    int año = Integer.parseInt(anno);
    nueva.setEdad(2019-año);
}
}
