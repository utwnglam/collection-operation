package com.thoughtworks.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamReduceTest {


    @Test
    public void should_return_last_odd_element() {
        //get the last odd number from the list
        List<Integer> numbers = Arrays.asList(1, 11, 27, 20, 4, 9, 15);
        int expectedLastOdd = 15;

        int actualLastOdd = new StreamReduce().getLastOdd(numbers);

        assertEquals(expectedLastOdd, actualLastOdd);
    }

    @Test
    public void should_return_longest_word() {
        //get the longest word from the list
        List<String> words = Arrays.asList("Beijing", "Wuhan", "Manila");
        String expectedLongestWord = "Beijing";

        String actualLongestWord = new StreamReduce().getLongest(words);

        assertEquals(expectedLongestWord, actualLongestWord);
    }

    @Test
    public void should_return_total_length() {
        //get the longest word from the list
        List<String> words = Arrays.asList("morning", "afternoon", "evening");
        int expectedTotalLength = 23;

        int actualTotalLength = new StreamReduce().getTotalLength(words);

        assertEquals(expectedTotalLength, actualTotalLength);
    }
}
