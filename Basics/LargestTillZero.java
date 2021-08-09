package com.company;

import java.util.Scanner;

public class LargestTillZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter all numbers: ");
        int num;
        int large = 0;
        while((num = in.nextInt()) != 0)
        {
            if(num > large)
            {
                large = num;
            }
        }
        System.out.println("The largest number is: " + large);
    }
}
