package warhammercharactercreator;

import java.util.Random;

/**
 * Created by Artur on 2016-09-13.
 */
public final class Dice {

    private Dice() {

    }

    static int diceTenRoll(){
        return ((new Random().nextInt(10) + 1));
    }

    static int diceTwentyRoll() {
        return (2 * Dice.diceTenRoll());
        }

    static int diceHundredRoll(){
        return ((new Random().nextInt(100)) + 1);
    }

    static boolean diceHundredRollChecker (int currentStatisticValue){
        if (Dice.diceHundredRoll() <= currentStatisticValue){
            return true;
        } else {
            return false;
        }
    }


}
