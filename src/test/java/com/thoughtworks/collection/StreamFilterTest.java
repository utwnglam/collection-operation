package com.thoughtworks.collection;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class StreamFilterTest {

    @Test
    public void should_return_even() {
        //get all the even number from the list
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> expectedNumbers = Arrays.asList(2, 4);

        List<Integer> actualNumbers = new StreamFilter().filterEven(numbers);

        assertEquals(expectedNumbers, actualNumbers);
    }

    @Test
    public void should_return_words_end_with_s() {
        //get the word which is end with s, like clothes, foods
        List<String> words = Arrays.asList("water", "gas", "colors", "size", "artist");
        List<String> expectedWords = Arrays.asList("gas", "colors");

        List<String> actualWords = new StreamFilter().filterEndWithS(words);

        assertEquals(expectedWords, actualWords);
    }

    @Test
    public void should_return_common_elements() {
        /*
            return the duplicate numbers in two lists
            list1 [1,2,5]
            list2 [1,2,6,8]
            the duplicate numbers are [1,2]
         */
        List<Integer> firstNumbers = Arrays.asList(6, 2, 3, 4, 9);
        List<Integer> secondNumbers = Arrays.asList(2, 3, 5, 9, 6);
        List<Integer> expectedNumbers = Arrays.asList(6, 2, 3, 9);

        List<Integer> actualNumbers = new StreamFilter().getCommonElements(firstNumbers, secondNumbers);

        assertEquals(expectedNumbers, actualNumbers);
    }

}
