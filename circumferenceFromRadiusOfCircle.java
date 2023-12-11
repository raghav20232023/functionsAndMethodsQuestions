package com.example3;

//problem statement
// write a function that takes in the radius as input and returns the circumference of a circle

import java.util.Scanner;

public class circumferenceFromRadiusOfCircle {
    public static double circumferenceFromRadiusOfCircle(int r){    //function definition
        double pi = 3.14;
        double circumference = (2* pi * r);
        return circumference;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("program to calculate circumference of the circle with give radius");
        System.out.println("enter radius of the circle : ");
        int r = sc.nextInt();

        System.out.println("the circumference of the circle with radius "+r+" is: "+ circumferenceFromRadiusOfCircle(r));
        //function call inside print statement
    }
}
