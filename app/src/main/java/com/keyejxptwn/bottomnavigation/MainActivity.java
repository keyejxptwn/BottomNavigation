package com.keyejxptwn.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.keyejxptwn.bottomnavigationlib.BottomBar;

public class MainActivity extends AppCompatActivity implements BottomBar.OnCheckedChangeListener {
    private BottomBar bottomBar;
    private ViewPager viewPager;
    private int currentPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomBar = findViewById(R.id.bottomBar);
        viewPager = findViewById(R.id.viewPage);

        initBottomNavigation();
        bottomBar.setOnCheckedChangeListener(this);
    }

    private void initBottomNavigation() {
        bottomBar.setTextColor(R.color.colorPrimaryDark, R.color.colorPrimary);
      /*  bottomBar.addItem();
        bottomBar.addItem();
        bottomBar.addItem();
        bottomBar.addItem();*/
        bottomBar.setCurrentItem(currentPos);
    }

    @Override
    public void onChange(int index, String key) {
        currentPos = index;
    }
}
