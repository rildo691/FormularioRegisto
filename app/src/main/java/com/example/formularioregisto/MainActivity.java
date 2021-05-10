package com.example.formularioregisto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_username, et_pwd;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_username = (EditText) findViewById(R.id.et_username);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        btn_login = (Button) findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_pwd.getText().toString();

                if (username.toUpperCase().equals("USER") && password.equals("pass")){
                    Toast.makeText(MainActivity.this, "Login válido!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login inválido", Toast.LENGTH_SHORT).show();
                }

                et_username.setText("");
                et_pwd.setText("");
            }
        });
    }
}