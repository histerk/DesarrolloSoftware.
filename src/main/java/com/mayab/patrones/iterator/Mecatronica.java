package com.mayab.patrones.iterator;

public class Mecatronica implements Menu{
    String[] alumnos = new String[10];
    
    public Mecatronica(String[] alumno){
        for(int i = 0; i< alumno.length;i++){
            alumnos[i]=alumno[i];
        }
    }
    
    public Iterator createIterator() {
	return new MecatronicaIterator(alumnos);
    }
    
}
