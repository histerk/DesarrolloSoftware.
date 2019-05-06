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
public class InformaticaIterator implements Iterator{
        ArrayList<String> alumnos;
	int position = 0;
 
	public InformaticaIterator(ArrayList<String> alumnos) {
		this.alumnos = alumnos;
	}
 
	public String next() {
		String menuItem = (String) alumnos.get(position);
		position = position + 1;
		return menuItem;
	}
 
	public boolean hasNext() {
		if (position >= alumnos.size()) {
			return false;
		} else {
			return true;
		}
	}
}
