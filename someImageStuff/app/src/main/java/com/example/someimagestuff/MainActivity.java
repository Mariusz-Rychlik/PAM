package com.example.someimagestuff;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private ImageView papaj1;
    private ImageView papaj2;
    private ImageView papaj3;
    private ImageView papaj4;
    private ImageView papaj5;
    private ImageView papaj6;
    private ImageView papaj7;
    private ImageView papaj8;
    private ImageView papaj9;
    private ImageView papaj10;
    private ImageView papaj11;
    private ImageView papaj12;
    private ImageView papaj13;
    private ImageView papaj14;
    private ImageView papaj15;
    private Drawable papajImg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        papaj1 = findViewById(R.id.imageView3);
        papaj2 = findViewById(R.id.imageView4);
        papaj3 = findViewById(R.id.imageView5);
        papaj4 = findViewById(R.id.imageView6);
        papaj5 = findViewById(R.id.imageView7);
        papaj6 = findViewById(R.id.imageView8);
        papaj7 = findViewById(R.id.imageView9);
        papaj8 = findViewById(R.id.imageView10);
        papaj9 = findViewById(R.id.imageView11);
        papaj10 = findViewById(R.id.imageView12);
        papaj11 = findViewById(R.id.imageView13);
        papaj12 = findViewById(R.id.imageView14);
        papaj13 = findViewById(R.id.imageView15);
        papaj14 = findViewById(R.id.imageView16);
        papaj15 = findViewById(R.id.imageView17);

        papaj1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj1.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj2.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj3.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj4.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj5.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj6.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj7.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj8.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj9.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj10.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj11.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj12.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj13.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj14.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });
        papaj15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable pajajImg = papaj15.getDrawable();
                MyFragment dialogFragment=new MyFragment();
                dialogFragment.show(getSupportFragmentManager(),"My  Fragment");
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public Drawable getMyDrawable(){
        return papajImg;
    }
}