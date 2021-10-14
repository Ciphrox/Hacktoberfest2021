/*
Author: Yazeed Hasan
Date last modified: 9/23/2021
Purpose: To replace letters in a sentence
Status: Complete/No errors
 */
public class ReplaceTester {
    public static void main(String[] args) {
        String sentence = "Mississippi is not only a river, but a state ";
        String sentence2;
        sentence2 = sentence.replace("a", "@");
        sentence2 = sentence2.replace("i","!");
        sentence2 = sentence2.replace("s","$");
        System.out.println("Original Sentence: " + sentence);
        System.out.println("Modified Sentence: " + sentence2);


    }
}
