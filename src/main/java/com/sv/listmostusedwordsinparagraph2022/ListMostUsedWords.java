/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sv.listmostusedwordsinparagraph2022;

import java.util.HashMap;
import java.util.LinkedHashMap;
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
        
//        String paragraph = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of light, it was the season of darkness, it was the spring of hope, it was the winter of despair.";

        String paragraph = "In the late summer of that year we lived in a house in a village that looked across the river and the plain to the mountains. In the bed of the river there were pebbles and boulders, dry and white in the sun, and the water was clear and swiftly moving and blue in the channels. Troops went by the house and down the road and the dust they raised powdered the leaves of the trees. The trunks of the trees too were dusty and the leaves fell early that year and we saw the troops marching along the road and the dust rising and leaves, stirred by the breeze, falling and the soldiers marching and afterward the road bare and white except for the leaves.";
        
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
//        System.out.println("\nUnsorted HashMap");
//        Set<String> keys = wordCountHashMap.keySet();
//
//        for(String key : keys) {
//            System.out.println(key + ": " + wordCountHashMap.get(key));
//        }
        
        /**
         * Sort HashMap by value
         * - create list of entries
         * - sort the list
         * - put data from sorted list into new LinkedHashMap (to preserve order)
         */
        Map<String, Integer> topWordsByCount = new LinkedHashMap<>();
        
        boolean isStillIterating = true;
        int lastTopWordCount = 0;
        
        while (isStillIterating) {
            String topWord = "";
            int topWordCount = 0;

            for (String key : wordCountHashMap.keySet()) {
                if (wordCountHashMap.get(key) > topWordCount) {
                    topWordCount = wordCountHashMap.get(key);
                    topWord = key;
                }
            }
            
            // keep adding words that have the same wordcount as the one in the #5 position
            if (topWordsByCount.size() < 5 || topWordCount == lastTopWordCount) {
                topWordsByCount.put(topWord, topWordCount);
                wordCountHashMap.remove(topWord);
                lastTopWordCount = topWordCount;
            } else {
                isStillIterating = false;
            }
        }
        
        // Print top words by count
        System.out.println("\nTop " + topWordsByCount.size() + " Words by Count");
        for(String key : topWordsByCount.keySet()) {
            System.out.println(key + ": " + topWordsByCount.get(key));
        }
//        System.out.println(Arrays.toString(wordsArray));
    }
}
