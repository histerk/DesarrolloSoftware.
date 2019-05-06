/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

/**
 *
 * @author migue
 */
public class MecatronicaIterator implements Iterator {
        String[] alumnos;
	int position = 0;
 
	public MecatronicaIterator(String[] alumnos) {
		this.alumnos = alumnos;
	}
 
	public String next() {
		String menuItem = alumnos[position];
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
