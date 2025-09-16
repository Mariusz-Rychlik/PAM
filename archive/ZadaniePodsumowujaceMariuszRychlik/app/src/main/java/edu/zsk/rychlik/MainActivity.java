package edu.zsk.rychlik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import edu.zsk.rychlik.db.AppDatabase;
import edu.zsk.rychlik.db.User;
import edu.zsk.rychlik.db.UserDao;

public class MainActivity extends AppCompatActivity {

    private AppDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        db = AppDatabase.getInstance(getApplicationContext());
        initDb();

        Button loginButton = findViewById(R.id.loginButton);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText email = findViewById(R.id.emailInput);
                String emailText = email.getText().toString();
                EditText password = findViewById(R.id.passwordInput);
                String passwordText = password.getText().toString();
                if (emailText.isEmpty() || passwordText.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Wypelnij wszystkie pola!", Toast.LENGTH_LONG).show();
                }
                if (!checkCredentials(emailText, passwordText)){
                    Toast.makeText(MainActivity.this, "Niepoprawne dane logowania!", Toast.LENGTH_LONG).show();
                    password.setText("");
                } else {
                    Toast.makeText(MainActivity.this, "Zalogowano!", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(MainActivity.this, LoggedInActivity.class));
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initDb() {
        UserDao userDao = db.userDao();
        if (userDao.getUserCount() == 0) {
            userDao.insertAll(
                    new User("admin@example.com", "admin"),
                    new User("user1@example.com", "user1"),
                    new User("user2@example.com", "user2"),
                    new User("user3@example.com", "user3")
            );
        }
    }
    private boolean checkCredentials(String email, String password) {
        User user = db.userDao().getUserByEmail(email);
        return user != null && user.password.equals(password);
    }
}