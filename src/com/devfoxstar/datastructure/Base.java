package com.devfoxstar.datastructure;

import java.util.*;

public class Base {

    public static void main (String[] args) {

        //Array - Init
        int[] numbers = { 1, -1, 0 };
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);     //1, -1, 0
        }

        //Array - Size
        int[] numbers2 = new int[3];
        numbers2[0] = 1;
        numbers2[1] = -1;
        numbers2[2] = 0;

        for (int i=0; i<numbers2.length; i++) {
            System.out.println(numbers2[i]);    //1, -1, 0
        }

        //Array - Sort Asc
        Arrays.sort(numbers2);
        for (int i=0; i<numbers2.length; i++) {
            System.out.println(numbers2[i]);    //-1, 0, 1
        }

        //Array - Sort Desc
        Integer[] numbers3 = Arrays.stream(numbers2).boxed().toArray(Integer[]::new);
        Arrays.sort(numbers3, Collections.reverseOrder());
        for (int i=0; i<numbers3.length; i++) {
            System.out.println(numbers3[i]);    //1, 0, -1
        }


        //ArrayList
        ArrayList<String> arrays = new ArrayList<String>();
        arrays.add("ㄱ");
        arrays.add("ㄷ");
        arrays.add("ㄴ");
        for (String item : arrays) {
            System.out.println(item);   //ㄱ, ㄷ, ㄴ
        }


        //List
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("c");
        list.add("b");

        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));   //a, c, b
        }

        //List - Lamda,
        list.forEach(s -> System.out.println(s));   //a, c, b

        //List - Sort Asc
        Collections.sort(list);
        list.forEach(s -> System.out.println(s));   //a, b, c

        //List - Sort Desc
        Collections.sort(list, Collections.reverseOrder());
        list.forEach(s -> {
            System.out.println(s);   //c, b, a
        });


        //HashMap
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "가");
        map.put(2, "다");
        map.put(3, "나");

        map.forEach((k, v) -> {
            System.out.println(String.format("%s = %s", k, v));    //1 = 가, 2 = 다, 3 = 나
        });

    }

}
