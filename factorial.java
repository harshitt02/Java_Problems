package com.company;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        if (num == 0) {
            System.out.println("Factorial of the number is: " + 1);
        }
        int f = 1, i = num;
//        for(int i = 1; i <= num; i++)
//        {
//            f = f*i;
//        }

        while(num/i != num)
        {
            f = f*i;
            i--;
        }

        System.out.println("The factorial of the number is: " + f);
    }
}
