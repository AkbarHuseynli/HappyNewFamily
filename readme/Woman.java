/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readme;

import java.util.HashMap;

/**
 *
 * @author user
 */
public class Woman extends Human {

    public Woman(String name, String surname, int age) {
        super(name, surname, age);
    }

    public Woman() {
    }

    @Override
    public void greetPet() {
        System.out.println("Hello" + this.getFamily().getPet().getNickname());
    }
}
