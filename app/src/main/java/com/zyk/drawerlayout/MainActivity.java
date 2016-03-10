package com.zyk.drawerlayout;

import android.os.Bundle;
//import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.zyk.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){

        mDrawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawerlayout);
        mDrawerLayout.setHeader(100, Gravity.LEFT);
        mDrawerLayout.setHeader(20, Gravity.RIGHT);
        mDrawerLayout.setHeader(20, Gravity.TOP);
        mDrawerLayout.setHeader(20, Gravity.BOTTOM);
        View body = findViewById(R.id.activity_main_body);
        Button left = (Button) body.findViewById(R.id.acitivyt_main_body_left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.setDrawerTitle(Gravity.LEFT,"左边菜单的 Title");
                mDrawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        Button top = (Button) body.findViewById(R.id.acitivyt_main_body_top);
        top.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.setDrawerTitle(Gravity.TOP,"上边菜单的 Title");
                mDrawerLayout.openDrawer(Gravity.TOP);
            }
        });

        Button right = (Button) body.findViewById(R.id.acitivyt_main_body_right);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.setDrawerTitle(Gravity.RIGHT,"右边菜单的 Title");
                mDrawerLayout.openDrawer(Gravity.RIGHT);
            }
        });

        Button bottom = (Button) body.findViewById(R.id.acitivyt_main_body_bottom);
        bottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawerLayout.setDrawerTitle(Gravity.BOTTOM,"下边菜单的 Title");
                mDrawerLayout.openDrawer(Gravity.BOTTOM);
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        return super.onKeyDown(keyCode, event);
    }
}
