import java.util.*;
public class Gambling_Simulator {
    public static void main (String[] args){
        int stake_of_Gambler= 100;              //Intialising amount present in stake_of_Gambler
        int bet_for_Game = 1;                       //Intialising how much amount gamer bet in bet_for_Game
        Random ran = new Random();
        int i = ran.nextInt(2);                 //generating random number to check Gamer win loose the Game

        /*
         *   Declaring condition for Gamer to win in if condition
         * */

        if (i==0){
            System.out.println("Player won the game");
            stake_of_Gambler=stake_of_Gambler+bet_for_Game;         //Adding amount to Gamer stake after hi wins
        }
        else{
            System.out.println("Player loss the Game");
            stake_of_Gambler=stake_of_Gambler-bet_for_Game;         //Removing amount loosen by Gamer when he loose the Game
        }

    }
}
