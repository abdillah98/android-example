package com.example.myfirstapps;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        TextView txtWelcome = findViewById(R.id.txtWelcome);
        Button btnNext = findViewById(R.id.btnNext);

        String name = "Abdillah AG";
        String activityTitle = "Second Activity";

        txtWelcome.setText(activityTitle);
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, MainActivity.class);
            intent.putExtra("myName", name); // Kirim data antar activity dengan intent
            startActivity(intent);
        });
    }
}