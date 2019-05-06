/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.*;


/**
 *
 * @author migue
 */
public class StrategyController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco usuario = new Reportes("miguel");
         ArrayList <Transaction> transacciones = new ArrayList<Transaction>();
        Transaction primer =new Transaction("1-enero","samborns",1000,"osio");
        Transaction seg =new Transaction("5-febreo","farmacia",500.3,"salud");
        Transaction tercer =new Transaction("21-marzo","aurrera",300,"persona");
        Transaction cuarta =new Transaction("32-octubre","oxxo",35.4,"comida");
        transacciones.add(primer);
        transacciones.add(seg);
        transacciones.add(tercer);
        transacciones.add(cuarta);
        usuario.agregarTransaccion(transacciones);
        
        usuario.Cantidad();
        usuario.Fecha();
        usuario.Comercio();
        usuario.Categoria();
        
        
    }
}
    
