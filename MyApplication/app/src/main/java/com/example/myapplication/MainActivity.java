package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.utils.MD5Utils;

public class MainActivity extends AppCompatActivity {
//    private EditText etUsername, etPassword;
//    private Button buttonRegister, buttonLogin, buttonForget;
//    private TextView tUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getUserName();
//        initView();
//
//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String username = etUsername.getText().toString();
//                String password = etPassword.getText().toString();
//                //3.2 检查控件的有效性
//                SharedPreferences pref = getSharedPreferences("data", MODE_PRIVATE);
//                String name = pref.getString("username", "");
//                String pwd = pref.getString("password", "");
//                if (TextUtils.isEmpty(username)) {
//                    Toast.makeText(MainActivity.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
//                } else if (TextUtils.isEmpty(password)) {
//                    Toast.makeText(MainActivity.this, "密码不能为空", Toast.LENGTH_SHORT).show();
//                } else if (!username.equals(name)) {
//                    Toast.makeText(MainActivity.this, "用户名错误", Toast.LENGTH_SHORT).show();
//                } else if (!MD5Utils.md5(password).equals(pwd)) {
//                    Toast.makeText(MainActivity.this, "密码错误", Toast.LENGTH_SHORT).show();
//                } else {
////                    Intent intent = new Intent(MainActivity.this,SplashActivity.class);
//                    Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
//
//        buttonRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // 给bnt1添加点击响应事件
//                Intent intent = new Intent(MainActivity.this, Register.class);
//                //启动
//                startActivity(intent);
//            }
//        });
    }

//    private void getUserName() {
//        Intent intent = getIntent();
//        String username_register = intent.getStringExtra("username");
//        tUsername = findViewById(R.id.username);
//        tUsername.setText(username_register);
//    }
//
//    private void initView() {
//        etUsername = findViewById(R.id.username);
//        etPassword = findViewById(R.id.password);
//        buttonRegister = findViewById(R.id.button_register);
//        buttonLogin = findViewById(R.id.button_login);
//        buttonForget = findViewById(R.id.button_forget_password);
//    }
}
