package com.example.android.warhammerfrpcharactersheet;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import warhammercharactercreator.Elf;
import warhammercharactercreator.Race;
import warhammercharactercreator.RaceFactory;

/**
 * Created by Artur on 2016-09-13.
 * Testy powstały w celu sprawdzenia funkcjonalności fabryki
 */



public class RaceFactoryCheckerTest {



    /*
     * Pierwsze testy sprawdzają czy fabryka gdy tworzy nowy obiekt poprawnie wywołuje
     * konstruktory klas dziedziczących po klasie Race;
     */

    @Test
    public void raceFactoryCheckerForElf(){
        System.out.println("Testing factory for Elf");
        Assert.assertEquals("Elf", RaceFactory.createRace("Elf").getRaceName() );
    }

    @Test
    public void raceFactoryCheckerForHuman(){
        System.out.println("Testing factory for Human");
        Assert.assertEquals("Człowiek", RaceFactory.createRace("Człowiek").getRaceName());
    }

    @Test
    public void raceFactoryCheckerForDwarf(){
        System.out.println("Testing factory for Dwarf");
        Assert.assertEquals("Krasnolud",RaceFactory.createRace("Krasnolud").getRaceName() );
    }

    @Test
    public void raceFactoryCheckerForGnome(){
        System.out.println("Testing factory for Gnome");
        Assert.assertEquals("Gnom", RaceFactory.createRace("Gnom").getRaceName());
    }

    /*
    * Poniższy test sprawdza czy fabryka poprawnie zwraca obiekt null, gdy fabryka nie dostanie
    * odpowiedniego parametru
     */

    @Test
    public void raceFactoryCheckerForNull(){
        System.out.println("Testing factory for Null");
        Assert.assertNull(RaceFactory.createRace("null"));
    }

    /*
    * Poniższe testy sprawdzają czy fabryka nie zwraca Null gdy ma podany odpowiedni parametr
     */

    @Test
    public void raceFactoryCheckerForRaceObjectElf(){
        Assert.assertNotNull(RaceFactory.createRace("Elf"));
    }

    @Test
    public void raceFactoryCheckerForRaceObjectHuman(){
        Assert.assertNotNull(RaceFactory.createRace("Człowiek"));
    }

    @Test
    public void raceFactoryCheckerForRaceObjectDwarf(){
        Assert.assertNotNull(RaceFactory.createRace("Krasnolud"));
    }

    @Test
    public void raceFactoryCheckerForRaceObjectGnome(){
        Assert.assertNotNull(RaceFactory.createRace("Gnom"));
    }

}
