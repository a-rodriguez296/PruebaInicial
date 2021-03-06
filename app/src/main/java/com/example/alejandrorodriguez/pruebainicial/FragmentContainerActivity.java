package com.example.alejandrorodriguez.pruebainicial;



import android.os.Bundle;
import android.support.v4.app.*;

import com.example.alejandrorodriguez.pruebainicial.R;

/**
 * Created by alejandrorodriguez on 3/4/15.
 */
public abstract class FragmentContainerActivity extends FragmentActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_container);

        FragmentManager fm = getSupportFragmentManager();

        Fragment fragment = fm.findFragmentById(R.id.fragment_container);
        if (fragment == null){
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragment_container,fragment).commit();
        }
    }


    public abstract Fragment createFragment();
}
