package readme12;

import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Family {

    private final Human mother;
    private final Human father;
    private Human[] children;
    private Pet pet;

    static {
        System.out.println("New Family class is being loaded!");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = null;
        System.out.println("New object is created!");
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        int l = this.children.length;
        Human[] newChildren = Arrays.copyOf(this.children, l + 1);

        newChildren[l] = child;
        this.children = newChildren;

    }

    public boolean deleteChild(int index) {
        boolean status = false;
        int l = this.children.length;
        if (index >= 0 && index < l) {
            this.children[index] = null;
            Human[] newChildren = new Human[l - 1];
            int j = 0;
            for (int i = 0; i < l; i++) {
                if (this.children[i] != null) {
                    newChildren[j] = this.children[i];
                    j++;
                }

            }
            this.children = newChildren;
            status = true;
        }

        return status;
    }

    public boolean deleteChild(Human child) {
        boolean status = false;
        int l = this.children.length;
        for (int i = 0; i < l; i++) {
            if (children[i].equals(child)) {
                this.children[i] = null;

                Human temp = this.children[l - 1];
                this.children[l - 1] = this.children[i];
                this.children[i] = temp;
                status = true;
            }
        }
        this.children = Arrays.copyOf(this.children, l - 1);

        return status;
    }

    public int countFamily() {
        int l = this.children.length;
        int x = 0;
        if (this.pet != null) {
            x = 1;
        }
        return l + x + 2;
    }
    @Override
    public Human bornchild() {
        int rn= ThreadLocalRandom.current().nextInt(1, 3);
        Human child =  rn == 1 ? new Man() : new Woman();
        child.setSurname(this.getFather().getSurname());
        child.setIQ((this.getFather().getIQ()+this.getMother().getIQ())/2);
        child.setAge(0);
        child.setFamily(this);
        addChild(child);
        return child;
        }
    @Override
    public String toString() {
        return "mother=" + mother.getName() + ", father=" + father.getName() + ", children=" + Arrays.toString(children) + ", pet=" + pet.getNickname();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("FAMILY CLEANUP ");
    }

}
