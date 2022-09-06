package com.devfoxstar.codingtest;

public class Compare {

    public static void main(String[] args) {
        Integer A = 128;
        Integer B = new Integer(128);

        if (A == B)
            System.out.println(true);
        else
            System.out.println(false);

        if (A.equals(B))
            System.out.println(true);
        else
            System.out.println(false);
    }

}
