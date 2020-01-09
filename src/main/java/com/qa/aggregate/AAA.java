package com.qa.aggregate;

public abstract class AAA {

    private int x=7;

    public AAA(){

    }

    public int foobar(){
        int x=9;
        System.out.println("AAA:foobar();");

        return 3;
    }

    public abstract void f1();
}
