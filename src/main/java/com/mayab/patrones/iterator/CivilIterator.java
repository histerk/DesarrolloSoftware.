/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author migue
 */
public class CivilIterator implements Iterator{
    Object[] alumnos;
	int position = 0;
 
	public CivilIterator(Queue<String> items) {
		 alumnos = items.toArray(); 
	}
 
	public String next() {
		String menuItem = (String) alumnos[position];
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= alumnos.length || alumnos[position] == null) {
			return false;
		} else {
			return true;
		}
	}
}
    
