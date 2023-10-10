package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView MainText;
    private Button ColorChangeButton;
    private boolean textColorChanged = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize views
        MainText = findViewById(R.id.MainText);
        ColorChangeButton = findViewById(R.id.ColorChangeButton);
    }

    public void ChangeMainTextTxt(View view) {
        MainText.setText("Text has changed");
    }

    public void ChangeMainTextColor(View view) {
        if (textColorChanged) {
            MainText.setTextColor(Color.BLACK);
        } else {
            MainText.setTextColor(Color.RED);
        }
        textColorChanged = !textColorChanged;
        Toast.makeText(this, "Color Has Changed", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Some message", Toast.LENGTH_SHORT).show();
    }
}
