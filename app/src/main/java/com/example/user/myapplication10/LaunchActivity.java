package com.example.user.myapplication10;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.zip.CheckedOutputStream;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        CheckBox checkBox = findViewById(R.id.checkBox);
        final Button button = findViewById(R.id.button2);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                button.setEnabled(isChecked);
            }
        });
    }
    public void onButtonClick (View view) {
    Intent intent = new Intent (this, MainActivity.class);
    startActivity(intent);
    }
}
