import java.util.Random;

public class Gambling_Simulator {
    public static void main (String[] args) {
        int stake_of_Gambler = 100;                 //Intialising amount present with Gambler before starting Game in stake_of_Gambler
        int bet_for_Game = 1;               //Intialising how much amount gamer bet in bet_for_Game
        int win =0;
        int loss =0;
        int net_Stake_after_20_Days=0;

        /*
         * Caluculating how much amount present with Gambler after 20 Days of play
         * */
        for (int k = 1; k <= 20; k++)
        {
            stake_of_Gambler=100;

            /*
             * Implementing condition given in UC3 i.e winning of Half of his stake using while loop
             * */
            while (stake_of_Gambler <= 149 && stake_of_Gambler >= 51) {
                Random ran = new Random();
                int i = ran.nextInt(2);         //generating random number to check Gamer win loose the Game
                if (i == 0) {
                    stake_of_Gambler = stake_of_Gambler + bet_for_Game; //Adding amount to Gamer stake after hi wins
                } else {
                    stake_of_Gambler = stake_of_Gambler - bet_for_Game;     //Removing amount loosen by Gamer when he loose the Game
                }
                if (stake_of_Gambler== 50)                  //Condition for checking Gambler loss most games in a day
                {
                    loss++;

                }
                else if (stake_of_Gambler==150)              //Condition for checking Gambler win most games in a day
                {
                    win++;
                }
            }
            net_Stake_after_20_Days=(win*50)-(loss*50);     //Caluculation for finding amount loss by Gambler after 20 days
        }
        /*
         *   Printing all the output values like final stake present with  , no of days won,loss and
         *   totalamount loss or gain by gambler after 20 Days
         * */
        System.out.println("The no of days Gambler win : "+win);
        System.out.println("The no of days Gambler loss : "+loss);
        System.out.println("The amount gain(+) or loss(-) after 20 days : "+net_Stake_after_20_Days);
    }
}