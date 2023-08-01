/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import static species.Species.DOG;
import species.Dog;
import species.DomesticCat;
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
        List<Human> children = new ArrayList<>();

        Pet pet = new Dog();
        Pet pet2 = new DomesticCat();
        HashSet<Pet> pets = new HashSet<>();

        Family diars = new Family(mother, father);
        diars.setChildren(children);
        diars.setPet(pets);
        diars.bornchild();
        System.out.println(diars.getChildren());
    }
}
