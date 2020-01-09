package com.qa.aggregate;

public class MainUnit {

    public static void main(String[] args){
        IAAA root=new AAAStub();
        BBB parent =new BBB(root);

        parent.foobar();
    }
}
