/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public abstract class Banco {
     public double saldo;
     sortCategory categoria = new sortCategory();
     SortFecha fecha = new SortFecha();
     SortQty  cantidad = new SortQty();
     SortComercio comercio = new SortComercio();
     ArrayList <Transaction> transacciones = new ArrayList<Transaction>();
    
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void agregarTransaccion(ArrayList<Transaction> transaccion){
        for(int i=0;i<transaccion.size();i++){
         transacciones.add(transaccion.get(i));
        }
    }
    
    public void Fecha(){
        fecha.sorting(transacciones);
    }
    
    public void Cantidad(){
        cantidad.sorting(transacciones);
    }
    
    public void Comercio(){
        comercio.sorting(transacciones);
    }
    
    public void Categoria(){
        categoria.sorting(transacciones);
    }
    
}
