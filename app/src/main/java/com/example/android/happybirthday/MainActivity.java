package com.example.android.happybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView to;
    TextView from;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to = (TextView)findViewById(R.id.to_textview);
        from = (TextView)findViewById(R.id.from_textview);

        Intent i = getIntent();
        String birthdayPerson = i.getStringExtra("person");
        String wisher = i.getStringExtra("wisher");
        to.setText("To " + birthdayPerson);
        from.setText("From " + wisher);
    }
}
