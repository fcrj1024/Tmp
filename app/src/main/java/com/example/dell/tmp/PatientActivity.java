package com.example.dell.tmp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class PatientActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient);
        this.setTitle("体温监控系统");
    }
}