package com.example.a18055121_phamngocnhuy_nhom1_facebookmusic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity {
    private LoginButton btnLogin;
    private EditText txtName,txtPass;
    private Button btnLoginScreen2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin=findViewById(R.id.login_button);
        txtName=findViewById(R.id.txtUserName);
        txtPass=findViewById(R.id.txtPassword);
        btnLoginScreen2=findViewById(R.id.btnLogin);

        txtName.setText("PhamNgocNhuY");
        txtPass.setText("123456");

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Demo","Login Successful");
                Intent intent= new Intent(MainActivity.this,MusicScreen.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Login Successful",Toast.LENGTH_LONG).show();
            }
        });



        btnLoginScreen2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Screen2.class);
                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation(
                        MainActivity.this,btnLoginScreen2,
                        ViewCompat.getTransitionName(btnLoginScreen2)
                );
                startActivity(intent, optionsCompat.toBundle());
            }
        });


    }
}