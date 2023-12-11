package com.example3;

import java.util.Scanner;
//problem statement
//write a program to print the sum of all odd numbers from 1 to n and might include the number
// itself in sum if the number is odd aswell
public class sumOfOddNumbers {

    public static int sumOfOddNumbers(int n){   //function definition
        int number = 0;

        for (int i = 1; i<=n; i= i+2){
            number = number + i;
        }
        return number;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the maximum number till which sum of odd numbers is to be found : ");
        int n = sc.nextInt();

        System.out.println("the sum of odd numbers till given number is : "+ sumOfOddNumbers(n));
        //function call inside print statement



    }
}
