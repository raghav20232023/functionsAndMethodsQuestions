package com.example3;
//problem statement
// write a function to find the product of two given numbers


import java.util.Scanner;

public class productOfTwoNumbers {

    public static int productOfTwoNumbers (int a, int b){   //function definition
        return a * b;

    }

    public static void main(String[] args){
        System.out.println("enter number 1 : ");
        Scanner scanner = new Scanner(System.in);
        int a  = scanner.nextInt();
        System.out.println("enter number 2 : ");
        int b = scanner.nextInt();

        System.out.println("the product of two numbers is: " + productOfTwoNumbers(a,b));
        // function call inside print statement
    }
}
