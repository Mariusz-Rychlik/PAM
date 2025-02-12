package com.example.a12022025;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int clicks = 0;
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
    public void clicked(View view) {
        clicks++;
          EditText Name = findViewById(R.id.editTextText);
          EditText Email = findViewById(R.id.editTextText2);
          String Nametxt = Name.getText().toString();
          String Emailtxt = Email.getText().toString();
          if (Nametxt.isEmpty() | Emailtxt.isEmpty()){
              Toast toast = Toast.makeText(this,"Najpierw uzupełnij swoje dane",Toast.LENGTH_SHORT);
              toast.show();
          }else{
              TextView textView2 = findViewById(R.id.textView2);
              textView2.setText("Witaj, "+Nametxt+" ! Twój adres e-mail to: "+Emailtxt);
              TextView textView = findViewById(R.id.textView3);
              textView.setText("Kliknąłeś przycisk"+clicks+"razy");
          }
    }
}