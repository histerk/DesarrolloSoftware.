/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.decorator;

/**
 *
 * @author migue
 */
public class DecoratorController {
        public static void main(String[] args) {
        Burger angus = new Angus();
       
       System.out.println(angus.getDescription()+ " $" + angus.cost());
       
       Burger veggie = new Veggie();
       veggie = new Bacon(veggie);
       System.out.println(veggie.getDescription()+ " $" + veggie.cost());
       
       veggie = new Guacamole(veggie); 
       System.out.println(veggie.getDescription()+ " $" + veggie.cost());
    }
}
