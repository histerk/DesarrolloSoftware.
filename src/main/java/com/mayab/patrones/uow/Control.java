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
public class Control implements IUnitOfWork{
    List<Student> create = new ArrayList<Student>();
    List<Student> delete = new ArrayList<Student>();
    List<Student> modify = new ArrayList<Student>();
    @Override
    public void registerNew(Student a) {
       create.add(a);
    }

    @Override
    public void registerModified(Student a) {
        modify.add(a);
    }

    @Override
    public void registerDeleted(Student a) {
        delete.add(a);
    }

    @Override
    public void commit() {
        for(int i=0; i < create.size(); i++) {
            System.out.println("se creo " + create.get(i).name + "-" + create.get(i).address);
       }
        for(int i=0; i < delete.size(); i++) {
            System.out.println( "se borro " + delete.get(i).name + "-" + delete.get(i).address);
       }
        for(int i=0; i < modify.size(); i++) {
            System.out.println("se modifico " + modify.get(i).name + "-" + modify.get(i).address);
       }
    }
    
}
