package com.guru99.qa.rough;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*ArrayList obj1 = new ArrayList();

        obj1.add(123456789);
        obj1.add('A');
        obj1.add("Hello, World!");
        obj1.add(false);
        obj1.add(45.54);

        System.out.println(obj1.get(2));*/

        /*int myListSize = obj1.size();

        for (int i = 0; i<myListSize; i++){
            System.out.println("List from array list are: " + obj1.get(i));
        }*/

       /* for (Object abc:obj1){
            System.out.println(abc);
        }*/

        HashSet<String> str = new HashSet<String>();
        str.add("Hello");
        str.add("World!");
        str.add("12345");
        str.add("256.21");
        str.add("Selenium");

        for (String e:str){
            System.out.println(e);
        }
    }
}
