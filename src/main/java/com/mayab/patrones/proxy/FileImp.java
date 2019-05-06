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
public class FileImp implements File{
    
     public void borrar(){
          System.out.println("borro");
     }
     public void escribir(){
         System.out.println("escribio");
     }
     public void leer(){
         System.out.println("leer");
     }
}
