package com.example3;

//problem statement
// write a function that takes in age as input and return if that person is eligible to vote or not.
// a person of age > 18 is eligible to vote

import java.util.Scanner;

public class eligibleToVote {
    public static void eligibleToVote (int age){    //function definition

        if (age >= 18 ){
            System.out.println("You are eligible to vote ");
        }
        else if (age < 0){
            System.out.println("Invalid age");
        }else {
            System.out.println(" You are not eligible to vote ");
        }


    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age : ");
        int age = sc.nextInt();

        eligibleToVote(age);    //function call



    }
}
