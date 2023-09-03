package src.service;

import src.dao.FamilyDao;
import src.dao.CollectionFamilyDao;
import src.entities.Family;
import src.entities.Human;
import src.entities.Pet;

import java.util.List;

public class FamilyServiceImpl implements FamilyService {
    private final FamilyDao familyDao = new CollectionFamilyDao();

    public List<Family> getAllFamilies() {
        return familyDao.getAllFamilies();
    }

    @Override
    public boolean deleteFamily(int index) {
        return familyDao.deleteFamily(index);
    }

    @Override
    public boolean deleteFamily(Family fam) {
        return familyDao.deleteFamily(fam);
    }

    @Override
    public boolean saveFamily(Family fam) {
        return familyDao.saveFamily(fam);
    }

    @Override
    public void displayAllFamilies() {
        familyDao.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan(int index) {
        return familyDao.getFamiliesBiggerThan(index);
    }

    public List<Family> getFamiliesLessThan(int index) {
        return familyDao.getFamiliesLessThan(index);
    }
    @Override
    public void countFamiliesWithMemberNumber() {
        familyDao.countFamiliesWithMemberNumber();
    }
    public Family createNewFamily(Human mother, Human father) {
        return familyDao.createNewFamily(mother, father);
    }

    public boolean deleteFamilyByIndex(int index) {
        return familyDao.deleteFamilyByIndex(index);
    }

    public Family bornChild(Family fam) {
        return familyDao.bornChild(fam);
    }

    public Family adoptChild(Family fam, Human child) {
        return familyDao.adoptChild(fam, child);
    }

    public void deleteAllChildrenOlderThen(int age) {
        familyDao.deleteAllChildrenOlderThen(age);

    }

    public Family getFamilyById(int id) {
        return familyDao.getFamilyById(id);
    }

    public List<Pet> getPets(int famIndex) {

        return familyDao.getPets(famIndex);
    }

    public boolean addPet(int famIndex, Pet pet) {

        return familyDao.addPet(famIndex, pet);
    }

    public int count() {
        return familyDao.count();
    }
}
