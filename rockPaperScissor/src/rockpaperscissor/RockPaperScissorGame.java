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
public class RockPaperScissorGame {
   public String p1Name, p2Name, p1weapon, p2weapon;
   public int p1rounds, p2rounds, p1score, p2score;
   RockPaperScissorPlayer player1;
   RockPaperScissorPlayer player2;
   
   RockPaperScissorGame() {
       p1Name = ""; 
       p2Name = ""; 
       p1weapon = "";
       p2weapon = "";
       p1rounds = 0;
       p2rounds = 0;
       p1score = 0;
       p2score = 0;
       
       Scanner s = new Scanner(System.in);
       System.out.print("Do you want this player to be 'human' or 'cpu'? ");
       String input = s.next();
       
       
       if("cpu".equals(input)){
           RockPaperScissorPlayer player1 = new ComputerPlayer();
           this.player1 = player1;
           p1Name = this.player1.getName();
           p1rounds = this.player1.getRounds();
       }else {
           RockPaperScissorPlayer player1 = new HumanPlayer();
           this.player1 = player1;
           p1Name = this.player1.getName();
           p1rounds = this.player1.getRounds();
       }
       
       System.out.println();
       System.out.print("Do you want this player to be 'human' or 'cpu'? ");
       input = s.next();
       
       
       if("cpu".equals(input)){
           RockPaperScissorPlayer player2 = new ComputerPlayer();
           this.player2 = player2;
           p2Name = this.player2.getName();
           p2rounds = this.player2.getRounds();
       }else {
           RockPaperScissorPlayer player2 = new HumanPlayer();
           this.player2 = player2;
           p2Name = this.player2.getName();
           p2rounds = this.player2.getRounds();
       }
       game();
       displayWinner();
    }
    
    
    
    
    public enum Outcome {
        PLAYER1WINS, PLAYER2WINS, TIE
    }
    
    public void game() {
       int totalRounds = p1rounds + p2rounds;
       
       while(totalRounds != 0) {
           p1weapon = player1.getWeapon(p1Name);
           p2weapon = player2.getWeapon(p2Name);
           
           if("rock".equals(p1weapon) && "scissors".equals(p2weapon)) {
               System.out.printf("%s %s", p1Name, Outcome.PLAYER1WINS);
               System.out.println();
               p1score++;
           } else if ("rock".equals(p1weapon) && "paper".equals(p2weapon)) {
               System.out.printf("%s %s", p2Name, Outcome.PLAYER2WINS);
               System.out.println();
               p2score++;
           } else if ("rock".equals(p1weapon) && "rock".equals(p2weapon)) {
               System.out.printf("%s", Outcome.TIE);
               System.out.println();
           } else if ("paper".equals(p1weapon) && "rock".equals(p2weapon)) {
               System.out.printf("%s %s", p1Name, Outcome.PLAYER1WINS);
               System.out.println();
               p1score++;
           } else if ("paper".equals(p1weapon) && "scissors".equals(p2weapon)) {
               System.out.printf("%s %s", p2Name, Outcome.PLAYER2WINS);
               System.out.println();
               p2score++;
           } else if ("paper".equals(p1weapon) && "paper".equals(p2weapon)) {
               System.out.printf("%s", Outcome.TIE);
               System.out.println();
           } else if ("scissors".equals(p1weapon) && "paper".equals(p2weapon)) {
               System.out.printf("%s %s", p1Name, Outcome.PLAYER1WINS);
               System.out.println();
               p1score++;
           } else if ("scissors".equals(p1weapon) && "rock".equals(p2weapon)) {
               System.out.printf("%s %s", p2Name, Outcome.PLAYER2WINS);
               System.out.println();
               p2score++;
           } else if ("scissors".equals(p1weapon) && "scissors".equals(p2weapon)) {
               System.out.printf("%s", Outcome.TIE);
               System.out.println();
           }
           totalRounds--;
       }
        
    }
    
    public void displayWinner() {
        Scanner s = new Scanner(System.in);
        if(p1score > p2score) {
            System.out.println(p1Name + " has won the game");
        }else if (p2score > p1score) {
            System.out.println(p2Name + " has won the game");
        }else {
            System.out.println( "It was a tie, want to play again ('yes' or 'no')? ");
            String input = s.next();
            if("yes".equals(input)) {
                RockPaperScissorGame game = new RockPaperScissorGame();
            }
        }
    }
    
   

}