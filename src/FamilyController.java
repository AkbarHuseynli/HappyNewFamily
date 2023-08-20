package src;

import src.dao.FamilyService;

public class FamilyController{
    private FamilyService familyService;//to access the application' business logic methods

    public FamilyService getFamilyService() {
        return familyService;
    }

    public void setFamilyService(FamilyService familyService) {
        this.familyService = familyService;
    }
}
