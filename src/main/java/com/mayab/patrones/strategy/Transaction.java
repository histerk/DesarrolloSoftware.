/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

/**
 *
 * @author migue
 */
public class Transaction {
    public String fecha;
    public String comercio;
    public double cantidad;
    public String categoria;
    
    public Transaction(String fecha,String comercio,double cantidad,String categoria){
        this.fecha = fecha;
        this.comercio = comercio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    public String getFecha(){
        return this.fecha;
    }
    public String getComecio(){
        return this.comercio;
    }
    public double getCantidad(){
        return this.cantidad;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    public void setComercio(String comercio){
        this.comercio=comercio;
    }
    public void setCantidad(double cantidad){
        this.cantidad=cantidad;
    }
    public void setCategoria(String categoria){
        this.categoria=categoria;
}
}
