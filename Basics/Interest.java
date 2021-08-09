package com.company;
import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        float p = in.nextFloat();
        System.out.println("Enter the interest: ");
        float i = in.nextFloat();
        System.out.println("Enter the time: ");
        float t = in.nextFloat();
        float simple = (p * i * t);
        System.out.println("The simple interest is: " + simple);
    }
}
