package Lesson_02;

/*
 * LAB 2.2: Allow user to input a number, print out it's an odd or even number
 */

import java.util.Scanner;

public class Lap02_02 {
    public static void defineNumber(float number){
        float numberResult = number%2;
        if (numberResult == 0 ){
            System.out.println("It is even number.");
        }else System.out.println("It is odd number.");

    }

    public static void main(String[] args) {
        System.out.print("Please input a number:");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();
        defineNumber(number);
    }

}
