package com.letscode.questao6;

import java.util.Locale;
import java.util.Scanner;

public class OddLettersUppercase {
    public static void main(String[] args) {
        Scanner scanWord = new Scanner(System.in);

        System.out.println("Enter a word and all the odd letters will be in uppercase:");
        String word = scanWord.next().toLowerCase();

        char [] letters = word.toCharArray();

        for (int i = 0; i < letters.length; i++){
            if (i % 2 == 0){
                letters[i] = Character.toUpperCase(letters[i]);
            }
        }

        String amendedWord = String.valueOf(letters);

        System.out.println(amendedWord);
    }
}
