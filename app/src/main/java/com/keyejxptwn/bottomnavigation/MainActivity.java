package com.keyejxptwn.bottomnavigation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.keyejxptwn.bottomnavigationlib.BottomBar;

public class MainActivity extends AppCompatActivity implements BottomBar.OnCheckedChangeListener {
    private BottomBar bottomBar;
    private int currentPos = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomBar = findViewById(R.id.bottomBar);

        initBottomNavigation();

    }

    private void initBottomNavigation() {
        bottomBar.setOnCheckedChangeListener(this);
        bottomBar.setTextColor(R.color.colorPrimaryDark, R.color.colorAccent);
        bottomBar.addItem(getString(R.string.text_label1),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.addItem(getString(R.string.text_label2),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.addItem(getString(R.string.text_label3),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.addItem(getString(R.string.text_label4),R.drawable.icon_index_normal,R.drawable.icon_index_choose,"label1");
        bottomBar.setCurrentItem(currentPos);
    }

    @Override
    public void onChange(int index, String key) {
        currentPos = index;
    }
}
