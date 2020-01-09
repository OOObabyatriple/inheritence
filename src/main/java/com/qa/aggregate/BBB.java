package com.qa.aggregate;

public class BBB{

    private IAAA parent;

    public BBB(IAAA theparent){
        parent = theparent;
    }

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
