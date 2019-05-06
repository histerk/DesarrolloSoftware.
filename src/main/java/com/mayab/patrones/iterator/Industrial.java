/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.*; 
public class Industrial implements Menu {
    List<String> alumnos = new ArrayList<String>();  
    
   public Industrial(String[] alumno){
       for(int i = 0; i< alumno.length;i++){
            alumnos.add(alumno[i]);
        }
    }
   
  public Iterator createIterator() {
		return new IndustrialIterator(alumnos);
	}
}
