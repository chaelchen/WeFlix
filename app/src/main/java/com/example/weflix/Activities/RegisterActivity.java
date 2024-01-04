package com.example.weflix.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.weflix.R;

public class RegisterActivity extends AppCompatActivity {
    private Button loginBtn1, registerBtn1;
    private EditText userRegis1,passRegis1,passRegis2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initView1();
    }

    private void initView1() {
//        userRegis1=findViewById(R.id.editTextUsername1);
//        passRegis1=findViewById(R.id.editTextPassword1);
//        passRegis2=findViewById(R.id.editTextPassword2);
//
//        registerBtn1.setOnClickListener(v -> {
//            if(userRegis1.getText().toString().isEmpty() || passRegis1.getText().toString().isEmpty() || passRegis2.getText().toString().isEmpty()){
//                Toast.makeText(RegisterActivity.this, "Please fill in your account information", Toast.LENGTH_SHORT).show();
//            }
//            else{
//                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
//            }
//        });
//
//        loginBtn1.setOnClickListener(v -> startActivity(new Intent(RegisterActivity.this,LoginActivity.class)));
    }
}
