package com.example.diplomado6taed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Detail_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView txtResultado1 = findViewById(R.id.txtViewNombre);
        TextView txtResultado2 = findViewById(R.id.txtViewApellidos);
        TextView txtResultado3 = findViewById(R.id.txtViewCorreo);
        TextView txtResultado4 = findViewById(R.id.txtViewGrupo);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String textoRecibido1 = extras.getString("campoTextoNombre");

            String textoRecibido2 = extras.getString("campoTextoApellidos");

            String textoRecibido3 = extras.getString("campoTextoCorreo");

            String textoRecibido4 = extras.getString("campoTextoGrupo");



            txtResultado1.setText(textoRecibido1);
            txtResultado2.setText(textoRecibido2);
            txtResultado3.setText(textoRecibido3);
            txtResultado4.setText(textoRecibido4);
        }
    }
}