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


public class MainActivityFragment extends Fragment {


    public static final String ARG_MODEL = "fragment.model";

    @InjectView(R.id.textHola) TextView hola;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_main,container,false);

        ButterKnife.inject(this,root);


        Model model = (Model) getArguments().getSerializable(ARG_MODEL);
        hola.setText(model.getName());


        return root;
    }



}
