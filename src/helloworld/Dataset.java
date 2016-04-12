/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author csstudent
 */
public class Dataset {
    private Immunizations[] dimension;
    private Information[] fact;
    
    public Immunizations[] getDimension(){
        return dimension;
    }
    public Information[] getFact(){
        return fact;
    }
    
    @ Override 
    public String toString(){
        String var= null;
       for(int i = 0; i < fact.length; i++){
           System.out.println(fact[i].toString());
           var += fact[i].getValue();
        }
        return var;
    }
}
