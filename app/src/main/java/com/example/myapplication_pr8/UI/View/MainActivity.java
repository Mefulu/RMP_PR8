package com.example.myapplication_pr8.UI.View;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication_pr8.R;

public class MainActivity extends AppCompatActivity {

    public MainActivity() {
        super (R.layout.activity_main);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .add(R.id.fragment_container_view,
                            F_Screen.class, null)
                    .commit();
        }
    }
}