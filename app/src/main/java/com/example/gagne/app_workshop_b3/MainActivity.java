package com.example.gagne.app_workshop_b3;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTextMessage;

    EditText Date, Title;
    Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Save = (Button)findViewById(R.id.save);
        Date = (EditText)findViewById(R.id.date);
        Title = (EditText)findViewById(R.id.title);

        Save.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(MainActivity.this,Ecran3.class);
        startActivity(i);
    }


}
