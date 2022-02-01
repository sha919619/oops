package com.neurosoft.sharif.oops.hw4;

public class daughter extends dad{
    void nation(){
        System.out.println("my nationality is Bangladeshi American");
    }

    public static void main(String[] args) {  //hierarchical
        daughter d=new daughter();
        d.nationality();
        d.nation();
    }
}
