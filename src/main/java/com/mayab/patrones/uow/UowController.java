/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.uow;

/**
 *
 * @author migue
 */
public class UowController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Student yo = new Student("miguel","merida");
       Student el = new Student("pedro","cancun");
       Student ella = new Student("daniela","brasil");
       Control con =new Control();
       
       con.registerNew(yo);
       con.registerNew(el);
       con.registerNew(ella);
       
       con.registerModified(yo);
       
       con.registerDeleted(el);
       
       con.commit();
       
       
    }
    
}
