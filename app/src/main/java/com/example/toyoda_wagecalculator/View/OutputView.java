package com.example.toyoda_wagecalculator.View;

import android.annotation.SuppressLint;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.toyoda_wagecalculator.R;

import java.util.Objects;

public class OutputView extends AppCompatActivity {

    TextView name, type, totalWage, regWage, OTWage, time, OT;
    Button back;

    @SuppressLint("SourceLockedOrientationActivity")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.output);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        name = findViewById(R.id.outputName);
        type = findViewById(R.id.outputType);
        totalWage = findViewById(R.id.wageOutput);
        regWage = findViewById(R.id.regOutput);
        OTWage = findViewById(R.id.OTwageOutput);
        time = findViewById(R.id.timeOutput);
        OT = findViewById(R.id.OTOutput);
        back = findViewById(R.id.button2);
    }
}