/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author migue
 */
public class ProxyController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Usuario yo = new Usuario("miguel",2);
         Usuario su = new Usuario("da",0);
         
         ProxyFile nuevo = new ProxyFile(yo);
         nuevo.borrar();
          ProxyFile otro = new ProxyFile(su);
          otro.borrar();
    }
    
}
