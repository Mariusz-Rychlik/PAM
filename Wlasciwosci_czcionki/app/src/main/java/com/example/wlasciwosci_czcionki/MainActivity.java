package com.example.wlasciwosci_czcionki;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String[] T = {"Dzień dobry","Good morning","Buenos dias"};
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

        TextView Textview2 = findViewById(R.id.textView2);
        TextView Textview3 = findViewById(R.id.textView3);
        SeekBar seekBar = findViewById(R.id.seekBar);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Textview2.setText("Rozmiar: "+ i);
                Textview3.setTextSize(i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }


    public void change_text(View view) {
        TextView Textview3 = findViewById(R.id.textView3);
        String Textview3Text = Textview3.getText().toString();
        if (Textview3Text.equals(T[0])){
            Textview3.setText(T[1]);
        }
        if (Textview3Text.equals(T[1])){
            Textview3.setText(T[2]);
        }
        if (Textview3Text.equals(T[2])){
            Textview3.setText(T[0]);
        }


    }
}