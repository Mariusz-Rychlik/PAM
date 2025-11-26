package com.example.paczka;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.lang.reflect.Array;

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

    public void checkPapaj(View view) {
        TextView cost = findViewById(R.id.textView2);
        ImageView image = findViewById(R.id.imageView);
        RadioButton radio1 = findViewById(R.id.radioButton);
        RadioButton radio2 = findViewById(R.id.radioButton2);
        RadioButton radio3 = findViewById(R.id.radioButton3);
        if (radio1.isChecked()){
            image.setBackgroundResource(R.drawable.pocztowka);
            cost.setText("Cena: 1 zl");
        }
        if (radio2.isChecked()){
            image.setBackgroundResource(R.drawable.list);
            cost.setText("Cena: 1,5 zl");
        }
        if (radio3.isChecked()){
            image.setBackgroundResource(R.drawable.paczka);
            cost.setText("Cena: 10 zl");
        }
    }

    public void CertifyPapaj(View view) {
        EditText papaj = findViewById(R.id.editTextText2);
        String papaj2137 = papaj.getText().toString();
        char[] cyfry = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int onlycyfry = 0;
        if (papaj2137.length()!=5){
            Toast.makeText(this, "Nieprawidlowa liczba cyfr w kodzie pocztowym", Toast.LENGTH_SHORT).show();
            return;
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (papaj2137.charAt(i)==cyfry[j]){
                    onlycyfry++;
                }
            }
        }
        if (onlycyfry<5){
            Toast.makeText(this, "Kod pocztwoy powinine sie skladac z samych cyfr", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            Toast.makeText(this, "Dane przesylki zostaly wprowadzone", Toast.LENGTH_SHORT).show();
        }
    }
}