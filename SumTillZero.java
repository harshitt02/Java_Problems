package com.company;

import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter all the numbers: ");
        int num;
        while((num = in.nextInt())  != 0)
        {
            sum  = sum + num;
        }
        System.out.println("The sum is: " + sum);
    }
}
