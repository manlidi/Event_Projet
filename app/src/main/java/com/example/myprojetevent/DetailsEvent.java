package com.example.myprojetevent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_event);

        TextView textView = findViewById(R.id.detailtext);
        TextView t = findViewById(R.id.detailtitle);
        ImageView i = findViewById(R.id.im);

        String descriptions = "Descriptions not set";
        String titre = "Title";
        String m = "";
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            descriptions = extras.getString("descriptions");
            titre = extras.getString("titre");
            m = extras.getString("image");
        }

        textView.setText(descriptions);
        t.setText(titre);

    }
}