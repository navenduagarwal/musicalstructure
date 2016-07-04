package com.example.navendu.musicalstructure;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by navendu on 7/4/2016.
 */
public class MusicLibraryAdapter extends FragmentPagerAdapter {
    private Context context;

    public MusicLibraryAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new PlaylistsFragment();
        } else if (position == 1) {
            return new AlbumsFragment();
        } else if (position == 2) {
            return new ArtistsFragment();
        } else {
            return new SongsFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString(R.string.library_playlists);
        } else if (position == 1) {
            return context.getString(R.string.library_albums);
        } else if (position == 2) {
            return context.getString(R.string.library_artists);
        } else {
            return context.getString(R.string.library_songs);
        }
    }
}
