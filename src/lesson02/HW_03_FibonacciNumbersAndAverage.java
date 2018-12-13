package lesson02;

import java.util.Scanner;

public class HW_03_FibonacciNumbersAndAverage {

    public static int[] getFibonacciNumbers(int x){

        int [] fibonacciArray = new int [x];

        for (int i=0; i<x; i++){
            if(i<2){
                fibonacciArray[i]=1;
            }else{
                fibonacciArray[i]=fibonacciArray[i-1]+fibonacciArray[i-2];
            }
        }

        return fibonacciArray;
    }

    public static float calculateFibonacciNumbersAverage(int [] array, int x){

        int [] fibonacciArray = getFibonacciNumbers(x);
        int sum = 0;

        for(int k:fibonacciArray){
            sum += k;
        }

        return (float)sum/x;
    }

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("HOMEWORK - Exercise 3: ");
        System.out.println("Write a program that will print the first x fibonacci numbers. Also calculate the average value. ");

        System.out.print("\n"+"Enter a target number to sum up and press ENTER: ");
        int target = in.nextInt();
        int [] fibonacciNumbers = getFibonacciNumbers(target);

        System.out.println("The first " + target + " Fibonacci numbers are: ");
        for (int t:fibonacciNumbers){
            System.out.print(t+" ");
        }

        System.out.println("\nThe average is: "+calculateFibonacciNumbersAverage(fibonacciNumbers,target));
    }
}
