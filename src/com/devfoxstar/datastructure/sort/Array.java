package com.devfoxstar.datastructure.sort;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

public class Array {

    @Test
    public void sortIntArray() {
        final int[] numbers = {-4, 3, -1, 5, 0, 1};
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    @Test
    public void sortIntArrayEqual() {
        final int[] numbers = {-2, -1, 0, 1, 5, -3};
        final int[] expected = {-3, -2, -1, 0, 1, 5};

        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void sortObjectArrayEqual() {
        final String[] strings = {"b", "d", "a", "c", "e"};
        final String[] expected = {"a", "b", "c", "d", "e"};

        Arrays.sort(strings);
        assertArrayEquals(expected, strings);
    }

}
