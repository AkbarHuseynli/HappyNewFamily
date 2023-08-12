package src;

import src.dao.FamilyDao;

import java.util.List;

public class FamilyService {
    private FamilyDao familyDao;// to access stored data

    public void displayAllFamilies() {
        this.familyDao.getAllFamilies().forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int index) {

        return this.familyDao.getAllFamilies().stream().filter(s -> s.countFamily() > index).toList();
    }

    public List<Family> getFamiliesLessThan(int index) {
        return this.familyDao.getAllFamilies().stream().filter(s -> s.countFamily() < index).toList();

    }

    public int countFamiliesWithMemberNumber(Family fam) {
        return fam.countFamily();
    }

    public Family createNewFamily(Human mother, Human father) {
        Family fam = new Family(mother, father);
        this.familyDao.getAllFamilies().add(fam);
        return fam;
    }

    public boolean deleteFamilyByIndex(int index) {
        List<Family> faml = this.familyDao.getAllFamilies();
        boolean result = faml.remove(faml.get(index));
        return result;
    }

    public Family bornChild(Family fam) {
        if (fam.addChild(fam.bornchild())) {
            return fam;
        } else {
            return null;
        }
    }

    public Family adoptChild(Family fam, Human child) {

        if (fam.addChild(child)) {
            return fam;
        } else {
            return null;
        }
    }

    public boolean deleteAllChildrenOlderThen(int age) {
        return false;
    }

    public Family getFamilyById(int id) {
        return null;
    }

    public List<Pet> getPets(int famIndex) {
        return null;
    }

    public boolean addPet(int famIndex, Pet pet) {
        return false;
    }

    public int count() {
        return 0;
    }
}
