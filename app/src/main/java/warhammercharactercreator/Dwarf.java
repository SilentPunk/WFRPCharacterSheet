package warhammercharactercreator;

import java.util.Random;

/**
 * Created by Artur on 2016-09-10.
 */
public class Dwarf extends Race {
    private static final String RACENAME = "Krasnolud";

    Dwarf(){
        super.setRaceName(this.RACENAME);
        setStats();
    }

    @Override
    void setStats(){
        super.raceWw = 30;
        super.raceOdp = 30;
        super.raceZr = 10;
        super.raceOgd = 10;
        this.setRaceSz();
        this.setRacePp();
        this.setRaceZyw();
    }

    @Override
    void setRaceSz(){
        super.raceSz = 3;
    }

    @Override
    void setRacePp() {
        super.racePp = new Random().nextInt(10) + 1;
        if (super.racePp <= 4) {
            super.racePp = 1;
            if (super.racePp >= 5 && super.racePp < 8)
                super.racePp = 2;
        }
        if (super.racePp > 8) {
            super.racePp = 3;
        }
    }

    @Override
    void setRaceZyw(){
        super.raceZyw = new Random().nextInt(10) + 1;
        if (super.raceZyw <= 3){
            super.raceZyw = 11;
        }
        if (super.raceZyw > 3 && super.raceZyw < 7){
            super.raceZyw = 12;
        }
        if (super.raceZyw > 6 && super.raceZyw <10){
            super.raceZyw = 13;
        }
        if (super.raceZyw == 10){
            super.raceZyw = 14;
        }

    }
}


