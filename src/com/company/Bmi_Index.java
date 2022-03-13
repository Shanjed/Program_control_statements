package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bmi_Index {public static void main(String[] args) throws IOException{

    float heightShanjed , weightShanjed, bmiShanjed;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("The Program will calculate your BMI");
    System.out.println("Enter your height in cm (and press Enter): ");
    heightShanjed = Float.parseFloat(br.readLine())/100;
    System.out.println("Enter your weight in kg (and press Enter): ");
    weightShanjed = Float.parseFloat(br.readLine());

    bmiShanjed = (float) (weightShanjed / (Math.pow(heightShanjed, 2)));
    System.out.printf("Your BMI is: " + "%2.2f,  \n", bmiShanjed);


    if (bmiShanjed < 16){
        System.out.println("You are slim/skinny/suffering from starvation");
    } else if ((bmiShanjed >= 16)&&(bmiShanjed < 16.99)){
        System.out.println("You're emaciated");
    }else if ((bmiShanjed >= 17)&&(bmiShanjed < 18.49)){
        System.out.println("You're underweight");
    }else if ((bmiShanjed >= 18.50)&&(bmiShanjed < 22.99)){
        System.out.println("You're in a low range or the norm");
    }else if ((bmiShanjed >= 23)&&(bmiShanjed < 24.99)){
        System.out.println("You're in the high range of the norm");
    }else if ((bmiShanjed >= 25)&&(bmiShanjed < 27.49)){
        System.out.println("You're overweight ot pre-obese");
    }else if ((bmiShanjed >= 27.50)&&(bmiShanjed < 29.99)){
        System.out.println("You're overweight");
    }else if ((bmiShanjed >= 30)&&(bmiShanjed < 34.99)){
        System.out.println("You've 1st degree obesity");
    }else if ((bmiShanjed >= 35)&&(bmiShanjed < 39.99)){
        System.out.println("You've 2nd degree obesity");
    }else if ((bmiShanjed > 40)){
        System.out.println("You've 3rd degree obesity");
    }








}
}
