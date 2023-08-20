/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.species;

import src.entities.Pet;

/**
 *
 * @author user
 */
public class Fish extends Pet {

    public Fish(String nickname) {
        super(nickname);
    }

    @Override
    public void respond() {
        System.out.println("Hello, owner. I am - " + this.getNickname() + ". I miss you!");

    }

    @Override
    public void foul() {
        System.out.println("Hello, owner. I am - " + this.getNickname() + ". I miss you!");

    }

    @Override
    public String toString() {
        return "Fish{" + '}';
    }

}
