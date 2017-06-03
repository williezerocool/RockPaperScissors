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
public class RockPaperScissorDriver extends RockPaperScissorGame{
    static String p1Name, p2Name, p1weapon, p2weapon;
    static int p1Id, p2Id, p1rounds, p2rounds, p1score, p2score;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        getPlayers();
        runningGame();
        
        if(p1score == p2score) {
            System.out.print("It was a tie");
        }else if(p1score > p2score) {
            System.out.print(p1Name + " you are the winner! You won " + p1score + " games");
        }else {
            System.out.print(p2Name + " you are the winner! You won " + p2score + " games");
        }
    
    
    }
        
        
    
         public static void getPlayers(){
             Scanner kb = new Scanner(System.in);
        
            System.out.print("Player 1 if your human enter your name else if you want to play the computer enter cpu: ");
            String input = kb.next();

            if("cpu".equals(input)) {
               RockPaperScissorPlayer player1 = new RockPaperScissorPlayer(input, 0);
               p1Name = player1.name;
               p1rounds = player1.rounds;
               p1Id = player1.id;
            }else {
                System.out.print("How many rounds do you want to play: ");
                int rounds = kb.nextInt();
                RockPaperScissorPlayer player1 = new RockPaperScissorPlayer(input, rounds);
                p1Name = player1.name;
                p1rounds = player1.rounds;
                p1Id = player1.id;
            }           

            System.out.print("Player 2 if your human enter your name else if you want to play the computer enter cpu: ");
            input = kb.next();

            if("cpu".equals(input)) {
               RockPaperScissorPlayer player2 = new RockPaperScissorPlayer(input, 0);
                p2Name = player2.name;
                p2rounds = player2.rounds;
                p2Id = player2.id;
            }else {
                System.out.print("How many rounds do you want to play: ");
                int rounds = kb.nextInt();
                RockPaperScissorPlayer player2 = new RockPaperScissorPlayer(input, rounds);
                p2Name = player2.name;
                p2rounds = player2.rounds;
                p2Id = player2.id;
            }
         }
         
         public static void weaponPick() {
             RockPaperScissorGame game = new RockPaperScissorGame();
             Scanner kb = new Scanner(System.in);
             
            if("cpu".equals(p1Name) ) {
                p1weapon = game.cpuWeapon();
            }
            if("cpu".equals(p2Name) ) {
                p2weapon = game.cpuWeapon();
            }
            if(!"cpu".equals(p1Name) ) {
                System.out.print(p1Name + " player" + (p1Id + 1) + " pick: (rock, paper, or scissors)");
                p1weapon = kb.next();
                if(p1weapon != "rock" || p1weapon != "paper" || p1weapon != "scissors") {
                    System.out.println("Invald entry, try again");
                    System.out.print(p1Name + " player" + (p1Id + 1) + " pick: (rock, paper, or scissors)");
                    p1weapon = kb.next();
                }
            }
            if(!"cpu".equals(p2Name)){
                System.out.print(p2Name + " player" + (p2Id + 1) + " pick: (rock, paper, or scissors)");
                p2weapon = kb.next();
                if(p2weapon != "rock" || p2weapon != "paper" || p2weapon != "scissors") {
                    System.out.println("Invald entry, try again");
                    System.out.print(p2Name + " player" + (p2Id + 1) + " pick: (rock, paper, or scissors)");
                    p2weapon = kb.next();
                }
            }
                 
          }
    
         public static void runningGame() {
              int count = p1rounds + p2rounds;
        while(count >= 1) {
            weaponPick();
            int winner = compairWeapon(p1weapon, p2weapon);
            if(winner == 2) {
                p1score += 1;
                System.out.println(p1Name + " won");
            }else if(winner == 1) {
                p2score += 1;
                System.out.println(p2Name + " won");
            }else if (winner == 0){

                System.out.println("tie, that game was a tie");
            }
            count --;

            }
         }
}
    
    

    
    
   

