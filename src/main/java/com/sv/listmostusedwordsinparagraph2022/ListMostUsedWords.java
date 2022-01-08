/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.listmostusedwordsinparagraph2022;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author: Steven Vallarsa
 *   email: stevenvallarsa@gmail.com
 *    date: 2022-01-08
 * purpose: A program that will list the 5 most used words in a paragraph of text
 */
public class ListMostUsedWords {
    public static void main(String[] args) {
        
        String paragraph = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of light, it was the season of darkness, it was the spring of hope, it was the winter of despair.";
        
        Map<String, Integer> wordCountHashMap = new HashMap<>();
        
        
        /**
         * Split paragraph into array of words with RegEx
         */
        String[] wordsArray = paragraph.split("\\W+");
        
        
        /**
         * Iterate through array and add new words to HashMap, 
         * and update count on existing words
         */
        for (String word : wordsArray) {
            word = word.toLowerCase();
            if (wordCountHashMap.get(word) == null) {
                wordCountHashMap.put(word, 1);
            } else {
                int count = wordCountHashMap.get(word) + 1;
                wordCountHashMap.put(word, count);
            }
        }
        // print unsorted HashMap
        System.out.println("\nUnsorted HashMap");
        Set<String> keys = wordCountHashMap.keySet();

        for(String key : keys) {
            System.out.println(key + ": " + wordCountHashMap.get(key));
        }
        
        /**
         * Sort HashMap by value
         * - create list of entries
         * - sort the list
         * - put data from sorted list into new HashMap
         */
        
        // display top five words
        
//        System.out.println(Arrays.toString(wordsArray));
        

        
    }
}
