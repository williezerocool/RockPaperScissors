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

public class HumanPlayer implements RockPaperScissorPlayer{
   
    
    HumanPlayer(){
        
    }
    
    public String getName() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = s.next();
        return name;
    }
    
   
    public String getWeapon(String name) {
        Scanner s = new Scanner(System.in);
        System.out.print(name + " Pick ");
        for(Weapon w : Weapon.values() ) 
            System.out.printf(" %s ", w);
            String weapon = s.next();
        
        if("rock".equals(weapon) ) 
            return "rock";
        else if ("paper".equals(weapon)) 
            return "paper";
        else
            return "scissors";
        
    }
    
    public int getRounds(){
        Scanner s = new Scanner(System.in);
        System.out.print("How many rounds would you like to play for? ");
        int rounds = s.nextInt();
        if(rounds > 10){
            System.out.println("Error! Max rounds a player can select is 10");
            System.out.print("How many rounds would you like to play for? ");
            rounds = s.nextInt();
        }
        
        return rounds;
    }
    
}