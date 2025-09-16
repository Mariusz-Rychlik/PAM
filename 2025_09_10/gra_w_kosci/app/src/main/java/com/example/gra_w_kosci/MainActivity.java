package com.example.gra_w_kosci;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    int sum  = 0;
    int gameSum=0;
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

    public void rollDice(View view) {
        ImageView rollOne = findViewById(R.id.imageView);
        ImageView rollTwo = findViewById(R.id.imageView2);
        ImageView rollThree = findViewById(R.id.imageView3);
        ImageView rollFour = findViewById(R.id.imageView4);
        ImageView rollFive = findViewById(R.id.imageView5);
        int firstRoll = (int)(Math.random() * 6)+1;
        int secondRoll = (int)(Math.random() * 6)+1;
        int thirdRoll = (int)(Math.random() * 6)+1;
        int fourthRoll = (int)(Math.random() * 6)+1;
        int fifthRoll = (int)(Math.random() * 6)+1;
        int amountOfOnes = 0;
        int amountOfTwos = 0;
        int amountOfThrees = 0;
        int amountOfFours = 0;
        int amountOfFives = 0;
        int amountOfSixes = 0;
            if (firstRoll == 1){
                rollOne.setImageResource(R.drawable.k1);
                amountOfOnes+=1;
            }
            if (firstRoll == 2){
                rollOne.setImageResource(R.drawable.k2);
                amountOfTwos+=1;
            }
            if (firstRoll == 3){
                rollOne.setImageResource(R.drawable.k3);
                amountOfThrees+=1;
            }
            if (firstRoll == 4){
                rollOne.setImageResource(R.drawable.k4);
                amountOfFours+=1;
            }
            if (firstRoll == 5){
                rollOne.setImageResource(R.drawable.k5);
                amountOfFives+=1;
            }
            if (firstRoll == 6){
                rollOne.setImageResource(R.drawable.k6);
                amountOfSixes+=1;
            }
            if (secondRoll == 1){
                rollTwo.setImageResource(R.drawable.k1);
                amountOfOnes+=1;
            }
            if (secondRoll == 2){
                rollTwo.setImageResource(R.drawable.k2);
                amountOfTwos+=1;
            }
            if (secondRoll == 3){
                rollTwo.setImageResource(R.drawable.k3);
                amountOfThrees+=1;
            }
            if (secondRoll == 4){
                rollTwo.setImageResource(R.drawable.k4);
                amountOfFours+=1;
            }
            if (secondRoll == 5){
                rollTwo.setImageResource(R.drawable.k5);
                amountOfFives+=1;
            }
            if (secondRoll == 6){
                rollTwo.setImageResource(R.drawable.k6);
                amountOfSixes+=1;
            }
            if (thirdRoll == 1){
                rollThree.setImageResource(R.drawable.k1);
                amountOfOnes+=1;
            }
            if (thirdRoll == 2){
                rollThree.setImageResource(R.drawable.k2);
                amountOfTwos+=1;
            }
            if (thirdRoll == 3){
                rollThree.setImageResource(R.drawable.k3);
                amountOfThrees+=1;
            }
            if (thirdRoll == 4){
                rollThree.setImageResource(R.drawable.k4);
                amountOfFours+=1;
            }
            if (thirdRoll == 5){
                rollThree.setImageResource(R.drawable.k5);
                amountOfFives+=1;
            }
            if (thirdRoll == 6){
                rollThree.setImageResource(R.drawable.k6);
                amountOfSixes+=1;
            }
            if (fourthRoll == 1){
                rollFour.setImageResource(R.drawable.k1);
                amountOfOnes+=1;
            }
            if (fourthRoll == 2){
                rollFour.setImageResource(R.drawable.k2);
                amountOfTwos+=1;
            }
            if (fourthRoll == 3){
                rollFour.setImageResource(R.drawable.k3);
                amountOfThrees+=1;
            }
            if (fourthRoll == 4){
                rollFour.setImageResource(R.drawable.k4);
                amountOfFours+=1;
            }
            if (fourthRoll == 5){
                rollFour.setImageResource(R.drawable.k5);
                amountOfFives+=1;
            }
            if (fourthRoll == 6){
                rollFour.setImageResource(R.drawable.k6);
                amountOfSixes+=1;
            }
            if (fifthRoll == 1){
                rollFive.setImageResource(R.drawable.k1);
                amountOfOnes+=1;
            }
            if (fifthRoll == 2){
                rollFive.setImageResource(R.drawable.k2);
                amountOfTwos+=1;
            }
            if (fifthRoll == 3){
                rollFive.setImageResource(R.drawable.k3);
                amountOfThrees+=1;
            }
            if (fifthRoll == 4){
                rollFive.setImageResource(R.drawable.k4);
                amountOfFours+=1;
            }
            if (fifthRoll == 5){
                rollFive.setImageResource(R.drawable.k5);
                amountOfFives+=1;
            }
            if (fifthRoll == 6){
                rollFive.setImageResource(R.drawable.k6);
                amountOfSixes+=1;
            }
        if (amountOfOnes <2){
            amountOfOnes=0;
        }
        if (amountOfTwos <2){
            amountOfTwos=0;
        }
        if (amountOfThrees <2){
            amountOfThrees=0;
        }
        if (amountOfFours <2){
            amountOfFours=0;
        }
        if (amountOfFives <2){
            amountOfFives=0;
        }
        if (amountOfSixes <2){
            amountOfSixes=0;
        }
        sum = amountOfOnes +amountOfTwos*2+amountOfThrees*3+amountOfFours*4+amountOfFives*5+amountOfSixes*6;
        gameSum += sum;
        TextView Text1 = findViewById(R.id.textView2);
        TextView Text2 = findViewById(R.id.textView3);
        Text1.setText("Wynik tego losowania: "+sum);
        Text2.setText("Wynik gry: "+gameSum);
    }

    public void resetGame(View view) {
        ImageView rollOne = findViewById(R.id.imageView);
        ImageView rollTwo = findViewById(R.id.imageView2);
        ImageView rollThree = findViewById(R.id.imageView3);
        ImageView rollFour = findViewById(R.id.imageView4);
        ImageView rollFive = findViewById(R.id.imageView5);
        rollOne.setImageResource(R.drawable.question);
        rollTwo.setImageResource(R.drawable.question);
        rollThree.setImageResource(R.drawable.question);
        rollFour.setImageResource(R.drawable.question);
        rollFive.setImageResource(R.drawable.question);
        TextView Text1 = findViewById(R.id.textView2);
        TextView Text2 = findViewById(R.id.textView3);
        sum=0;
        gameSum=0;
        Text1.setText("Wynik tego losowania: "+sum);
        Text2.setText("Wynik gry: "+gameSum);
    }
}