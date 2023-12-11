package com.example3;

import java.util.Scanner;

//problem statement
// write a program to find the average of three numbers

public class threeNumbersAverage {  //function definition

    public static int threeNumbersAverage(int a, int b, int c){
        int average = (a+b+c)/3;
        return average;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("program to find average of 3 numbers");

        System.out.println("enter number 1 : ");
        int a = sc.nextInt();

        System.out.println("enter number 2 : ");
        int b = sc.nextInt();

        System.out.println("enter number 3 : ");
        int c = sc.nextInt();

        System.out.println("average of three numbers is : "+ threeNumbersAverage(a,b,c));
        //function call inside the print statement

    }

}


