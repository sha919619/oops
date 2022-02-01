package com.neurosoft.sharif.oops.hw4;

public class overloading {
    static int sum(int a, int b){
        return a+b;
    }
    static double sum(double a, double b){
        return a*b;
    }
    static int sum(int a, int b, int c){
        return a+b-c;
    }

    public static void main(String[] args) {  //overloading
        System.out.println(overloading.sum(10,5));
        System.out.println(overloading.sum(15.0,4.0));
        System.out.println(overloading.sum(22,8,10));
    }
}
