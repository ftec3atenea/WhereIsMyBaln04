package com.example.whatismybaln04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Recovery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recovery);

        // Aquí vamos a enlazar el mundo visual con el mundo lógico
        Button btn_login1 = findViewById(R.id.btn_recovery4);
        TextView ytc4 = findViewById(R.id.ytc4);
        TextView ntc4 = findViewById(R.id.ntc4);

        // Ponemos a escuchar al botón de login
        btn_login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // vamos a generar un intent para ir a la pantalla de Home
                Intent irALogIn = new Intent(Recovery.this, LogIn.class);
                // activamos el intent
                startActivity(irALogIn);

                // vamos a generar un toast para notificar al usuario
                Toast.makeText(Recovery.this, "¡Revisa tu correo!", Toast.LENGTH_SHORT).show();
            }
        });

        // Ponemos a escuchar al TextView de ya tienes cuenta
        ytc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // vamos a generar un intent para ir a la pantalla de Home
                Intent irALogIn = new Intent(Recovery.this, LogIn.class);
                // activamos el intent
                startActivity(irALogIn);

                // vamos a generar un toast para notificar al usuario
                Toast.makeText(Recovery.this, "Es por aquí", Toast.LENGTH_SHORT).show();
            }
        });

        // Ponemos a escuchar al TextView de no tienes cuenta
        ntc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // vamos a generar un intent para ir a la pantalla de Home
                Intent irASignUp = new Intent(Recovery.this, SignUp.class);
                // activamos el intent
                startActivity(irASignUp);

                // vamos a generar un toast para notificar al usuario
                Toast.makeText(Recovery.this, "¡Registrate!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}