package com.example3;

import java.util.Scanner;

//problem statement
// make a program to add two numbers and return the sum
public class addTwoNumbers {

    public static int addTwoNumbers(int a, int b){  //function definition
        int sum  = a + b;
        return sum;

    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number 1 : ");
        int a = scanner.nextInt();
        System.out.println("enter number 2 : ");
        int b = scanner.nextInt();


        int sum = addTwoNumbers(a,b);   // function call
        System.out.println("sum of two numbers is : "+ sum);
    }
}
