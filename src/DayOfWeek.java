
package src;


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
