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
public interface IUnitOfWork {
    
  void registerNew(Student a);

  void registerModified(Student a);

  void registerDeleted(Student a);
     
  void commit();
}
