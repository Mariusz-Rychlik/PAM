package edu.zsk.workingbutton;

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
        Button b1 = findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                final EditText textToast = findViewById(R.id.editTextText2);
                String toastText=textToast.getText().toString();
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(MainActivity.this,toastText,duration);
                toast.show();
            }
        });
    }
    public void changeText(View view){
        final EditText text = findViewById(R.id.editTextText);
        String value = text.getText().toString();
        final TextView textChanging = findViewById(R.id.textView);
        textChanging.setText(value);
    }

}