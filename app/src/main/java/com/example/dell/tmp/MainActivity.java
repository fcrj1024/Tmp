package com.example.dell.tmp;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button patient1Btn;
    private Button patient2Btn;
    private Button patient3Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("体温监控系统");
        patient1Btn=(Button)findViewById(R.id.patient1_btn);
        patient2Btn=(Button)findViewById(R.id.patient2_btn);
        patient3Btn=(Button)findViewById(R.id.patient3_btn);

        patient1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PatientActivity.class);
                startActivity(intent);
            }
        });
        patient2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=37;
                Button button =(Button) v;
                button.setText("患者2:   "+num);
                if (num>37 || num<36)
                     button.setTextColor(0xFFFF0000);
            }
        });
        patient3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num=38;
                Button button =(Button) v;
                button.setText("患者3:   "+num);
                if (num>37 || num<36)
                    button.setTextColor(0xFFFF0000);
            }
        });
    }
}
