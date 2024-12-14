package com.example.diplomado6taed;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    // Enviar los datos a la siguiente actividad
    public void enviar(View view){
        EditText editTextNombre = findViewById(R.id.editTextNombre);
        EditText editTextApellidos = findViewById(R.id.editTextApellidos);
        EditText editTextCorreo = findViewById(R.id.editTextCorreo);
        EditText editTextGrupo = findViewById(R.id.editTextGrupo);

        String campoTextoNombre = editTextNombre.getText().toString();
        String campoTextoApellidos = editTextApellidos.getText().toString();
        String campoTextoCorreo = editTextCorreo.getText().toString();
        String campoTextoGrupo = editTextGrupo.getText().toString();

        Intent intent = new Intent(this, Detail_activity.class);

        intent.putExtra("campoTextoNombre", campoTextoNombre);
        intent.putExtra("campoTextoApellidos", campoTextoApellidos);
        intent.putExtra("campoTextoCorreo", campoTextoCorreo);
        intent.putExtra("campoTextoGrupo", campoTextoGrupo);

        startActivity(intent);
    }
}