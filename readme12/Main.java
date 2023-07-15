/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme12;

import java.util.Arrays;
import java.util.Random;
import static readme12.Species.CAT;
import static readme12.Species.DOG;
import static readme12.Species.PARROT;

/**
 *
 * @author user
 *
 */
public class Main {

    public static void main(String[] args) throws Throwable {
        Human mother = new Human("Eric", "Diar", 33);
        Human father = new Human("Jack", "Diar", 30);
        Human son = new Human("Jony", "Diar", 6);
        Human daughter = new Human("Hannah", "Diar", 8);
        Human[] children = {son, daughter};

        Human son2 = new Human("Alex", "Diar", 3);
        Pet pet = new Pet(CAT,"RICKO",2,76);

        Family diars = new Family(mother, father);

        mother.setFamily(diars);
        father.setFamily(diars);
        son.setFamily(diars);
        daughter.setFamily(diars);
        diars.setChildren(children);
        diars.setPet(pet);
        
        System.out.println(daughter.getFamily().toString());
        daughter.feedPet(true);
        son.describePet();

        int x =diars.countFamily();
        System.out.println("FAMILY MEMBER COUNT: "+x);
        
    }
}
