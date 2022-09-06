package com.devfoxstar.codingtest;

public class NPE {

    public static void main(String[] args) {
        String A = null;

        try {
            if (A.equals("A")) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (A != null && A.equals("A")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if ("A".equals(A)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
