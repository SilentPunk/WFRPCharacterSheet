package warhammercharactercreator;

import java.util.Random;

/**
 * Created by Artur on 2016-09-10.
 */
public class Gnome extends Race {
    private static final String RACENAME = "Gnom";

    Gnome(){
        super.setRaceName(this.RACENAME);
        setStats();
    }

    @Override
    void setStats(){
        super.raceWw = 10;
        super.raceUs = 30;
        super.raceK = 10;
        super.raceOdp = 10;
        super.raceZr = 30;
        super.raceOgd = 30;
        this.setRaceSz();
        this.setRacePp();
        this.setRaceZyw();
    }

    @Override
    void setRaceSz(){
        super.raceSz = 4;
    }

    @Override
    void setRacePp(){
        super.racePp = new Random().nextInt(10) + 1;
        if(racePp <= 7){
            super.racePp = 2;
        } else {
            super.racePp = 3;
        }
    }

    @Override
    void setRaceZyw(){
        super.raceZyw = new Random().nextInt(10) + 1;
        if (super.raceZyw <= 3){
            super.raceZyw = 8;
        }
        if (super.raceZyw > 3 && super.raceZyw < 7){
            super.raceZyw = 9;
        }
        if (super.raceZyw > 6 && super.raceZyw <10){
            super.raceZyw = 10;
        }
        if (super.raceZyw == 10){
            super.raceZyw = 11;
        }

    }
}

