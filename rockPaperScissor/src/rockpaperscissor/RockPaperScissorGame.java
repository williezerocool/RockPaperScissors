/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissor;

import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author kendrabooker
 */
public class RockPaperScissorGame{
    //public int score;
    public static String cpuWeapon, compairWeapon;
    
    RockPaperScissorGame() {
        cpuWeapon = "";
        compairWeapon = "";
    }
  
    public String cpuWeapon() {
        Random r = new Random();
        int num = 1 + r.nextInt(2);
        
        switch(num){
            case 1:{
                cpuWeapon = "rock";
            }
            case 2:{
                cpuWeapon = "paper";
            }
            case 3:{
                cpuWeapon = "scissors";
            }
            default:{
               // cpuWeapon();
            }
        }
        
        return cpuWeapon;
    }
    
    public static int compairWeapon(String player1Weapon, String player2Weapon) {
        
        int winner = 0;
        if("rock".equals(player1Weapon) && "scissors".equals(player2Weapon)) {
            winner = 2;
        }else if("rock".equals(player1Weapon) && "paper".equals(player2Weapon)) {
            winner = 1;
        }else if("rock".equals(player1Weapon) && "rock".equals(player2Weapon)) {
            winner = 0;
        }else if("paper".equals(player1Weapon) && "rock".equals(player2Weapon)) {
            winner = 2;
        }else if("paper".equals(player1Weapon) && "sicssors".equals(player2Weapon)) {
            winner = 1;
        }else if("paper".equals(player1Weapon) && "paper".equals(player2Weapon)) {
            winner = 0;
        }else if("scissors".equals(player1Weapon) && "paper".equals(player2Weapon)) {
            winner = 2;
        }else if("scissors".equals(player1Weapon) && "rock".equals(player2Weapon)) {
            winner = 1;
        }else if("scissors".equals(player1Weapon) && "scissors".equals(player2Weapon)) {
            winner = 0;
        }
        return winner;
    }
    
}
