package com.devfoxstar.codingtest;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class Time {

    public static void main(String[] args) {
        NanoTime();
        CurrentTime();
        InstantNow();
    }

    public static void NanoTime() {
        long startTime = System.nanoTime();

        long count = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                count++;
            }
        }

        long endTime = System.nanoTime();
        long elapsedTime  = endTime - startTime;

        System.out.println("NanoTime : " + count + "회");
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(elapsedTime);
        System.out.println(TimeUnit.NANOSECONDS.toSeconds(elapsedTime));
        System.out.println(((double)elapsedTime ) / 1_000_000_000);
        System.out.println(elapsedTime * 1e-9);
    }

    public static void CurrentTime() {
        long startTime = System.currentTimeMillis();

        long count = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                count++;
            }
        }

        long endTime = System.currentTimeMillis();
        long elapsedTime  = endTime - startTime;

        System.out.println("CurrentTime : " + count + "회");
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(elapsedTime);
        System.out.println((double)elapsedTime / 1000);
    }

    public static void InstantNow() {
        Instant startTime = Instant.now();

        long count = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                count++;
            }
        }

        Instant endTime = Instant.now();
        long elapsedTime  = Duration.between(startTime, endTime).toMillis();

        System.out.println("InstantNow : " + count + "회");
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(elapsedTime);
        System.out.println((double)elapsedTime / 1000);
    }

}
