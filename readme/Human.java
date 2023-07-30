/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import util.Methods;

/**
 *
 *
 * @author user
 *
 *
 */
public abstract class Human {

    private String name;
    private String surname;
    private int year;
    private int IQ;
    private HashMap<DayOfWeek, String>[] schedule;
    private Family family;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.year = age;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return year;
    }

    public void setAge(int age) {
        this.year = age;
    }

    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        if (IQ >= 1 && IQ <= 100) {
            this.IQ = IQ;
        } else {
            System.err.println("Wrong IQ number!");
        }
    }

    public HashMap<DayOfWeek, String>[] getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<DayOfWeek, String>[] schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {

        this.family = family;
    }

    public abstract void greetPet();

    public void describePet() {
        int sl = this.family.getPet().getTrickLevel();

        String slyLevel = sl > 50 ? "very sly" : "almost not sly";

        System.out.println("I have a " + this.family.getPet().getNickname()
                + ", he is " + this.family.getPet().getAge()
                + " years old,"
                + " he is " + slyLevel);
    }

    public boolean feedPet(boolean feedingTime) {
        if (feedingTime) {

            int rn = Methods.randomNum(1, 99);

            if (this.getFamily().getPet().getTrickLevel() > rn) {
                System.out.println("Hm... I will feed " + this.getFamily().getPet().getNickname());
                return true;
            } else {
                System.out.println("I think " + this.getFamily().getPet().getNickname() + "is not hungry");
                return false;
            }

        } else {
            System.out.println("I think " + this.getFamily().getPet().getNickname() + "is not hungry");
            return false;
        }

    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", surname=" + surname
                + ", year=" + year + ", IQ=" + IQ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.family, other.family)) {
            return false;
        }
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("HUMAN CLEANUP ");
    }

}
