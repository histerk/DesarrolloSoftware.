/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

/**
 *
 * @author migue
 */
public class Singleton {
    String nombre;
    String Apellido;
    boolean logueado;
    private static Singleton usuario;
    
    private Singleton(String nombre, String apellido){
            this.nombre = nombre;
             this.Apellido = apellido;
       
    }
    
    public static Singleton getSingleton(String nombre, String apellido){
        if(usuario == null){
            usuario = new Singleton(nombre, apellido);
        }else{
            System.out.println("No se puede crear el objeto ");
        }
        return usuario;
    }
    
    public void login(){
        this.logueado = true;
    }
    
    public void logout(){
        this.logueado = false;
    }
    
    public boolean isLog (){
        return logueado;
    }
}
