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
public class ProxyFile implements File{
    FileImp no;
    Usuario us;
    ProxyFile (Usuario us){
        this.us = us;
    }
    public void borrar(){
        if (us.tipo == 0){
           new FileImp().borrar();
        }else{
            System.out.println("no es super usuario ");
         }
    }

     public void escribir(){
         new FileImp().escribir();
     }

     public void leer(){
          new FileImp().leer();
     }
}
