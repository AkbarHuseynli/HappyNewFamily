package src.dao;

import src.Family;
import src.Human;
import src.Pet;

import java.util.List;

public interface FamilyDao {
     public abstract List<Family> getAllFamilies();
     public abstract Family getFamilyByIndex(int index);
     public abstract boolean deleteFamily(int index);
     public abstract boolean deleteFamily(Family fam);
     public abstract boolean saveFamily(Family fam);
     public abstract void displayAllFamilies();
     public abstract void getFamiliesBiggerThan(int index);
     public abstract void getFamiliesLessThan(int index);
     public abstract int countFamiliesWithMemberNumber(int memberCount);
     public abstract Family createNewFamily(Human mother, Human father);
     public abstract boolean deleteFamilyByIndex(int index);
     public abstract Family bornChild(Family fam);
     public abstract Family adoptChild(Family fam, Human child);
     public abstract boolean deleteAllChildrenOlderThen(int age);
     public abstract Family getFamilyById(int id);
     public abstract List<Pet> getPets(int famIndex);
     public abstract boolean addPet(int famIndex, Pet pet);

     public abstract int count();




}
