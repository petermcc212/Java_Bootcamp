package com.example.test;

public class Main {

    public static void main(String[] args) {

        String var4 = "this is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        scopeInstance.userInner();

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();



        System.out.println("ScopeInstance var1 is " + scopeInstance.getVar1());
        System.out.println(var4);

        scopeInstance.timesTwo();
        System.out.println("************************");

        innerClass.timesTwo();


    }
}
