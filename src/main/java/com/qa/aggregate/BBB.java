package com.qa.aggregate;

public class BBB{

    private AAA parent =new AAA();

    public int foobar(){

        parent.foobar();

        System.out.println("BBB:foobar();");

        return 99;
    }
    public void f1() {

        System.out.println("BBB.f1()");
        //throw new UnsupportedOperationException("Not supported yet");
    }
}
