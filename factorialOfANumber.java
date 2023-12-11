package com.example3;

//problem statement
// write a function to print the factorial of a given number

import java.util.Scanner;

public class factorialOfANumber {   //function defintion

    public static int factorialNumber(int a) {

        int factorial = 1;

        for (int i = a; i >= 1; i--) {
            factorial = factorial * i;

        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("enter number whose factorial is to be found : ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a<0){
            System.out.println("factorial of a negative number is not possible, please enter a positive number or 0");
        }

        System.out.println("factorial of the given number is : " + factorialNumber(a));
        //function call inside the print statement
    }
}



