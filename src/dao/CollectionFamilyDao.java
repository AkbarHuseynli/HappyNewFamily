package src.dao;

import src.entities.Family;

import java.util.List;

public class CollectionFamilyDao {
    private List<Family> familyList;

    public List<Family> getFamilyList() {
        return familyList;
    }

    public void setFamilyList(List<Family> familyList) {
        this.familyList = familyList;
    }
}
