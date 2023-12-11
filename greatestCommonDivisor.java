package com.example3;

import java.util.Scanner;

//problem statement
//write a function that calculates the greatest common divisor of two numbers

public class greatestCommonDivisor {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("program to find GCD of two numbers");

        System.out.println("enter number 1");
        int n1 = sc.nextInt();

        System.out.println("enter number 2");
        int n2 = sc.nextInt();


        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " + n2);
    }
}
