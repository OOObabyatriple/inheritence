package com.qa.aggregate;

public class AAA implements IAAA {

    private int x=7;

    public AAA(){

    }

    public int foobar(){
        int x=9;
        System.out.println("AAA:foobar();");

        return 3;
    }

    public void f1() {
        System.out.println("Shouldn't be here ");
    }
    private void f2(){
        System.out.println("AAA.f2()");
    }
}
