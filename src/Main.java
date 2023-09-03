package src;

import src.controller.FamilyController;
import src.entities.Family;
import src.entities.Human;
import src.entities.Man;
import src.entities.Woman;


public class Main {

    public static void main(String[] args) throws Throwable {
        Human mother1 = new Woman("Alice", "Smith", 35);
        Human father1 = new Man("Bob", "Smith", 40);
        Family family1 = new Family(mother1, father1);

        String fName = "C:\\Users\\user\\IdeaProjects\\HappyNewFamily\\docs\\newFile.txt";
//        FileUtility.writeObjectToFile(list,fName);
//        List<String> x= (List<String>) FileUtility.readFileDeserialize(fName);


    }


}
