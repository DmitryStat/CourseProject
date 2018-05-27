package com.example.notepadby.remindme.adapter;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import com.example.notepadby.remindme.fragment.CurrentFragment;
import com.example.notepadby.remindme.fragment.DoneFragment;

public class TabAdapter extends FragmentStatePagerAdapter {

    private int numberOfTabs;

    public static final int CURRENT_TASK_FRAGMENT_POSITION = 0;
    public static final int DONE_TASK_FRAGMENT_POSITION = 1;

    private CurrentFragment currentFragment;
    private DoneFragment doneFragment;

    public TabAdapter(FragmentManager fm, int numberOfTabs) {
        super(fm);
        this.numberOfTabs = numberOfTabs;
        currentFragment = new CurrentFragment();
        doneFragment = new DoneFragment();
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return currentFragment;
            case 1:
                return doneFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numberOfTabs;
    }
}
