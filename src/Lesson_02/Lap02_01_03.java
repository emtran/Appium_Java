package Lesson_02;


import java.text.DecimalFormat;
import java.util.Scanner;

/*
* LAB 2.1: Get input from user about height(m) and weight(kg) then calculate BMI
* - Underweight = < 18.5
* - Normal weight = 18.5 - 24.9
* - Overweight = 25 - 29.9
* - Obesity = BMI of 30 or greater
* BMI = weight / (height * height)
*
* LAP 2.3: Suggest user to increase/decrease weight.
 */

public class Lap02_01_03 {

    public static void calculatorBMI(float weight, float height){

        final  float  UNDERWEIGHT = 18.5F;
        final  float  NORMAL_WEIGHT = 24.9F;
        final  float  MAX_OVERWEIGHT = 29.9F;
        final  float  MIN_OVERWEIGHT = 25F;
        final  float  OBESITY = 30F;

        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        float BMI = (weight / (height * height));
        if (BMI < UNDERWEIGHT ){
            System.out.println("Your BMI is " + decimalFormat.format(BMI) +
                    " - Underweight" + ". BMI shows you are thin.");
            float increase =  UNDERWEIGHT - BMI ;
            System.out.println("You should gain " + decimalFormat.format(increase) + " kgs to reach a BMI " + UNDERWEIGHT );

        }else if (BMI < NORMAL_WEIGHT){
            System.out.println("Your BMI is " + decimalFormat.format(BMI) +
                    " - Normal weight" + ". Congratulations, you have normal stats.");

        }else if (BMI < MAX_OVERWEIGHT){
            System.out.println("Your BMI is " + decimalFormat.format(BMI) +
                    " - Overweight" + ". BMI shows you are overweight.");
            float decrease = BMI - MIN_OVERWEIGHT;
            System.out.println("You should lose " + decimalFormat.format(decrease) + " kgs to reach a BMI "+ MIN_OVERWEIGHT );

        }else {
            System.out.println("Your BMI is " + decimalFormat.format(BMI) +
                    " - Obesity" + ". BMI shows you are obese.");
            float decrease = BMI - OBESITY;
            System.out.println("You should lose " + decimalFormat.format(decrease) + " kgs to reach a BMI " + OBESITY);
        }
    }

    public static float inputWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight in kg:");
        float weight = scanner.nextFloat();
        if (weight < 0) {
            System.out.println("Please input your weight greater than 1");
            System.out.print("Please input your weight in kg:");
            weight = scanner.nextFloat();
        }
        return weight;
    }


    public static float inputHeight(){
        System.out.print("Please input your height in meters:");
        Scanner scanner = new Scanner(System.in);
        float height = scanner.nextFloat();
        if (height < 0){
            System.out.println("Please input your height greater than 1");
            System.out.print("Please input your height in meters:");
            height = scanner.nextFloat();
        }
        return height;
    }

    public static void main(String[] args ){

        calculatorBMI(inputWeight(), inputHeight());

    }
}




