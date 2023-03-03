package ru.synergy.timepickerdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       }
       public void onClick(View v) {
           TimePickFragment newFragment = new TimePickFragment();
           newFragment.show(getSupportFragmentManager(),"timePicker");

       }
    }