package com.designpatterns.creational.singleton;

public class Singleton {

    //constructor
    private Singleton () { }

    //cold start everytime
    public static Singleton instance = null;

    //hot start everytime
//    public static final Singleton instance = new Singleton();

//    public static Singleton getInstance() {
//        if(instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }

    //bill pugh method
    // loaded when the first reference is made
    private static final class FRInstance {
        //cold start
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return FRInstance.instance;

    }
}
