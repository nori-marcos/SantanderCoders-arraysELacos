package com.letscode.questao4;

import java.util.Scanner;

public class GreatestSmallestAverage {
    public static void main(String[] args) {
        Scanner scanNumbers = new Scanner(System.in);

        System.out.println("Add 5 numbers and the program will print the largest and the smallest numbers, and the average between both.");

        int [] numbers = new int[5];
        numbers[0] = scanNumbers.nextInt();
        numbers[1] = scanNumbers.nextInt();
        numbers[2] = scanNumbers.nextInt();
        numbers[3] = scanNumbers.nextInt();
        numbers[4] = scanNumbers.nextInt();

        int temp;

        for (int i = 0; i < 5; i++){
            for (int j = i; j > 0; j--){
                if (numbers[j] < numbers[j-1]){
                    temp = numbers[i];
                    numbers[j] = numbers[j-1];
                    numbers[j-1] = temp;
                }
            }
        }

        System.out.println("The array of numbers contains " +
                numbers[0] + ", " +
                numbers[1] + ", " +
                numbers[2] + ", " +
                numbers[3] + " and " +
                numbers[4] + ".");

        System.out.println("The largest number is " + numbers[4] + ".");
        System.out.println("The smallest number is " + numbers[0] + ".");
        System.out.println("The average between both is " + ((numbers[4] + numbers[0])/2) + ".");
    }
}
