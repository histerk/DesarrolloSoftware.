/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class Vuelo implements Observable{
    public String salida;
    public String estado;
    public String destino;
    public ArrayList<Observer> pasajeros = new ArrayList();
    
    public Vuelo(String salida, String destino, String estado){
        this.salida=salida;
        this.estado=estado;
        this.destino=destino;
    }
    
    public String getSalida() {
        return salida;
    }
    
     public void setSalida(String salida) {
        this.salida = salida;
        this.notifyObservers();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        this.notifyObservers();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
        this.notifyObservers();
    }
   
    public void addObserverToList(Observer p){
        pasajeros.add(p);
    }
   
    public void deleteObserverFromList(Observer p){
        pasajeros.remove(p);
    }
    
    public void notifyObservers(){
        
        for(int i=0;i<pasajeros.size();i++){
            pasajeros.get(i).update();
        }
}

    
    
}
