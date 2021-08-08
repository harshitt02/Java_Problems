package com.company;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Please enter an input: ");
//        int rollno = input.nextInt();
//        System.out.println("Your Roll no. is " + rollno);
        String name = input.next();
        System.out.println(name);

        float marks =  input.nextFloat();
        System.out.println("Marks: " +marks);
    }
}
