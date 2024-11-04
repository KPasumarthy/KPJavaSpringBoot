package com.kpjavaspringboot.interview;


public class KPRemoveDuplicates {
    public static void main(String[] args) {

        // KP : Debug Print
        System.out.println("KP : KPMain - com.kpjavaspringboot : KPRemoveDuplicates : main()");

        //String input = new String("hi across beeeater Bookkeeper");
        String[] input = {"hi", "across", "beeeater", "Bookkeeper"};

        for (String tmpWord : input){

            System.out.println("KP : KPMain - com.kpjavaspringboot : KPRemoveDuplicates : tmpWord : " + tmpWord);
            String strArray[] = tmpWord.split("");
            String prevChar = "";
            String newWord = "";
            for (String tmpChar: strArray){

                //System.out.println("KP : KPMain - com.kpjavaspringboot : KPRemoveDuplicates : tmpChar : " + tmpChar);
               if(  !tmpChar.equals(prevChar) ) {
                    System.out.println("KP : KPMain - com.kpjavaspringboot : KPRemoveDuplicates : tmpChar : " + tmpChar);
                   newWord = newWord + tmpChar;
                }
                prevChar = tmpChar;

            }

            System.out.println("KP : KPMain - com.kpjavaspringboot : KPRemoveDuplicates : newWord : " + newWord);
        }

        //        Interview Question : Remove Duplicate Characters
        //        Duplicate Characters
        //        You are given an array of strings. Your task is to remove all the consecutive duplicate letters from each string in the array.
        //        Implement the function solve) that takes in an array of strings and returns the new strings in the order in which their original forms appear in the input array. You can assume that an element in the input array will have at least one character. Input
        //        The first line of the input contains an integer N, representing the number of strings in the array.
        //                The second line of input contains N space-separated strings, representing the array elements.
        //                Output
        //        The output contains a space-separated array of modified strings in their order of appearance in the original array.
        //                Constraints
        //        1 <= N <= 50
        //        Example #1 Input
        //        4
        //        hi across beeeater Bookkeeper
        //        Output
        //        hi acros beater Bokeper
        //        Explanation: repeated "s" in "across," "e" in "beeeater" and "o," "k," "e," in "Bookkeeper" are removed. The modified string will then be: 'hi acros beater Bokeper'
        //        Example #2
        //        Input
        //        2
        //        unsuccessfully bypass
        //        Output
        //        unsucesfuly bypas
        //        Explanation: After removing the consecutive repeated characters the modified string will be "unsucesfuly bypas


    }


}
