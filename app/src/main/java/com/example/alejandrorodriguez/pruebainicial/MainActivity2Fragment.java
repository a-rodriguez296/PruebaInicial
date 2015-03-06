package com.example.alejandrorodriguez.pruebainicial;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alejandrorodriguez.pruebainicial.Model;
import com.example.alejandrorodriguez.pruebainicial.R;


import butterknife.ButterKnife;
import butterknife.InjectView;

/**
 * Created by alejandrorodriguez on 3/4/15.
 */
public class MainActivity2Fragment  extends Fragment{


    public static final String ARG_MODEL = "fragment.model";

    @InjectView(R.id.LargeText) TextView text;



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root =  inflater.inflate(R.layout.fragment_main_activity2,container,false);

        ButterKnife.inject(this,root);

        Model model = (Model) getArguments().getSerializable(ARG_MODEL);
        text.setText(model.getName());

        return root;
    }
}
