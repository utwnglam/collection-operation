package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {

    private static final List<String> ALPHABET = Arrays.asList(
            "a", "b", "c", "d", "e", "f", "g",
            "h", "i", "j", "k", "l", "m", "n",
            "o", "p", "q", "r", "s", "t", "u",
            "v", "w", "x", "y", "z");

    public List<Integer> getTriple(List<Integer> numbers) {
        return numbers.stream().map(num -> num * 3).collect(Collectors.toList());
    }

    public List<String> mapLetter(List<Integer> numbers) {
        return numbers.stream().map(num -> Character.toString(num+64+32)).collect(Collectors.toList());
    }

    public List<Integer> mapLength(List<String> words) {
        return words.stream().map(String::length).collect(Collectors.toList());
    }
}
