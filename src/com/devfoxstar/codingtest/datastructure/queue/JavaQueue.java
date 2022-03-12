package com.devfoxstar.codingtest.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        //enqueue
        queue.offer("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println(queue.peek());       //A

        //dequeue
        queue.poll();
        System.out.println(queue.peek());       //B

        //remove
        queue.remove("D");
        System.out.println(queue);              //[B, C, E]

        //element
        System.out.println(queue.element());    //B
    }
}
