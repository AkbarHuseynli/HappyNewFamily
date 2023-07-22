/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme12;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

/**
 *
 *
 * @author user
 *
 *
 */
public class Human {

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

    public Human(String name, String surname, int year, int IQ, HashMap<DayOfWeek, String>[] schedule, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.IQ = IQ;
        this.schedule = schedule;
        this.family = family;
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

    public void greetPet() {
        System.out.println("Hello" + this.getFamily().getPet().getNickname());
    }

    public void describePet() {
        String slyLevel = "";
        int sl = this.family.getPet().getTrickLevel();

        if (sl > 50) {
            slyLevel = "very sly";
        } else if (sl < 50) {
            slyLevel = "almost not sly";

        }

        System.out.println("I have a " + this.family.getPet().getType().name()
                + ", he is " + this.family.getPet().getAge()
                + " years old,"
                + " he is " + slyLevel);
    }

    public boolean feedPet(boolean feedingTime) {
        if (feedingTime) {

            Random rand = new Random();
            int randomNum = 1 + rand.nextInt((99) + 1);

            if (this.getFamily().getPet().getTrickLevel() > randomNum) {
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
                + ", year=" + year + ", IQ=" + IQ + Arrays.toString(schedule);
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
