package com.neurosoft.sharif.oops.hw4;

public class programmer extends employee{
    int compensation(){
        programmer p = new programmer();
        System.out.println("programmer salary is: " + p.salary());
        System.out.println("programmer bonus is: " + p.bonus());
        System.out.println("programmer total compensation is: " +  (p.salary() + p.bonus()));
        return 0;
    }

    public static void main (String[]args){  // singlelevel
        programmer p = new programmer();
        p.salary();
        p.bonus();
        p.compensation();


    }
}
