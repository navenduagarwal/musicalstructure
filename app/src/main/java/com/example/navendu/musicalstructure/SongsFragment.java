package com.example.navendu.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by navendu on 7/4/2016.
 */
public class SongsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.music_list, container, false);

        //Update Text Description
        TextView desc = (TextView) rootView.findViewById(R.id.text_description);
        desc.setText(getResources().getString(R.string.description_song));

        //Update Text hurdles
        TextView hurdle = (TextView) rootView.findViewById(R.id.text_hurdles);
        hurdle.setText(getResources().getString(R.string.hurdles_song));

        //Update Text Description
        TextView solutions = (TextView) rootView.findViewById(R.id.text_solution);
        solutions.setText(getResources().getString(R.string.solution_song));

        //Update text Button One
        Button buttonOne = (Button) rootView.findViewById(R.id.button_one);
        buttonOne.setText(getResources().getString(R.string.button_one_song));

        //Add On Click Listener
        buttonOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getActivity(), MusicPlayerActivity.class);
                startActivity(intent);
            }
        });

        TextView musicplayer = (TextView) rootView.findViewById(R.id.textview_musicplayer);

        //Add music player Click Listener
        musicplayer.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent;
                intent = new Intent(getActivity(), MusicPlayerActivity.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}