package src.dao;

import src.entities.Family;
import src.entities.Human;
import src.entities.Pet;
import src.util.FileUtility;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao{
    private final static List<Family> familyList = new ArrayList<>();
    @Override
    public List<Family> getAllFamilies() {
        return null;
    }

    @Override
    public boolean deleteFamily(int index) {
        return false;
    }

    @Override
    public boolean deleteFamily(Family fam) {
        return false;
    }

    @Override
    public boolean saveFamily(Family fam) {
        if (familyList.stream().noneMatch(family -> family.equals(fam))) {

            familyList.add(fam);

        }
        String fName = "dataFile.obj";
        File saving = new File(fName);

        if (!saving.exists()) {
            try {
                saving.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {

            return FileUtility.writeObjectToFile(familyList, fName);

        } catch (Exception ex) {
            System.out.println("Exception occured during saving");
            return false;
        }
    }

    @Override
    public void displayAllFamilies() {
        familyList.forEach(System.out::println);
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int index) {
        return familyList
                .stream().filter(s -> s.countFamily() > index)
                .toList();
    }

    @Override
    public List<Family> getFamiliesLessThan(int index) {
        return familyList
                .stream().filter(s -> s.countFamily() < index)
                .toList();
    }

    @Override
    public void countFamiliesWithMemberNumber() {
        System.out.println("Total families: " + familyList.size());
        for (Family family : familyList) {
            System.out.println("Member count of " + family.getFather().getSurname() + " is " + family.countFamily());
        }

    }
    @Override
    public Family createNewFamily(Human mother, Human father) {
        Family fam = new Family(mother, father);
        familyList.add(fam);
        return fam;
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        return false;
    }

    @Override
    public Family bornChild(Family fam) {
        if (fam.addChild(fam.bornchild())) {
            return fam;
        } else {
            return null;
        }
    }

    @Override
    public Family adoptChild(Family fam, Human child) {
        if (fam.addChild(child)) {
            return fam;
        } else {
            return null;
        }
    }

    @Override
    public void deleteAllChildrenOlderThen(int age) {
        familyList.stream()
                .filter(s -> s.getChildren().removeIf(x -> x.getAge() > age))
                .forEach(this::saveFamily);
    }

    @Override
    public Family getFamilyById(int id) {
        return null;
    }

    @Override
    public List<Pet> getPets(int famIndex) {
        return null;
    }

    @Override
    public boolean addPet(int famIndex, Pet pet) {
        return false;
    }

    @Override
    public int count() {
        return 0;
    }
}
