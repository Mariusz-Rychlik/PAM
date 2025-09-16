package com.example.weirdahclickermomentrighthereimaabouttobootupcookieclickernglcuzitsactuallyfire;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
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

    int clickthatbuttonorgetout = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        EditText editText1 = findViewById(R.id.editTextText);
        EditText editText2 = findViewById(R.id.editTextTextEmailAddress);
        TextView textnotworkingfuckingendthissufferingpls = findViewById(R.id.textView3);
        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String text1 = editText1.getText().toString().trim();
                String text2 = editText2.getText().toString().trim();

                if (!text1.isEmpty() && !text2.isEmpty()) {
                    textnotworkingfuckingendthissufferingpls.setText("Witaj, "+text1+"! Twój adres e-mail to:"+text2);
                }
            }

            @Override
            public void afterTextChanged(Editable s) { }
        };

        // Attach the watcher to both EditTexts
        editText1.addTextChangedListener(textWatcher);
        editText2.addTextChangedListener(textWatcher);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    @Override
    protected void onSaveInstanceState(Bundle outState){
        EditText Name = findViewById(R.id.editTextText);
        EditText Email = findViewById(R.id.editTextTextEmailAddress);
        TextView txt2 = findViewById(R.id.textView4);
        TextView textnotworkingfuckingendthissufferingpls = findViewById(R.id.textView3);
        String NameText = Name.getText().toString();
        String EmailText = Email.getText().toString();
        String txt2txt = txt2.getText().toString();
        String duckingtextthatworksnowismypaincuzitpainandcoffeeisgut = textnotworkingfuckingendthissufferingpls.toString();
        int mfbuttonthatIhaveclickedmanymanymanymanytimesover = clickthatbuttonorgetout;
        outState.putString("name",NameText);
        outState.putString("Email",EmailText);
        outState.putString("textbuttonclickedmanytimesoversofunfunfun",txt2txt);
        outState.putString("coffee",duckingtextthatworksnowismypaincuzitpainandcoffeeisgut);
        outState.putInt("BUTTON",mfbuttonthatIhaveclickedmanymanymanymanytimesover);
        super.onSaveInstanceState(outState);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        EditText Name = findViewById(R.id.editTextText);
        EditText Email = findViewById(R.id.editTextTextEmailAddress);
        TextView txt2 = findViewById(R.id.textView4);
        TextView textnotworkingfuckingendthissufferingpls = findViewById(R.id.textView3);
        int clickthatbuttonorgetout = savedInstanceState.getInt("BUTTON");
        Name.setText(savedInstanceState.getString("name"));
        Email.setText(savedInstanceState.getString("Email"));
        txt2.setText(savedInstanceState.getString("textbuttonclickedmanytimesoversofunfunfun"));
        textnotworkingfuckingendthissufferingpls.setText(savedInstanceState.getString("coffee"));
    }


    public void clickedthatbuttonsoharditchangedthe0to1reallyquicksofastthatmytypingissomewhatuselessbutmybrainnowork(View view) {
        EditText Name = findViewById(R.id.editTextText);
        EditText Email = findViewById(R.id.editTextTextEmailAddress);
        String NameText = Name.getText().toString();
        String EmailText = Email.getText().toString();

        TextView txt2 = findViewById(R.id.textView4);
        if (NameText.isEmpty() | EmailText.isEmpty()) {
            Toast.makeText(this, "Najpierw uzupelnij swoje dane", Toast.LENGTH_SHORT).show();
        } else {
            clickthatbuttonorgetout++;
            txt2.setText("Kliknąłeś przycisk " + clickthatbuttonorgetout + " razy");
        }
    }
}