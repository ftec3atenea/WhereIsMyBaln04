package com.example.whatismybaln04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Aquí vamos a enlazar el mundo visual con el mundo lógico
        Button btn_login1 = findViewById(R.id.btn_login1);
        Button btn_signup1 = findViewById(R.id.btn_singup1);

        //Ponemos a escuchar al botón de login
        btn_login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irALogIn = new Intent(MainActivity.this, LogIn.class);
                startActivity(irALogIn);
                //vamos a generar un toast para notificar al usuario
                Toast.makeText(MainActivity.this, "¡Ahora si viene lo chido!", Toast.LENGTH_SHORT).show();
            }
        });

        //Ponemos a escuchar al botón de signup
        btn_signup1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irASignUp = new Intent(MainActivity.this, SignUp.class);
                startActivity(irASignUp);
                //vamos a generar un toast para notificar al usuario
                Toast.makeText(MainActivity.this, "¡A jugar!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}