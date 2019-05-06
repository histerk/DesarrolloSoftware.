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
public class ObserverController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vuelo mexico = new Vuelo("19:00hrs","Mexico","ATRASADO");
        Vuelo miami = new Vuelo("11:00hrs","Miami","a tiempo");
        Pasajero uno = new Pasajero("Miguel",mexico);
        Pasajero dos = new Pasajero("Daniel",mexico);
        Pasajero tres = new Pasajero ("Juan",miami);
        mexico.addObserverToList(uno);
        mexico.addObserverToList(dos);
        miami.addObserverToList(tres);
        mexico.setEstado("a Tiempo");
        miami.setEstado("abordando");
    }
    
}
