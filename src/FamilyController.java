package src;

public class FamilyController extends FamilyService{
    private FamilyService familyService;//to access the application' business logic methods

    public FamilyService getFamilyService() {
        return familyService;
    }

    public void setFamilyService(FamilyService familyService) {
        this.familyService = familyService;
    }
}
