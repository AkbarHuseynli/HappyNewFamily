package src.dao;

import src.entities.Family;
import src.entities.Human;
import src.entities.Pet;
import src.util.FileUtility;
import java.util.List;

public class FamilyService extends CollectionFamilyDao implements FamilyDao {
//    private FamilyDao familyDao;// to access stored data

    public List<Family> getAllFamilies() {

        return this.getFamilyList();
    }

    @Override
    public boolean deleteFamily(int index) {
        return this.getFamilyList().remove(getFamilyById(index));
    }

    @Override
    public boolean deleteFamily(Family fam) {
        return this.getFamilyList().remove(fam);
    }

    @Override
    public boolean saveFamily(Family fam) {
        if (this.getFamilyList().stream().noneMatch(family -> family.equals(fam))) {

            this.getFamilyList().add(fam);

        }

        try {

            // this.familyList = (List<Family>) FileUtility.readFileDeserialize("familyList.txt");
            FileUtility.writeObjectToFile(this.getFamilyList(), "familylist.txt");
//            JSONObject json = new JSONObject();
//            ObjectMapper om = new ObjectMapper();
//            byte[] x = om.writeValueAsBytes(this.getFamilyList());
        } catch (Exception ex) {
            System.out.println("Exception occured during saving");
        }

        return false;
    }

    @Override
    public void displayAllFamilies() {
        this.getFamilyList().forEach(System.out::println);
    }

    public List<Family> getFamiliesBiggerThan(int index) {

        return this.getFamilyList()
                .stream().filter(s -> s.countFamily() > index)
                .toList();

    }

    public List<Family> getFamiliesLessThan(int index) {
        return this.getFamilyList()
                .stream().filter(s -> s.countFamily() < index)
                .toList();

    }

    @Override
    public void countFamiliesWithMemberNumber() {
        System.out.println("Total families: " + this.getFamilyList().size());
        for (Family family : this.getFamilyList()) {
            System.out.println("Member count of " + family.getFather().getSurname() + " is " + family.countFamily());
        }

    }

    public Family createNewFamily(Human mother, Human father) {
        Family fam = new Family(mother, father);
        this.getFamilyList().add(fam);
        return fam;
    }

    public boolean deleteFamilyByIndex(int index) {
        List<Family> famList = this.getFamilyList();
        return famList.remove(famList.get(index));
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

    public void deleteAllChildrenOlderThen(int age) {
        this.getFamilyList().stream()
                .filter(s -> s.getChildren().removeIf(x -> x.getAge() > age))
                .forEach(this::saveFamily);

    }

    public Family getFamilyById(int id) {

        return this.getFamilyList().get(id);
    }

    public List<Pet> getPets(int famIndex) {

        return this.getFamilyList().get(famIndex).getPet().stream().toList();
    }

    public boolean addPet(int famIndex, Pet pet) {

        return this.getFamilyList().get(famIndex).getPet().add(pet);
    }

    public int count() {
        return this.getFamilyList().size();
    }
}
