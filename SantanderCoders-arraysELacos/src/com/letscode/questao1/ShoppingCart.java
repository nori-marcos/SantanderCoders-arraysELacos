package com.letscode.questao1;

import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner scanFruits = new Scanner(System.in);
        System.out.println("Enter the name of 5 fruits separated by space: ");

        String[] arrayOfFruits;
        arrayOfFruits = new String[5];
        arrayOfFruits[0] = scanFruits.next();
        arrayOfFruits[1] = scanFruits.next();
        arrayOfFruits[2] = scanFruits.next();
        arrayOfFruits[4] = scanFruits.next();

        if(arrayOfFruits.length == 5){
            System.out.println("This is your shopping list: ");
            for(String fruit: arrayOfFruits){
                System.out.println(fruit);
            }
        }
    }
}
