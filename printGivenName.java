package com.example3;

//problem statement:
// write a function to print a given name in a function

import java.util.Scanner;

public class printGivenName {
    public static void printMyName(String name){    //function declaration
        System.out.println(name);
        return;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);  //function calling
    }
}

