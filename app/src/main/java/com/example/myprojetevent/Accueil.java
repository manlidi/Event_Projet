package com.example.myprojetevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Accueil extends AppCompatActivity {
    private Button button;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);

        btn = (Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenAjout();
            }
        });

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OpenListe();
            }
        });

    }
    public  void OpenListe()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public  void OpenAjout()
    {
        Intent i = new Intent(this, Ajout.class);
        startActivity(i);
    }
}