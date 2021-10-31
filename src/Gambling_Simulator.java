import java.util.Random;

public class Gambling_Simulator {
    public static void main (String[] args){
        int stake_of_Gambler= 100;                  //Intialising amount present with Gambler before starting Game in stake_of_Gambler
        int bet_for_Game = 1;                       //Intialising how much amount gamer bet in bet_for_Game
        int count =1;
        /*
         * Implementing condition given in UC3 i.e winning of Half of his stake using while loop
         * */
        while(stake_of_Gambler <=149 && stake_of_Gambler>=51)
        {
            Random ran = new Random();
            int i = ran.nextInt(2);             //generating random number to check Gamer win loose the Game
            if (i == 0) {
                stake_of_Gambler = stake_of_Gambler + bet_for_Game;     //Adding amount to Gamer stake after hi wins
                count++;
            }
            else {
                stake_of_Gambler = stake_of_Gambler - bet_for_Game;     //Removing amount loosen by Gamer when he loose the Game
                count++;
            }
        }
        System.out.println("The amount at Gamer after end of Game : "+stake_of_Gambler);//Total stake left with Gambler
    }                                                                                     //at end of the day
}
