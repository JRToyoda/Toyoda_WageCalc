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
        } else {
            variables.setTime(time);
            switch (employeeType) {
                case "Regular":
                    //samseng
                    break;
                case "Probationary":
                    //samseng
                    break;
                case "Part-time":
                    //samseng
            }
        }
    }

    @SuppressLint("SetTextI18n")
    public static void Output(TextView wageOutput, TextView regOutput, TextView OTwageOutput, TextView timeOutput, TextView OTOutput) {
        wageOutput.setText(Integer.toString(variables.getTotalWage()));
        regOutput.setText(Integer.toString(variables.getRegWage()));
        OTwageOutput.setText(Integer.toString(variables.getOTWage()));
        timeOutput.setText(Integer.toString(variables.getOT()));
    }
}
