package com.example.toyoda_wagecalculator.Controller;

import android.annotation.SuppressLint;
import android.widget.TextView;

import com.example.toyoda_wagecalculator.Model.WageModel;

public class WageController {
    static WageModel variables = new WageModel();

    public static void Calculator(int time, String employeeType) {
        if(time <= 8) {
            variables.setTime(time);
            variables.setOTWage(0);
            variables.setOT(0);
            switch (employeeType) {
                case "Regular":
                    variables.setRegWage(variables.getTime()*100);
                    break;
                case "Probationary":
                    variables.setRegWage(variables.getTime()*90);
                    break;
                case "Part-time":
                    variables.setRegWage(variables.getTime()*75);
            }
            variables.setTotalWage(variables.getRegWage());
        } else {
            variables.setTime(time);
            variables.setOT(time - 8);
            switch (employeeType) {
                case "Regular":
                    variables.setOTWage(variables.getOTWage()*115);
                    variables.setRegWage(800);
                    break;
                case "Probationary":
                    variables.setOTWage(variables.getOTWage()*100);
                    variables.setRegWage(720);
                    break;
                case "Part-time":
                    variables.setOTWage(variables.getOTWage()*90);
                    variables.setRegWage(600);
            }
            variables.setTotalWage(variables.getOTWage() + variables.getRegWage());
        }
    }

    @SuppressLint("SetTextI18n")
    public static void Output(TextView wageOutput, TextView regOutput, TextView OTwageOutput, TextView timeOutput, TextView OTOutput) {
        wageOutput.setText(Integer.toString(variables.getTotalWage()));
        regOutput.setText(Integer.toString(variables.getRegWage()));
        OTwageOutput.setText(Integer.toString(variables.getOTWage()));
        timeOutput.setText(Integer.toString(variables.getTime()));
        OTOutput.setText(Integer.toString(variables.getOT()));
    }
}