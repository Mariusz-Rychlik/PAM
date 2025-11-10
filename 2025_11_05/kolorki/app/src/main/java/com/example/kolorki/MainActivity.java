package com.example.kolorki;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
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

        SeekBar seekBar1 = findViewById(R.id.seekBar);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);

        TextView textR = findViewById(R.id.textView3);
        TextView textG = findViewById(R.id.textView5);
        TextView textB = findViewById(R.id.textView7);

        TextView text69 = findViewById(R.id.textView69);
        TextView text96 = findViewById(R.id.textView96);
        text69.setBackgroundColor(Color.rgb(255,255,255));
        text96.setBackgroundColor(Color.rgb(255,255,255));

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textR.setText(String.valueOf(i));
                text69.setBackgroundColor(Color.rgb(i,seekBar2.getProgress(),seekBar3.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textG.setText(String.valueOf(i));
                text69.setBackgroundColor(Color.rgb(seekBar1.getProgress(),i,seekBar3.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                textB.setText(String.valueOf(i));
                text69.setBackgroundColor(Color.rgb(seekBar1.getProgress(),seekBar2.getProgress(),i));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @SuppressLint("SetTextI18n")
    public void SaveColo(View view) {
        TextView text96 = findViewById(R.id.textView96);
        SeekBar seekBar1 = findViewById(R.id.seekBar);
        SeekBar seekBar2 = findViewById(R.id.seekBar2);
        SeekBar seekBar3 = findViewById(R.id.seekBar3);
        text96.setText(seekBar1.getProgress()+", "+seekBar2.getProgress()+", "+seekBar3.getProgress());
        text96.setBackgroundColor(Color.rgb(seekBar1.getProgress(),seekBar2.getProgress(),seekBar3.getProgress()));
    }
}