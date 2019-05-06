/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

/**
 *
 * @author migue
 */
public class Pasajero implements Observer{
    public String nombre;
    public Vuelo vuelo;
    
    public Pasajero(String nombre, Vuelo vuelo){
        this.setNombre(nombre);
        this.setVuelo(vuelo);
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }
    
    public void alertar(){
    System.out.println("Cambio para"+ " "+this.getNombre());
    System.out.println("Estado: "+vuelo.getEstado());
    System.out.println("Destino: "+vuelo.getDestino());
    System.out.println("Salida: "+vuelo.getSalida());
   
    System.out.println("---------------------------");
    }
    
    @Override
    public void update() {
        this.alertar();
    }

    
    
}
