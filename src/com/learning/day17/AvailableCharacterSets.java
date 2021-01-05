package com.learning.day17;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.SortedMap;

public class AvailableCharacterSets {
    public static void main(String[] args) {
        // System.out.println(Charset.availableCharsets());
        for (String charset : Charset.availableCharsets().keySet()) {
            System.out.println(charset);
        }
    }
}
