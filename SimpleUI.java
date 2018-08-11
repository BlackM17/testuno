//Adding this line to test git version control.
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab5;

import java.util.Scanner;

/**
 *
 * @author mabbouch
 */
public class SimpleUI implements UserInterface{
    
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
       System.out.println ("\nDealer Holds:");
       System.out.println (game.getHouseCards().toString());
       System.out.println ("\nYou Hold:");
       System.out.println (game.getYourCards().toString());
        //FIX THIS
    }

  @Override
    public boolean hitMe() {
      System.out.println ("Another card?    (yes/no)");
      String hitme= user.nextLine();
      return ("yes".equals(hitme));
        //FIX THIS
    }
    
  @Override
    public void gameOver() {
        int x=game.score(game.getHouseCards());
        int y=game.score(game.getYourCards());
        System.out.println("The Game is Over:");
        System.out.println ("The Dealers score is "+ x);
        System.out.println ("Your score is "+ y);
            if (y>21 || ((x<22) && y<=x) ){
                System.out.println("YOU LOSE");
            }
            else if ((y<22 && x>21)||(y<22 && y>x)){
                System.out.println ("YOU WIN");
        //FIX THIS
    }
    }

    
}
