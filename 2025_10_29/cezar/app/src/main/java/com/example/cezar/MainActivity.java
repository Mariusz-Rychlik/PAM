package com.example.cezar;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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

    public void cezar(View view) {
        EditText plain = findViewById(R.id.editTextText);
        String plainText = plain.getText().toString();
        EditText number = findViewById(R.id.editTextNumber);
        String numberText = number.getText().toString();
        int cezarKey = Integer.parseInt(numberText);


        StringBuilder cipher = new StringBuilder();
        for (int i=0; i <plainText.length();i++){
            if (plainText.charAt(i) != ' ' & plainText.charAt(i) != ',' & plainText.charAt(i) != '.')
            {
                if (plainText.charAt(i) >= 'A' & plainText.charAt(i) <= 'Z')
                {
                    cipher.append((char) ('A' + (plainText.charAt(i) - ('A' - cezarKey)) % 26));
                }
                if (plainText.charAt(i) >= 'a' & plainText.charAt(i) <= 'z')
                {
                    cipher.append((char) ('a' + (plainText.charAt(i) - ('a' - cezarKey)) % 26));
                }
            }
            else cipher.append(plainText.charAt(i));
        }


        TextView cipherText = findViewById(R.id.textView4);
        cipherText.setText(cipher);
    }
}