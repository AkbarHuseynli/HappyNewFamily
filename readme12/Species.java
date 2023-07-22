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
public enum Species {
    DOG(false, 4, true), CAT(false, 4, true), HAMSTER(false, 4, false), PARROT(true, 2, false), RABBIT(false, 4, true);
    
        private boolean canFly;
        private int numberOfLegs;
        private boolean hasFur;
    
    Species(boolean canFly, int numberOfLegs, boolean hasFur){
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    
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
