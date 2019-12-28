package com.example.tourlagos;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class AttractionsPagerAdapter extends FragmentPagerAdapter {
    private final Context mContext;

    public AttractionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:return new LandmarksFragment();
            case 1:return new ParksFragment();
            case 2:return new RestaurantsFragment();
            case 3:return new EventsFragment();
            default:return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return mContext.getString(R.string.landmarks_page_title);
            case 1: return mContext.getString(R.string.parks_page_title);
            case 2: return mContext.getString(R.string.restaurant_page_title);
            case 3: return mContext.getString(R.string.event_page_title);
            default: return null;
        }
    }
}
