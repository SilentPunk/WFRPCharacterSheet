package warhammercharactercreator;

import java.util.Random;

/**
 * Created by Artur on 2016-09-09.
 */
public class Elf extends Race {

    private static final String RACENAME = "Elf";

    public Elf(){
        super.setRaceName(this.RACENAME);
        setStats();
    }

    @Override
    void setStats(){
        super.raceUs = 30;
        super.raceZr = 30;
        this.setRaceSz();
        this.setRacePp();
        this.setRaceZyw();
    }

    @Override
    void setRaceSz(){
        super.raceSz = 5;
    }

    @Override
    void setRacePp(){
        super.racePp = new Random().nextInt(10) + 1;
        if(super.racePp <= 4){
            super.racePp = 1;
        } else {
            super.racePp = 2;
        }
    }

    @Override
    void setRaceZyw(){
        super.raceZyw = new Random().nextInt(10) + 1;
        if (super.raceZyw <= 3){
            super.raceZyw = 9;
        }
        if (super.raceZyw > 3 && super.raceZyw < 7){
            super.raceZyw = 10;
        }
        if (super.raceZyw > 6 && super.raceZyw <10){
            super.raceZyw = 11;
        }
        if (super.raceZyw == 10){
            super.raceZyw = 12;
        }

    }
}
