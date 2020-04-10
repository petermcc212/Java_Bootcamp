package com.example.test;

//package private interface
interface Accessible {

    // public
    int SOME_CONSTANT = 100;

    // public
    public void methodA();

    // public
    void methodB();
    boolean method();


    // all interfaces are public by default. This is why they are public
    // without access modifiers.
    // This is because you cannot have interfaces that are private.

}
