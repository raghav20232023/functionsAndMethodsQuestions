package com.example3;

import java.util.Scanner;

//problem statement
// write a function which takes 2 numbers and returns the greater of the two


public class twoNumbersValueComparator {

    public static int twoNumbersValueComparator(int a, int b){ //function definition

        if (a > b){
            System.out.println("number 1 is greater " + a);
            return a;
        }
        else if (b>a){
            System.out.println("number 2 is greater " + b);
            return b;
        }
        else {
            System.out.println("the numbers are equal "+ a);
            return a;

        }

    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("program to compare two numbers and return the greater of two numbers");
        System.out.println("enter number 1");
        int a  = sc.nextInt();
        System.out.println("enter number 2");
        int b = sc.nextInt();

        twoNumbersValueComparator(a,b); //function call


    }
}
