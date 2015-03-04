package com.example.alejandrorodriguez.pruebainicial;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;


public class TabContainer extends TabActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_container);


        Model model1 = new Model("tab 1 alejandro");
        Model model2 = new Model("tab 2 pedro");


        TabHost tabHost = getTabHost();

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(MainActivity.MODEL, model1);
        TabHost.TabSpec spec = tabHost.newTabSpec("Tab 1");
        spec.setIndicator("Tab 11");
        spec.setContent(intent);
        tabHost.addTab(spec);


        intent = new Intent(this, MainActivity2.class);
        intent.putExtra(MainActivity2.MODEL, model2);
        spec = tabHost.newTabSpec("Tab 2");
        spec.setIndicator("Tab 22");
        spec.setContent(intent);
        tabHost.addTab(spec);


    }
}
