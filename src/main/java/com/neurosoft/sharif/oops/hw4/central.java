package com.neurosoft.sharif.oops.hw4;

public class central {
    double interestRate(){
        return 0;
    }

    public static void main(String[] args) {  //overriding
        central c;
        c= new capital1();
        System.out.println("capital one bank interest rate is: " + c.interestRate());
        c= new td();
        System.out.println("TD bank interest rate is: " + c.interestRate());
        c= new chase();
        System.out.println("Chase bank interest rate is: " + c.interestRate());
    }
}
