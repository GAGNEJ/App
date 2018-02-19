package com.example.gagne.app_workshop_b3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ecran3 extends AppCompatActivity implements View.OnClickListener {

    Button Button_Valider ;
    EditText EditText_AdresseEmail;
    TextView TextView_gfi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecran3);

        Button_Valider = (Button)findViewById(R.id.button_Valider);
        EditText_AdresseEmail = (EditText)findViewById(R.id.editText_AdresseEmail);
        TextView_gfi = (TextView)findViewById(R.id.textView_gfi);
        TextView_gfi.setText("@gfi.fr");

        Button_Valider.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

    }
}
