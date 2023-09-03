package src.service;

import src.entities.Family;
import src.entities.Human;
import src.entities.Pet;

import java.util.List;

public interface FamilyService  {
    List<Family> getAllFamilies();

    boolean deleteFamily(int index);

    boolean deleteFamily(Family fam);

    boolean saveFamily(Family fam);

    void displayAllFamilies();

    List<Family> getFamiliesBiggerThan(int index);

    List<Family> getFamiliesLessThan(int index);

    void countFamiliesWithMemberNumber();

    Family createNewFamily(Human mother, Human father);

    boolean deleteFamilyByIndex(int index);

    Family bornChild(Family fam);

    Family adoptChild(Family fam, Human child);

    void deleteAllChildrenOlderThen(int age);

    Family getFamilyById(int id);

    List<Pet> getPets(int famIndex);

    boolean addPet(int famIndex, Pet pet);

    int count();


}
