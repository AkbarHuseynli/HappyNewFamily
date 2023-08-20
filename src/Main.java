
package src;

import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import src.util.FileUtility;


public class Main {

    public static void main(String[] args) throws Throwable {
//        Human mother = new Woman("Eric", "Diar", 33);
//        Human father = new Man("Jack", "Diar", 30);
//        Human son = new Man("Jony", "Diar", 6);
//        Human daughter = new Woman("Hannah", "Diar", 8);
//        List<Human> children = new ArrayList<>();
//
//
//        Pet pet = new Dog();
//        Pet pet2 = new DomesticCat();
//        HashSet<Pet> pets = new HashSet<>();
//
//
//        Family diars = new Family(mother, father);
//
//        diars.setChildren(children);
//
//        diars.setPet(pets);
//
//        diars.bornchild();
//
//        System.out.println(diars.getChildren());
        FamilyController famc = new FamilyController();
        famc.getFamilyService();

        List<String> ls = new ArrayList<>();
        ls.add("salam");
        ls.add("yaxsiya,");
        ls.add("sakdsakda");
        ObjectMapper om = new ObjectMapper();
        byte[] x = om.writeValueAsBytes(ls);
        FileUtility.byteWrite("C:\\Users\\user\\IdeaProjects\\HappyNewFamily\\docs\\package.json", x);



    }
}
