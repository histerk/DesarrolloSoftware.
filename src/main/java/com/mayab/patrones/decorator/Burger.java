/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.decorator;

/**
 *
 * @author migue
 */
public abstract class Burger {
    String description = "Unknown Burger";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
