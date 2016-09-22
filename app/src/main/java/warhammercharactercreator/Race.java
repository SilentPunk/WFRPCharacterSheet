package warhammercharactercreator;

/**
 * Created by Artur on 2016-09-09.
 */
public abstract class Race {
    /*
    Zmienna raceName przechowuje konkretną nazwę rasy;
     */

    private String raceName;

    protected int commonStatValue = 20;





    /*

         */
    protected int raceWw = commonStatValue;
    protected int raceUs = commonStatValue;
    protected int raceK = commonStatValue;
    protected int raceOdp = commonStatValue;
    protected int raceZr = commonStatValue;
    protected int raceInt = commonStatValue;
    protected int raceSw = commonStatValue;
    protected int raceOgd = commonStatValue;

    private int raceA = 1;
    protected int raceZyw;
    private int raceS;
    private int raceWt;
    protected int raceSz;
    private int raceMag = 0;
    private int racePo = 0;
    protected int racePp;



    protected void setRaceName(String raceName){
        this.raceName = raceName;
    }

    public int getRaceWw(){
        return this.raceWw;
    }

    public int getRaceUs(){
        return this.raceUs;
    }

    public int getRaceK(){
        return this.raceK;
    }

    public int getRaceOdp(){
        return this.raceOdp;
    }

    public int getRaceZr(){
        return this.raceZr;
    }

    public int getRaceInt(){
        return this.raceInt;
    }

    public int getRaceSw(){
        return this.raceSw;
    }

    public int getRaceOgd(){
        return this.raceOgd;
    }

    public String getRaceName(){
        return this.raceName;
    }






    abstract void setStats();

    abstract void setRaceSz();

    abstract void setRacePp();

    abstract void setRaceZyw();





}
