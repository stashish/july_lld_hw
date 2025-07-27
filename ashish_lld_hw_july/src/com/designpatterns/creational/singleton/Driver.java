package com.designpatterns.creational.singleton;

public class Driver {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        System.out.println("Instance of class created from object 1 & object 2 is identical meaning singleton - " + (obj1 == obj2));
        System.out.println("As they both refer to same instance, data of the particular object is also identical");
        System.out.println("Object 1 - " + obj1.objName + " is same as " + "Object 2 - " + obj2.objName);
        System.out.print("Message From Object 1 - ");
        obj1.singletonMessage();
        System.out.print("Message From Object 2 - ");
        obj2.singletonMessage();
    }
}
