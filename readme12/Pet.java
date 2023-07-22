/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme12;

import java.util.Arrays;

/**
 *
 * @author user
 */
public class Pet {

    private Species type;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet(Species type, String nickname) {
        this.type = type;
        this.nickname = nickname;
    }

    public Pet(Species type, String nickname, int age, int trickLevel) {
        this.type = type;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
    }

    public Species getType() {
        return type;
    }

    public void setType(Species type) {
        this.type = type;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public void setTrickLevel(int trickLevel) {
        if (trickLevel >= 1 && trickLevel <= 100) {
            this.trickLevel = trickLevel;
        } else {
            System.err.println("Wrong trickLevel number!");
        }
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I'm eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I am - " + this.getNickname() + ". I miss you!");
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return type + ", nickname=" + nickname + 
                ", age=" + age + ", trickLevel=" + trickLevel + 
                ", habits=" + Arrays.toString(habits) +
                ", canFly=" + this.type.isCanFly()+
                ", hasFur=" + this.type.HasFur()+
                ", numberOfLegs=" + this.type.getNumberOfLegs();
    }

   
    

    @Override
    protected void finalize() throws Throwable {
        System.out.println("PET CLEANUP ");
    }
}
