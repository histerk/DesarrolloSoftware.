/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.uow;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author migue
 */
public class Student{
      String name;
      String address;  
  
  public Student(String name, String address) {
   
    this.name = name;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public String getAddress() {
    return address;
}
  

}
