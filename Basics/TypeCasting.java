package com.company;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = (int)(838.55f);//This line converts the float value to integer
        System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte)(a); // this is 257 % 256 = 1

//        byte a = 50;
//        byte b = 60;
//        byte c = 90;
//
//        int d = (a * b) / c;

        byte b = 28;
        char c = 'a';
        short s = 4242;
        int i = 50000;
        float f = 567.56f;
        double d = 0.1245;
        double result = (f * b)  + (i / c) - (d - s);

        System.out.println((f * b)  + " " + (i / c) + " " + (d - s));

        System.out.println(result);


    }
}
