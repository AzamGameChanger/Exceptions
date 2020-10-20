package com.Practicewithazam;


public class Main {
    public static void main(String[] args) {
//        String str = null;
//        System.out.println(str.length());

        try {
            int a=5; int b=0;
            int c=a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("Can not be divided by zero.");
        }


    }
}
