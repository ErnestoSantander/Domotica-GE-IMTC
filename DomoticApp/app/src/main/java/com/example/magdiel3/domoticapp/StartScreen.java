package com.example.magdiel3.domoticapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StartScreen extends AppCompatActivity {

    private Button loginButton;
    private EditText usernameTextEdit;
    private EditText passwordTextEdit;

    private  User[] users;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        loginButton = (Button) findViewById(R.id.LoginButton);
        usernameTextEdit = (EditText) findViewById(R.id.UsuarioTextEdit);
        passwordTextEdit = (EditText) findViewById(R.id.ContrasenaEditText);

        users = new User[] {new User("Ernesto", "Santander"),
                new User("Cesar", "Nieto"), new User("Ricardo", "Plata"),
                new User("Magdiel", "Martinez")};

    }

    public void Login(View v) {
        Intent intent;
        intent = new Intent(this,MainActivity.class);
        String username = usernameTextEdit.getText().toString();
        String password = passwordTextEdit.getText().toString();
        for(int i = 0;i < users.length;i++) {
            if(username.equalsIgnoreCase(users[i].getUsername()) &&
                    password.equalsIgnoreCase(users[i].getPassword())) {
                intent.putExtra("NAME", users[i].getUsername());
                intent.putExtra("PASSWORD", users[i].getPassword());
                startActivity(intent);
            }
        }
    }
}
