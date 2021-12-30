package com.devfoxstar.sort;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class Base {

    @Test
    public void sortTest1() {
        final int[] numbers = {-4, 3, -1, 5, 0, 1};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void sortTest2() {
        final int[] numbers = {-2, -1, 0, 1, 5, -3};
        final int[] expected = {-3, -2, -1, 0, 1, 5};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

}
