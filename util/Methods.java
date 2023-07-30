/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author user
 */
public class Methods {

    public static int randomNum(int min, int max) {
        int rn = ThreadLocalRandom.current().nextInt(min, max + 1);

        return rn;
    }

    public static String randomName(String gender) {
        Random generate = new Random();
        String[] name = {"unknown", "unknown", "unknown"};
        if (gender.equalsIgnoreCase("male")) {
            name[0] = "Marcus";
            name[1] = "Ali";
            name[2] = "Henry";

        } else if (gender.equalsIgnoreCase("female")) {
            name[0] = "Olivia";
            name[1] = "Emma";
            name[2] = "Amelia";

        }

        return name[generate.nextInt(name.length)];

    }
}
