package com.example.toyoda_wagecalculator.View;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.example.toyoda_wagecalculator.R;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    Button calculate;
    EditText name, time;
    Spinner employeeType;

    @SuppressLint("SourceLockedOrientationActivity")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        calculate = findViewById(R.id.button);
        name = findViewById(R.id.name);
        time = findViewById(R.id.time);
        employeeType = findViewById(R.id.employeeType);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.employeeTypes, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        employeeType.setAdapter(adapter);
    }
}