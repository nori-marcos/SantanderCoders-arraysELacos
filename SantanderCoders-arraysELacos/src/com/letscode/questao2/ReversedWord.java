package com.letscode.questao2;

import java.util.Locale;
import java.util.Scanner;

public class ReversedWord {
    public static void main(String[] args) {
        Scanner scanWord = new Scanner(System.in);

        System.out.println("Enter a word to be reversed:");
        String word = scanWord.next().toUpperCase();

        char[] arrayOfChars = word.toCharArray();
        char[] arrayOfReversedChars = new char[arrayOfChars.length];
//
        for (int i = arrayOfChars.length-1, j = 0; i >= 0 && j < arrayOfChars.length; i--, j++){
            arrayOfReversedChars[j] = arrayOfChars[i];
        }

        String reversedWord = String.valueOf(arrayOfReversedChars);
        System.out.printf("The word %s written backward is %s.", word, reversedWord);
    }
}
