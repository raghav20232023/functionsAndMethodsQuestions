package com.example3;

import java.util.Scanner;

public class countPositiveNegativeZero {

    public static void countPositiveNegativeZero(int countPositive, int countNegative, int countZero){
    //function definition
        System.out.println("number of positive numbers are: "+ countPositive);
        System.out.println("number of negative numbers are: "+ countNegative);
        System.out.println("number of zeroes are: "+ countZero);
    }


    public static void main(String[] args){
        int userControl = 1;
        int countPositive = 0;  //counter variable
        int countNegative = 0;  //counter variable
        int countZero = 0;  //counter variable
         while (userControl == 1){



            System.out.println("enter a number : ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();

            if (number > 0){
                countPositive = countPositive + 1;
            }
            else if (number < 0){
                countNegative = countNegative +1;

            } else if (number == 0) {
                countZero = countZero + 1;
            }

            System.out.println("do you want to enter more numbers (yes = 1/ no = 0): ");
            userControl = sc.nextInt();




         }
         countPositiveNegativeZero(countPositive,countNegative,countZero);
        //function call


    }
}
