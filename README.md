# List Most Used Words In Paragraph
A program that will:
- break a paragraph of text into an array of Strings
- iterate through the array and put each word into a HashMap
   - if word is not already in HashMap, insert it as a key with a value of 1 using PUT
   - if word does exist, add 1 to the value of that key (by using PUT again to overwrite the existing item)
- order HashMap on values
  - was originally going to try and sort the HashMap by value, but the syntax is way beyond my current understanding, so I will use the brute force method instead where I will iterate through the HashMap and find the (first) highest value, then put that into a new HashMap and delete it from the original hashmap.
  - Condiute doing this until I have a minimum of 5 items, but chceck to make sure I pick up all the items at the lowest value of these (max) 5 items. 
- display words with the top five occurances (there could be more than five words due to ties)

###  Tech Stack
- Java 11
- NetBeans 12.5
