package com.example.alejandrorodriguez.pruebainicial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.ButterKnife;
import butterknife.InjectView;


public class MainActivity2 extends Activity {

    public static final String EXTRA_ARGUMENT = "extra";
    public static final String MODEL = "model";

    @InjectView(R.id.LargeText) TextView text;

    private int a = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);
        ButterKnife.inject(this);

        Model model = (Model) getIntent().getSerializableExtra(MODEL);
        text.setText(model.getName());






    }
}
