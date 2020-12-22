package com.knowledgelens.calclibrary;

public class KLCalculator {
    public static int plus(int a, int b){
        return a+b;
    }

    public static int minus(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static int divide(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("Divide by zero");
        }
        else{
            return a/b;
        }
    }
}
