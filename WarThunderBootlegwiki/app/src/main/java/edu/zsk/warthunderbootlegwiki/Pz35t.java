package edu.zsk.warthunderbootlegwiki;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import edu.zsk.warthunderbootlegwiki.db.AppDB;
import edu.zsk.warthunderbootlegwiki.db.entity.Tank;

public class Pz35t extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pz35t);

        TextView textView = findViewById(R.id.textView3);
        loadTank();


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void loadTank() {
        new Thread(() -> {
            // Replace with the name you're searching for
            String targetName = "Pz.35(t)";

            Tank tank = AppDB.getInstance(this).tankDao().getTankByName(targetName);

            if (tank != null) {
                // Access any field
                String name = tank.name;
                String gun = tank.mainArmament;
                String armor = tank.hullArmor;
                String speed = tank.forwardSpeed;

                // Example: Show some fields in TextView
                String display = "Name: " + name + "\n"
                        + "Gun: " + gun + "\n"
                        + "Armor: " + armor + "\n"
                        + "Speed: " + speed;

                runOnUiThread(() -> {
                    TextView textView = findViewById(R.id.textView3);
                    textView.setText(display);
                });
            } else {
                runOnUiThread(() -> {
                    TextView textView = findViewById(R.id.textView3);
                    textView.setText("Tank not found");
                });
            }

        }).start();
    }
}