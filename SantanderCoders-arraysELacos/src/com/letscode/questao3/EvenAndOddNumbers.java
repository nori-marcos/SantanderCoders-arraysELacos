package com.letscode.questao3;

import java.util.Scanner;

public class EvenAndOddNumbers {
    public static void main(String[] args) {

        Scanner scanNumbers = new Scanner(System.in);

        System.out.println("Add 5 numbers and the program will arrange in such a way that the odd numbers will be printed before the even numbers:");

        int [] numbers = new int[5];
        numbers[0] = scanNumbers.nextInt();
        numbers[1] = scanNumbers.nextInt();
        numbers[2] = scanNumbers.nextInt();
        numbers[3] = scanNumbers.nextInt();
        numbers[4] = scanNumbers.nextInt();

        int temp;

        for (int i = 0; i < 5; i++){
           for (int j = i; j > 0; j--){
               if (numbers[j] % 2 == 1 && numbers[j-1] % 2 == 0){
                   temp = numbers[i];
                   numbers[j] = numbers[j-1];
                   numbers[j-1] = temp;
               }
           }
        }
        for (int i = 0; i < 5; i++){
            System.out.println(numbers[i]);
        }
    }
}