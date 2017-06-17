/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissor;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author kendrabooker
 */
public class ComputerPlayer implements RockPaperScissorPlayer{
    
    //ComputerPlayer(){}
    
    public String getName() {
        String name = "cpu";
        return name;
    }
    
    public String getWeapon(String name) {
        System.out.println(name + " picking weapon...");
        System.out.println();
        Random r = new Random();
        int num = 1 + r.nextInt(2);
        
        if(num == 1) 
            return "rock";
        else if(num == 2)
            return "paper";
        else
            return "scissors";
    }

    public int getRounds() {
        return 0;
    }

}
