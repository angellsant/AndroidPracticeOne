package com.example.luis.applicationone;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Activity context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        final EditText editTextName = (EditText) findViewById(R.id.editText);
        final TextView textViewTitle = (TextView) findViewById(R.id.textView);
        Button buttonMostrar =(Button) findViewById(R.id.button);


        // Listener Boton Mostrar
        buttonMostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (editTextName.getText().toString().trim().equals("ApplicationOne")) {

                    Intent intentMostrarResultado = new Intent(context, ResultActivity.class);
                    intentMostrarResultado.putExtra("Name", editTextName.getText().toString());
                    context.startActivity(intentMostrarResultado);

                }
                else
                {
                    editTextName.setText("");
                    textViewTitle.setText("Nombre erróneo. Escriba mi nombre");
                }
            }
        });

    }


}
