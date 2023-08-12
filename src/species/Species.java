/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.species;

/**
 *
 * @author user
 */
public enum Species {
    DOG(false, 4, true),
    DOMESTICCAT(false, 4, true),
    FISH(false, 0, false),
    ROBOTCAT(false, 4, false),
    UNKNOWN;
    
        private boolean canFly;
        private int numberOfLegs;
        private boolean hasFur;
    
    Species(boolean canFly, int numberOfLegs, boolean hasFur){
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
    Species(){
        System.out.println("NO TYPE");
    }

    public boolean isCanFly() {
        return canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public boolean HasFur() {
        return hasFur;
    }
    
    @Override
    public String toString() {
        return "Species{" + '}';
    }
    
   
    
}
