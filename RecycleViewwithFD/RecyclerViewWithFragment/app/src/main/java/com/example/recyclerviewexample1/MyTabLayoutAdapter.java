package com.example.recyclerviewexample1;

import android.widget.Switch;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class MyTabLayoutAdapter extends FragmentStatePagerAdapter {
    private List<String> List1;

    public MyTabLayoutAdapter(FragmentManager fm, List<String> list) {
        super(fm);
        List1=list;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                Chart chatsFragment=new Chart();
                return chatsFragment;
            case 1:
                Contact contactsFragment=new Contact();
                return contactsFragment;
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return List1.get( position );
    }

    @Override
    public int getCount() {
        return List1.size();
    }
}
