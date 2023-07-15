/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme12;


/**
 *
 * @author user
 */
public enum DayOfWeek {
    MONDAY(""), TUESDAY(""), WEDNESDAY(""), THURSDAY(""), FRIDAY(""), SATURDAY(""), SUNDAY("") ;
     private String name;
    
    private DayOfWeek(String name){
        this.name = name;
    
    }
    
    public String dName(){
        return this.name;
        
    }

    @Override
    public String toString() {
        return "DayOfWeek{" + "name=" + name + '}';
    }
    
}
