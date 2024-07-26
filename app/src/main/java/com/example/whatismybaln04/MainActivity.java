package com.example.whatismybaln04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Aquí vamos a enlazar el mundo visual con el mundo lógico
        TextView tituloL = findViewById(R.id.titulo1);
        Button btn_login = findViewById(R.id.btn_login);

        //Vamos a crear la animación
        Animation anim_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);

        //Vamos a ejecutar la animación
        tituloL.startAnimation(anim_out);

        //Ponemos a escuchar al boyón
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irASignUp = new Intent(MainActivity.this, SignUp.class);
                startActivity(irASignUp);
            }
        });

    }
}