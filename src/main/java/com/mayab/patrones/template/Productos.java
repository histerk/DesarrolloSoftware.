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
public class Productos extends Catalogo {
    String codigo;
    int precio;
  Productos(String codi,int precio){
      this.codigo=codi;
        this.precio=precio;
  }
    @Override
    boolean validarDatos(int a) {
        if(a > 10){
            System.out.println("validado");
             return true;
        }else{
             return false;
        }
    }
    
}
