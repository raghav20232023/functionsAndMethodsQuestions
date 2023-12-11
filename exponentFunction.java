package com.example3;

import java.util.Scanner;

public class exponentFunction {
    public static double exponentFunction(double x, double n){  //function definition
        return Math.pow(x,n);
    }

    public static void main(String[] args){
        System.out.println("enter number to be raised to power (x): ");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        System.out.println("enter power (n) to which number x should be raised");
        double n = sc.nextDouble();

        System.out.println("x^n is : "+ exponentFunction(x,n));
        //function call inside print statement
    }
}
