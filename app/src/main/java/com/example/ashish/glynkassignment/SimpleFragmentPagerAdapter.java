package com.example.ashish.glynkassignment;


import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by ashish on 28/2/18.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public SimpleFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    // This determines the fragment for each tab
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new Movies();
        } else if (position == 1) {
            return new Design();
        } else if (position == 2) {
            return new Technologies();
        } else if (position == 3) {
            return new Politics();
        } else {
            return new Sports();
        }
    }

    // This determines the number of tabs
    @Override
    public int getCount() {
        return 5;
    }

    // This determines the title for each tab
    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        switch (position) {
            case 0:
                return mContext.getString(R.string.movies);
            case 1:
                return mContext.getString(R.string.design);
            case 2:
                return mContext.getString(R.string.technologies);
            case 3:
                return mContext.getString(R.string.politics);
            case 4:
                return mContext.getString(R.string.sports);
            default:
                return null;
        }
    }

}