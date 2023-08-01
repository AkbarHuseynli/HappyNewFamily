package readme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import util.Methods;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Family implements HumanCreator {

    private final Human mother;
    private final Human father;
    private List<Human> children;
    private HashSet<Pet> pet;

    static {
        System.out.println("New Family class is being loaded!");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        children = null;
    }

    {
        System.out.println("New object is created!");

    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public HashSet<Pet> getPet() {
        return pet;
    }

    public void setPet(HashSet<Pet> pet) {
        this.pet = pet;
    }

    public void addChild(Human child) {
        this.children.add(child);

    }

    public boolean deleteChild(int index) {
        boolean status = false;
        Human child = this.children.get(index);
        if (this.children.remove(child)) {
            status = true;

        }

        return status;
    }

    public boolean deleteChild(Human child) {
        boolean status = false;
        if (this.children.remove(child)) {
            status = true;
        }

        return status;
    }

    public int countFamily() {
        int l = this.children.size();
        int x = 0;
        if (this.pet != null) {
            x = 1;
        }
        return l + x + 2;
    }

    @Override
    public Human bornchild() {
        int rn = Methods.randomNum(1, 2);
        Human child = rn == 1 ? new Man() : new Woman();
        String name = rn == 1 ? "male" : "female";
        child.setName(Methods.randomName(name));
        child.setSurname(this.getFather().getSurname());
        child.setIQ((this.getFather().getIQ() + this.getMother().getIQ()) / 2);
        child.setAge(0);
        child.setFamily(this);
        addChild(child);
        return child;
    }

    @Override
    public String toString() {
        return "mother=" + mother.getName() + ", father=" + father.getName() + ", children=" + children.toString() + ", pet=" + pet.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("FAMILY CLEANUP ");
    }

}
