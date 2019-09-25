package com.example.recyclerviewexample1;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        tabLayout = findViewById( R.id.tablayout );
        viewPager = findViewById( R.id.viewpager );
        tabLayout.setupWithViewPager( viewPager );

        List<String> list=new ArrayList<>(  );
        list.add( "Charts" );
        list.add("content");

        MyTabLayoutAdapter myTabLayoutAdapter=new MyTabLayoutAdapter( getSupportFragmentManager(),list );
viewPager.setAdapter( myTabLayoutAdapter );

    }
}
