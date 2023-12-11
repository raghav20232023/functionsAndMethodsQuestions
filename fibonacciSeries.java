package com.example3;

//problem statement
// write a program to print fibonacci series of n terms where n is number input by the user

import java.util.Scanner;

public class fibonacciSeries {

    public static void main(String[] args){

        System.out.println("program to print fibonacci series till number of terms input by the user");
        System.out.println("enter the number of maximum terms : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 2; i<=n; i++){
            System.out.print(b + " ");

            int temp = b;
            a = temp;
            b = a + b;
            // swapping of variables
            //a = temp
            //temp = b
            // b = a + b
        }

    }
}
