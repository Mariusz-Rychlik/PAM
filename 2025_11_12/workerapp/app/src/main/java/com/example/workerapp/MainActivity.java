package com.example.workerapp;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String abc = "qwertyuiopasdfghjklzxcvbnm";
    String ABC = "QWERTYUIOPASDFGHJKLZXCVBNM";
    String numb = "0123456789";
    String special = "!@#$%^&*()_+-=";
    String pass = "";

    String[] positions = {
            "kierownik", "starszy programista", "mlodszy programista", "tester"
    };

    String positionWork = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                positions
        );

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                positionWork = positions[position];
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) { }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void generate(View view) {

        pass = "";

        EditText howLongET = findViewById(R.id.editTextNumber2);
        CheckBox check1 = findViewById(R.id.checkBox);
        CheckBox check2 = findViewById(R.id.checkBox2);
        CheckBox check3 = findViewById(R.id.checkBox3);

        int howLong = Integer.parseInt(howLongET.getText().toString());

        if (check1.isChecked()) {
            pass += ABC.charAt((int) (Math.random() * ABC.length()));
            howLong--;
        }
        if (check2.isChecked()) {
            pass += numb.charAt((int) (Math.random() * numb.length()));
            howLong--;
        }
        if (check3.isChecked()) {
            pass += special.charAt((int) (Math.random() * special.length()));
            howLong--;
        }
        while (howLong > 0) {
            pass += abc.charAt((int) (Math.random() * abc.length()));
            howLong--;
        }

        Toast.makeText(this, pass, Toast.LENGTH_SHORT).show();
    }

    public void submit(View view) {
        EditText ET1=findViewById(R.id.editTextText);
        EditText ET2 = findViewById(R.id.editTextText2);
        String ET1Text = ET1.getText().toString();
        String ET2Text = ET2.getText().toString();
        Toast.makeText(this, "Dane pracownika: "+ET1Text+" "+ET2Text+" "+positionWork+" Haslo: "+pass, Toast.LENGTH_SHORT).show();
    }
}
