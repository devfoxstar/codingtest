package com.devfoxstar.test;

import java.util.Arrays;

public class ArrayStack {
    private int top;
    private int size;
    private String[] stack;

    public ArrayStack(int size) {
        this.top = -1;
        this.size = size;
        this.stack = new String[size];
    }

    public void push(String item) {
        if (top == size - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = item;
        }
    }

    public void pop() {
        if (!empty()){
            stack[top--] = "";
        }
    }

    public String peek() {
        if (empty()) {
            return "";
        } else {
            return stack[top];
        }
    }

    public String search(int index) {
        if (empty()) {
            return "";
        } else {
            return stack[index];
        }
    }

    public boolean empty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        int size = 5;
        ArrayStack arrayStack = new ArrayStack(size);

        //push
        arrayStack.push("A");
        arrayStack.push("B");
        arrayStack.push("C");
        arrayStack.push("D");
        arrayStack.push("E");
        System.out.println(Arrays.toString(arrayStack.stack));  //[A, B, C, D, E]

        //peek
        System.out.println(arrayStack.peek());  //E

        //pop
        arrayStack.pop();
        System.out.println(arrayStack.peek());  //D

        //search
        System.out.println(arrayStack.search(1));   //B

        //empty
        System.out.println(arrayStack.empty());  //false
    }
}