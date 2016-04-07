package com.example.magdiel3.domoticapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nombreDeUsuario;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle extras = getIntent().getExtras();

        nombreDeUsuario = (TextView) findViewById(R.id.nombreDeUsuario);

        if(extras != null){
            user = new User(extras.getString("NAME"),extras.getString("PASSWORD"));
            nombreDeUsuario.setText(user.getUsername());
        }
    }
}
