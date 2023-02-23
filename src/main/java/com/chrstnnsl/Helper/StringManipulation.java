package com.chrstnnsl.Helper;

public class StringManipulation {

    public String remove(String phrase, String[] words) {
        String result = phrase;
        for (String word: words) {
            result = result.replace(word, "").replace("  ", " ");
        }
        return result.trim();
    }
    
}
