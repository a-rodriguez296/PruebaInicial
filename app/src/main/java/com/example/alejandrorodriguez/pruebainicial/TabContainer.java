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


        TabHost tabHost = getTabHost();

        Intent intent = new Intent(this, MainActivity.class);
        TabHost.TabSpec spec = tabHost.newTabSpec("Tab 1");
        spec.setIndicator("Tab 11");
        spec.setContent(intent);
        tabHost.addTab(spec);


        intent = new Intent(this, MainActivity2.class);
        spec = tabHost.newTabSpec("Tab 2");
        spec.setIndicator("Tab 22");
        spec.setContent(intent);
        tabHost.addTab(spec);


    }
}
