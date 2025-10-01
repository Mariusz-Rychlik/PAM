package com.example.urzadzenia_domowe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    boolean IsOn=false;
    TextView TextView6 = findViewById(R.id.textView6);
    EditText washesEdit = findViewById(R.id.editTextNumber);
    TextView TextView4 = findViewById(R.id.textView4);
    Button Button2 = findViewById(R.id.button2);
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

    @SuppressLint("SetTextI18n")
    public void Confirm(View view) {
        int washes = Integer.parseInt(washesEdit.getText().toString());
        if(washes>=1 && washes<=12){
            TextView4.setText("Numer prania:"+washes);
        }
    }

    @SuppressLint("SetTextI18n")
    public void OnAndOff(View view) {
        if (!IsOn){
            Button2.setText("Wylacz");
            TextView6.setText("Odkurzacz wlaczony");
        }
        else{
            Button2.setText("Wlacz");
            TextView6.setText("Odkurzacz wlaczony");
        }
    }
}