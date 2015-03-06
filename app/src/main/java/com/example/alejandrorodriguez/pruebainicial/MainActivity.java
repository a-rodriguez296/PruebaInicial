package com.example.alejandrorodriguez.pruebainicial;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class MainActivity extends FragmentContainerActivity {

    public static final String MODEL = "activity.model";


    @Override
    public Fragment createFragment() {
        Bundle arguments =  new Bundle();
        arguments.putSerializable(MainActivityFragment.ARG_MODEL,getIntent().getSerializableExtra(MODEL));
        MainActivityFragment fragment = new MainActivityFragment();
        fragment.setArguments(arguments);
       return fragment;
    }
}
