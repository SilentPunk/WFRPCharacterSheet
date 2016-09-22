package com.example.android.warhammerfrpcharactersheet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import warhammercharactercreator.Character;
import warhammercharactercreator.RaceFactory;


/**
 * Created by Artur on 2016-09-13.
 */
public class RaceChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.race_choice);



        ImageButton humanButton = (ImageButton) findViewById (R.id.human);
        ImageButton dwarfButton = (ImageButton) findViewById(R.id.dwarf);
        ImageButton elfButton = (ImageButton) findViewById(R.id.dwarf);
        ImageButton gnomeButton = (ImageButton) findViewById(R.id.gnome);

        humanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Character newCharacter = new Character(RaceFactory.createRace("Człowiek"));
            }
        });

        dwarfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Character newCharacter = new Character(RaceFactory.createRace("Krasnolud"));
            }
        });

        elfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Character newCharacter = new Character(RaceFactory.createRace("Elf"));
            }
        });

        gnomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Character newCharacter = new Character(RaceFactory.createRace("Gnom"));
            }
        });




    }
}


