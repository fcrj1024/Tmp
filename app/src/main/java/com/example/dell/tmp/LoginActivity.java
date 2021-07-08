package com.example.dell.tmp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private EditText userNameTxt,userPasswordTxt;
    private Button startBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        this.setTitle("体温监控系统");
        userNameTxt=(EditText)findViewById(R.id.zhanghao_edit);
        userPasswordTxt=(EditText)findViewById(R.id.mima_edit);
        startBtn=(Button)findViewById(R.id.start_btn);
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = userNameTxt.getText().toString();
                String userPassword = userPasswordTxt.getText().toString();

                if (!"周凯".equals(userName)) {
                    Toast.makeText(LoginActivity.this, "用户名不存在", Toast.LENGTH_LONG).show();
                    return;
                }
                if (!"1".equals(userPassword)) {
                    Toast.makeText(LoginActivity.this, "密码错误", Toast.LENGTH_LONG).show();
                    ;
                    return;
                }
                if ("周凯".equals(userName) && "1".equals(userPassword)) {
                    Toast.makeText(LoginActivity.this, "登陆成功", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}

