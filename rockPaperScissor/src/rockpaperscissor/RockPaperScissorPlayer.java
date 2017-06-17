/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissor;

import java.util.Scanner;

/**
 *
 * @author kendrabooker
 */

public interface RockPaperScissorPlayer {
   
    public enum Weapon {
        ROCK, PAPER, SCISSORS;
    }
    /* I started out with getWeapon as a enum type, but I had a problem returning a enum value and using it.
    ** I was able to return the value but I wasn't able to store the value into a variables that I could use to
    ** compaire each players weapon pick. I also couldn't find anything that showed me how, so I turned the method into
    ** a string.
    */
    String getWeapon(String name);
   
    String getName();
    
    int getRounds();
    
}