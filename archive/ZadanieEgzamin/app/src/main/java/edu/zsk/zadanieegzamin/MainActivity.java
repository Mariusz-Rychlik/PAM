package edu.zsk.zadanieegzamin;

import android.annotation.SuppressLint;
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
    @SuppressLint("SetTextI18n")
    public void confirm(View view){
        final EditText email = findViewById(R.id.editTextTextEmailAddress2);
        final EditText pass1 = findViewById(R.id.editTextTextPassword);
        final EditText pass2 = findViewById(R.id.editTextTextPassword2);
        final TextView EditField = findViewById(R.id.textView5);
        String emailAddress = email.getText().toString();
        String pass1Pass = pass1.getText().toString();
        String pass2Pass = pass2.getText().toString();
        if (emailAddress.contains("@") && pass1Pass.equals(pass2Pass)){
            EditField.setText(emailAddress);
        }
        else if (!emailAddress.contains("@") && pass1Pass.equals(pass2Pass)){
            EditField.setText("Nieprawidłowy adres e-mail");
        } else if (emailAddress.contains("@") && !pass1Pass.equals(pass2Pass)) {
            EditField.setText("Hasła się różnią");
        }
    }
}