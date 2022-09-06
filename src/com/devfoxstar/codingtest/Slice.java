package com.devfoxstar.codingtest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Slice {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        List<String> subList = new ArrayList<>();
        for (int i = 2; i < 4; i++) {
             subList.add(list.get(i));
        }

        System.out.println(subList);    //[C, D]

        List<String> subList2 = new ArrayList<>(list.subList(2,4));
        System.out.println(subList2);    //[C, D]

        List<String> subList3 = list.stream().skip(2).limit(2).collect(Collectors.toList());
        System.out.println(subList3);    //[C, D]
    }
}