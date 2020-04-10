package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else{
            languages.put("Java", "A compiled high level object-orientated, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "An interpreted object-orientated high level programming language with dynaming symantics");
        languages.put("Algol", "An algorithmic language");
        languages.put("BASIC", "Beginners All Purpose Symbollic Instruction Code");
        languages.put("Lisp", "Therein lies madness");


        if(languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        }else{
            languages.put("Java", "this course is about Java");
        }
        System.out.println(languages.get("Java"));

        System.out.println("==============================================");


//        languages.remove("Lisp");
        if(languages.remove("Algol", "A family of algorithmic languages")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "A functional programming language with imperative features"));
        System.out.println(languages.replace("Scalar", "this will not be added"));
        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
