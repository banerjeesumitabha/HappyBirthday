package com.example.android.happybirthday;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * Created by SUMITABHA on 28-09-2017.
 */

public class LaunchActivity extends AppCompatActivity {

    EditText birthdayPerson;
    EditText wisher;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        birthdayPerson = (EditText)findViewById(R.id.birthday_person);
        wisher = (EditText)findViewById(R.id.wisher);
    }

    public void wish(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        i.putExtra("person",birthdayPerson.getText().toString());
        i.putExtra("wisher",wisher.getText().toString());
        startActivity(i);
    }
}
