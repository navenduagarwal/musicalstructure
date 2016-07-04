package com.example.navendu.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by navendu on 7/4/2016.
 */
public class MusicPlayerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.music_list);

        //Update Text Description
        TextView desc = (TextView) findViewById(R.id.text_description);
        desc.setText(getResources().getString(R.string.description_player));

        //Update Text hurdles
        TextView hurdle = (TextView) findViewById(R.id.text_hurdles);
        hurdle.setText(getResources().getString(R.string.hurdles_player));

        //Update Text Description
        TextView solutions = (TextView) findViewById(R.id.text_solution);
        solutions.setText(getResources().getString(R.string.solution_player));

        //Update text Button One
        Button buttonOne = (Button) findViewById(R.id.button_one);
        buttonOne.setText(getResources().getString(R.string.button_one_player));

        //Add button Click Listener
        buttonOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(MusicPlayerActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        TextView musicplayer = (TextView) findViewById(R.id.textview_musicplayer);
        musicplayer.setVisibility(View.GONE);

        ImageView imagePlayer = (ImageView) findViewById(R.id.player_image);
        imagePlayer.setVisibility(View.GONE);

    }

}
