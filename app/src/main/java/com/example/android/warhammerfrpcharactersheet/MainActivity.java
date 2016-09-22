package com.example.android.warhammerfrpcharactersheet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton buildNewCharacter = (ImageButton) findViewById(R.id.new_character);

        buildNewCharacter.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent newCharacterIntent = new Intent(MainActivity.this, RaceChoiceActivity.class);
                if (newCharacterIntent == null){
                    System.out.println("NULL!");
                }
                startActivity(newCharacterIntent);
            }
        });





    }
}
