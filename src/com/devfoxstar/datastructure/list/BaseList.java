package com.devfoxstar.datastructure.list;

import java.util.List;
import java.util.ArrayList;

public class BaseList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //add - value
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("E");
        System.out.println(list);   //[A, B, C, E]

        //add - index
        list.add(3, "D");
        System.out.println(list);   //[A, B, C, D, E]

        //indexOf
        int index = list.indexOf("C");
        System.out.println(index);  //2

        //get
        System.out.println(list.get(1));    //B

        //size
        System.out.println(list.size());    //5

        //contains
        System.out.println(list.contains("C"));     //true

        //remove - value
        list.remove("C");
        System.out.println(list);   //[A, B, D, E]

        //remove - index
        list.remove(1);
        System.out.println(list);   //[A, D, E]

        //set
        list.set(0, "C");
        System.out.println(list);   //[C, D, E]

        //clear
        list.clear();
        System.out.println(list);   //[]
    }

}
