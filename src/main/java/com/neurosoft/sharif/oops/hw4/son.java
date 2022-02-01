package com.neurosoft.sharif.oops.hw4;

public class son extends dad{
    void nat(){
        System.out.println("my nationality is Bangladeshi American");
    }

    public static void main(String[] args) {  //hierarchical
        son s=new son();
        s.nationality();
        s.nat();

    }
}
