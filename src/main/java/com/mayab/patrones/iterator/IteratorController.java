/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;

/**
 *
 * @author migue
 */
public class IteratorController {
    
   public static void main(String args[]) {
		String[] alu = {"Alcides","Alcides","Aldo","Alec","Andhaka","Andoni","Andrei","Andrés","Andrónico","Berengario"};
		String[] alu2 = {"Armand","Armando","Arnaldo","Arnau","Arnulfo","Bobo","Bogdan","Bogumil","Bogusław","Boleslao"};
                String[] alu3 = {"Geoffrey","George","Gerardo","Germán","Isaak","Isaías","Isidoro","Isidro"};
                String[] alu4 = {"JUAN","JOSÉ LUIS","JOSÉ","MARÍA GUADALUPE","FRANCISCO","GUADALUPE","MARÍA","JUANA","ANTONIO","JESÚS"};
 		// with iterators
                
                Industrial indu = new Industrial(alu);
                Informatica info = new Informatica(alu2);
                Mecatronica meca = new Mecatronica(alu3);
                Civil civ = new Civil(alu4);
		Iterator iteratorindu = indu.createIterator();
                Iterator iteratorinfo = info.createIterator();
                Iterator iteratormeca = meca.createIterator();
                Iterator iteratorcivi = civ.createIterator();
                

		System.out.println("\nMENU (with iterators)\n----\n industrial");
		printMenu(iteratorindu);
		System.out.println("\nInformatica");
		printMenu(iteratorinfo); 
                System.out.println("\n Mecatronica");
		printMenu(iteratormeca);
                System.out.println("\n Civil");
		printMenu(iteratorcivi); 
                
	}
 
	private static void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			String menuItem = (String)iterator.next();
			System.out.println(menuItem);

		}
	}
    
    
    
}
