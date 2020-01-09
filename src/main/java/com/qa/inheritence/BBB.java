package com.qa.inheritence;

public class BBB extends AAA {

    public int foobar(){
        System.out.println("BBB:foobar();");
        return 99;
    }

    @Override
    public void f1() {

        System.out.println("BBB.f1()");
        throw new UnsupportedOperationException("Not supported yet");
    }
}
