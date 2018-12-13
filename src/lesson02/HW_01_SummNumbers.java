package lesson02;

import java.util.Scanner;

public class HW_01_SummNumbers{
        public static int summ_all_numbers_till_target(int target_number){

            int sum = 0;
            for (int i=0; i<=target_number; i++) {
                sum += i;
            }
            return sum;
        }

        public static void main(String [] args){

            Scanner in = new Scanner(System.in);

            System.out.println("HOMEWORK - Exercise 1: ");
            System.out.println("Write a program that will sum up all numbers from 0 up to a target number.");

            System.out.print("\n"+"Enter a target number to sum up and press ENTER: ");

            int target_nr =  in.nextInt();

            System.out.println("Sum result: "+ summ_all_numbers_till_target(target_nr));

        }
}
