package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {

        float sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        sum = num1 + num2;
        System.out.println("Sum is: " + sum);

    }
}
