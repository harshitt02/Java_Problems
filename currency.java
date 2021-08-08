package com.company;

import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rupee: ");
        float rupee = in.nextFloat();
        double dollar = 0.013 * rupee;
        System.out.println("Rupee to dollar conversion is: " + dollar);

    }
}
