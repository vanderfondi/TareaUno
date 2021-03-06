package com.example.gerard.tareauno;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTres extends AppCompatActivity implements FragUno.OnFragmentInteractionListener, FragDos.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres);

        final EditText text3 = findViewById(R.id.enviar_act_tres);
        Button send_tres = findViewById(R.id.enviar3);
        final TextView salida = findViewById(R.id.pantalla);

        send_tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String textToSend = text3.getText().toString();
                salida.setText("Activity 3: "+textToSend);
                Intent intent = new Intent(ActivityTres.this, MainActivity.class);
                Toast.makeText(ActivityTres.this, "Activity Tres", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
