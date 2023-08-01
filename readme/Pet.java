/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author user
 */
public abstract class Pet {

    private String nickname;
    private int age;
    private int trickLevel;
    private HashSet<String> habits;
    

    public Pet(String nickname) {
        this.nickname = nickname;
    }

    public Pet( String nickname, int age, int trickLevel) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet() {
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

    public HashSet<String> getHabits() {
        return habits;
    }

    public void setHabits(HashSet<String> habits) {
        this.habits = habits;
    }


    public void eat() {
        System.out.println("I'm eating");
    }

    public abstract void respond();
    

    public abstract void foul();

    @Override
    public String toString() {
        return "Pet{" + "nickname=" + nickname + ", age=" + age + ", trickLevel=" + trickLevel + ", habits=" + habits + '}';
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("PET CLEANUP ");
    }
}
