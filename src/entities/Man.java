/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.entities;

/**
 *
 * @author user
 */
public class Man extends Human {

    public Man(String name, String surname, int age) {
        super(name, surname, age);
    }


    public Man() {
    }
        
    @Override
    public void greetPet(Pet pet) {
        System.out.println("Hello" + pet.getNickname());
    }
    
}
