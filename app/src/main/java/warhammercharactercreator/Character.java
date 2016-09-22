package warhammercharactercreator;

import java.util.Random;

/**
 * Created by Artur on 2016-09-09.
 */
public class Character {

    /*
    * zmienna Race przechowuje konkretną rase postaci
    * zmienna characterName przechowuje imię postaci
     */

    private Race characterRace;
    private String characterName;

    /*
    * Zmienne przechowują cechy pierwszorzędowe postaci. Poszczególne skróty odpowiadają:
    * Ww - walka wręcz,
    * Us - umiejętności strzeleckie,
    * K - krzepa
    * Odp - odporność
    * Zr - zręczność
    * Int - inteligencja
    * Sw - siła woli
    * Ogd - ogłada
     */
    private int characterWw;
    private int characterUs;
    private int characterK;
    private int characterOdp;
    private int characterZr;
    private int characterSw;
    private int characterOgd;

    /*
    * Poniższe zmienne przechowują cechy drugorzędowe postaci. Są to:
    * A - atak
    * Żyw - żywtoność
    * S - siła
    * Wt - witalność
    * Sz - szybkość
    * Mag - magia
    * PO - punkty obłędu
    * PP - punkty przeznaczenia
     */

    private int characterA;
    private int characterZyw;
    private int characterS;
    private int characterWt;
    private int characterSz;
    private int characterMag;
    private int characterPo;
    private int characterPp;

    public Character(Race characterRacerace){
        this.characterRace = characterRacerace;
    }

    void setCharacterName(String characterName){
        this.characterName = characterName;
    }



}
