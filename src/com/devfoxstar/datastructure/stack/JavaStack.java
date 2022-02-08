package com.devfoxstar.datastructure.stack;

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();;

        //push
        for (int i=0; i<5; i++) {
            stack.push(i);
        }
        System.out.println(stack);  //[0, 1, 2, 3, 4]

        //peek
        System.out.println(stack.peek());   //4

        //pop
        stack.pop();
        System.out.println(stack.peek());   //3

        //search
        System.out.println(stack.search(3));    //1

        //empty
        System.out.println(stack.empty());  //false
    }
}
