package lesson02;

import java.util.Scanner;

public class HW_02_SummAndAvg{

    public static int calculateSum(int nr1, int nr2){

        int summ = 0;

        for(int i=nr1; i<=nr2; i++){
            summ+=i;
        }
        return summ;
    }

    public static float calculateAverage(int nr1, int nr2){

        return (float) (nr1 + nr2) / 2;

    }

    public static void main(String [] args){

        Scanner in = new Scanner(System.in);

        System.out.println("HOMEWORK - Exercise 2: ");
        System.out.println("Write a program that will calculate the average and sum of all numbers between the range of 2 numbers.");

        System.out.print("\n"+"Enter a first number and press ENTER: ");
        int nr1 = in.nextInt();
        in.nextLine();
        System.out.print("\n"+"Enter the second number and press ENTER: ");
        int nr2 = in.nextInt();
        in.close();

        System.out.println("\nSum for range "+nr1+" to "+nr2+" : "+ calculateSum(nr1,nr2));
        System.out.println("Average for range "+nr1+" to "+nr2+" : "+calculateAverage(nr1,nr2));

    }
}
