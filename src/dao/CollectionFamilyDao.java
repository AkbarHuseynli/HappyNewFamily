package src.dao;

import src.Family;
import src.Human;
import src.Pet;
import src.dao.FamilyDao;
import src.util.FileUtility;

import java.io.File;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family> familyList;

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }

    @Override
    public List<Family> getAllFamilies() {

        return this.familyList;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        try{
            return this.familyList.get(index);
        }
        catch(NullPointerException ex){
            return null;
        }

    }

    @Override
    public boolean deleteFamily(int index) {
        return this.familyList.remove(this.familyList.get(index));
    }

    @Override
    public boolean deleteFamily(Family fam) {
        return this.familyList.remove(fam);
    }

    @Override
    public boolean saveFamily(Family fam) {
        if(!this.familyList.stream().anyMatch(family -> family.equals(fam))){

            this.familyList.add(fam);

        }
        else{
            try{

                this.familyList = (List<Family>) FileUtility.readFileDeserialize("familyList.txt");
            FileUtility.writeObjectToFile(this.familyList,"familylist.txt");}
            catch(Exception ex){
                System.out.println("Exception occured during saving");
            }
        }
        return false;
    }

    @Override
    public void displayAllFamilies() {

    }

    @Override
    public void getFamiliesBiggerThan(int index) {

    }

    @Override
    public void getFamiliesLessThan(int index) {

    }

    @Override
    public int countFamiliesWithMemberNumber(int memberCount) {
        return 0;
    }

    @Override
    public Family createNewFamily(Human mother, Human father) {
        return null;
    }

    @Override
    public boolean deleteFamilyByIndex(int index) {
        return false;
    }

    @Override
    public Family bornChild(Family fam) {
        return null;
    }

    @Override
    public Family adoptChild(Family fam, Human child) {
        return null;
    }

    @Override
    public boolean deleteAllChildrenOlderThen(int age) {
        return false;
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
