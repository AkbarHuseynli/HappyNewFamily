/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme;

import java.util.Arrays;
import java.util.Random;
import static readme.Species.DOG;
import species.Dog;
import species.Fish;

/**
 *
 * @author user
 *
 */
public class Main {

    public static void main(String[] args) throws Throwable {
        Human mother = new Woman("Eric", "Diar", 33);
        Human father = new Man("Jack", "Diar", 30);
        Human son = new Man("Jony", "Diar", 6);
        Human daughter = new Woman("Hannah", "Diar", 8);
        Human[] children = {son, daughter};
        Pet pet = new Dog();
        
        Family diars = new Family(mother, father);
        diars.setChildren(children);
        diars.setPet(pet);
        diars.bornchild();
        System.out.println(Arrays.toString(diars.getChildren()));
//
    }
}
