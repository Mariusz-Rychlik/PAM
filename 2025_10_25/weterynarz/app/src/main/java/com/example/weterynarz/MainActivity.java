package com.example.weterynarz;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> Strings = new ArrayList<String>();
    String animal="";
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

        ListView Listview = findViewById(R.id.listView1);
        SeekBar seeker = findViewById(R.id.seekBar);
        TextView seekerValue = findViewById(R.id.textView6);
        Strings.add("Pies");
        Strings.add("Kot");
        Strings.add("Swinka morksa");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, Strings);

        Listview.setAdapter(adapter);
        seeker.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {}
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean
                    fromUser) {
                seekerValue.setText(String.valueOf(progress));

            }
        });

        Listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> myAdapter, View myView, int
                    myItemInt, long mylng) {
                  if (Listview.getItemAtPosition(myItemInt) =="Pies"){
                      seeker.setMax(18);
                      animal="Pies";
                  }
                if (Listview.getItemAtPosition(myItemInt) =="Kot"){
                    seeker.setMax(20);
                    animal="Kot";
                }
                if (Listview.getItemAtPosition(myItemInt) =="Swinka morksa"){
                    seeker.setMax(9);
                    animal="swinka morksa";
                }
            }
        });
    }

    public void clickedOK(View view) {
        EditText Text1 = findViewById(R.id.editTextText);
        String name = Text1.getText().toString();
        SeekBar seeker2 = findViewById(R.id.seekBar);
        String value = String.valueOf(seeker2.getProgress());
        EditText Text2 = findViewById(R.id.editTextText2);
        String goal = Text2.getText().toString();
        EditText Time = findViewById(R.id.editTextTime);
        String time = Time.getText().toString();
        Toast.makeText(this, name+", "+animal+", "+value+", "+goal+", "+time, Toast.LENGTH_SHORT).show();
    }
}