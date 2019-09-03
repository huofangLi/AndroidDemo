package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication.utils.MD5Utils;

public class Register extends AppCompatActivity {
    private EditText etUsername, etPaaword, etPwdAgain;
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        //1. 获取界面上的控件
        initView();
        //2. button的点击事件的监听
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //3. 处理点击事件
                //3.1 获取控件的值
                String username = etUsername.getText().toString();
                String password = etPaaword.getText().toString();
                String passwordAgain = etPwdAgain.getText().toString();
                //3.2 检查控件的有效性
                if (TextUtils.isEmpty(username)) {
                    Toast.makeText(Register.this, "用户名不能为空", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(password) || TextUtils.isEmpty(passwordAgain)) {
                    Toast.makeText(Register.this, "密码不能为空", Toast.LENGTH_SHORT).show();
                } else if (!password.equals(passwordAgain)) {
                    Toast.makeText(Register.this, "两次密码必须一致", Toast.LENGTH_SHORT).show();
                } else {
                    //3.3 将注册信息存储
                    savePref(username, MD5Utils.md5(password));
                    //3.4 跳转登录页面
                    // 给bnt1添加点击响应事件
                    Intent intent = new Intent(Register.this, LoginActivity.class);
                    intent.putExtra("username", username);
                    //启动
                    startActivity(intent);
                }
            }
        });
    }

    private void savePref(String username, String password) {
        SharedPreferences.Editor editor = getSharedPreferences("data", MODE_PRIVATE).edit();
        editor.putString("username", username);
        editor.putString("password", password);
        editor.apply();
    }

    private void initView() {
        etUsername = findViewById(R.id.name);
        etPaaword = findViewById(R.id.password);
        etPwdAgain = findViewById(R.id.passwordAgain);
        btnRegister = findViewById(R.id.register);
    }
}
