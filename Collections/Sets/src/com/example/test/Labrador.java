package com.example.test;

public class Labrador extends Dog{



    public Labrador(String name) {
        super(name);
    }

//    @Override
//    public boolean equals(Object obj) {
//        // check whether obj is the same object in memory
//        // as this object
//        if(this == obj){
//            return true;
//        }
//        if(obj instanceof Labrador){
//            String objName = ((Labrador) obj).getName();
//            return this.getName().equals(objName);
//        }
//
//        return false;
//    }
}
