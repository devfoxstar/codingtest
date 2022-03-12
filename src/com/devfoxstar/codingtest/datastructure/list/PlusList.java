package com.devfoxstar.codingtest.datastructure.list;

import java.util.*;

public class PlusList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "C", "B"));

        //for
        for (int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));    //A C B
        }

        //foreach
        for (String item : list) {
            System.out.println(item);   //A C B
        }

        //foreach - Lamda
        list.forEach(s -> System.out.println(s));   //A C B

        //while - Iterator
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());    //A C B
        }

        //Sort - Asc
        Collections.sort(list);
        list.forEach(s -> System.out.println(s));   //A B C

        //Sort - Desc
        Collections.sort(list, Collections.reverseOrder());
        list.forEach(s -> System.out.println(s));   //C B A

        //String.join
        String join = String.join(",", list);
        System.out.println(join);   //C, B, A
    }

}
