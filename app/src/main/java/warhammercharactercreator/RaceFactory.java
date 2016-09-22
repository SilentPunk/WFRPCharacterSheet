package warhammercharactercreator;

/**
 * Created by Artur on 2016-09-10.
 */
public final class RaceFactory {

    private RaceFactory(){

    }

    public static Race createRace(String raceName){
        Race newRace = null;


        if (raceName.equalsIgnoreCase("Człowiek")){
            newRace = new Human();
        }

        if(raceName.equalsIgnoreCase("Elf")){
            newRace =  new Elf();
        }

        if(raceName.equalsIgnoreCase("Krasnolud")){
            newRace = new Dwarf();
        }

        if(raceName.equalsIgnoreCase("Gnom")){
            newRace = new Gnome();
        }


        return newRace;
    }




}
