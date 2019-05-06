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
public abstract class Catalogo {
    final void update(int a){
        leerDatos();
        if(validarDatos(a)){
            guardar();
        }else{
            error();
        }
    }
    
    abstract boolean validarDatos(int a);
    
    public void leerDatos(){
        System.out.println("lelendo datos");
    }
    
    public void guardar(){
        System.out.println("se guardo");
    }
    
    public void error(){
        System.out.println("hay error");
    }
    
}
