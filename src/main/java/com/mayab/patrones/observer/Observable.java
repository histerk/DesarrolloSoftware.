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
public interface Observable {
    public void addObserverToList(Observer persona);
    public void deleteObserverFromList(Observer persona);
    public void notifyObservers();

}
