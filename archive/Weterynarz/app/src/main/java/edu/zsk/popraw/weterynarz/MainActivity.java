package edu.zsk.popraw.weterynarz;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ListView listview = findViewById(R.id.myListview);
        String[] species = {"Pies","Kot","Świnka morska"};
        ArrayList<String> speciesL = new ArrayList<String>();
        speciesL.addAll(Arrays.asList(species));
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.row, speciesL);
        listview.setAdapter(adapter);
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setMax(20);
        final TextView seekBarValue = (TextView)findViewById(R.id.textView3);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener(){

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress,
                                          boolean fromUser) {
                // TODO Auto-generated method stub
                seekBarValue.setText("Ile ma lat? "+String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void clicked(View view) {
        EditText name = findViewById(R.id.editTextText);
        String nameText = name.getText().toString();
        EditText Cel = findViewById(R.id.editTextText2);
        String CelText = Cel.getText().toString();
        EditText time = findViewById(R.id.editTextTime);
        String timeText = time.getText().toString();
        String gatunek = "zwierze";
        SeekBar seekBar = (SeekBar) findViewById(R.id.seekBar);

        TextView TextUnderButton = findViewById(R.id.textView4);
        TextUnderButton.setText(nameText+", "+gatunek+", "+seekBar.getProgress()+", "+CelText+", "+timeText);
    }
}