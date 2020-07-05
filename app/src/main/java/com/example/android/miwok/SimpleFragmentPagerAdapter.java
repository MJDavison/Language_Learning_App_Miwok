package com.example.android.miwok;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {
    final int PAGE_COUNT = 4;


    private Context mContext;
    private String[] tabTitles = new String[4];

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, Context context) {
        super(fm);
        this.mContext = context;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return new BrokenFragment();
        }
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        tabTitles[0] = mContext.getString(R.string.category_numbers);
        tabTitles[1] = mContext.getString(R.string.category_family);
        tabTitles[2] = mContext.getString(R.string.category_colors);
        tabTitles[3] = mContext.getString(R.string.category_phrases);
        return tabTitles[position].toUpperCase();
    }
}
