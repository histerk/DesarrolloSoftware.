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
public class TemplateController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona yo = new Persona("miguel","merida", 20);
       Productos nuevo = new Productos("007",200);
       yo.update(15);
       nuevo.update(15);
       
    }
    
}
