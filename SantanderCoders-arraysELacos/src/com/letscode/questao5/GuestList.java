package com.letscode.questao5;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner scanName =  new Scanner(System.in);

        String[] namesInGuestList = new String[5];

        System.out.println("Let's create a guest list with five names.");

        System.out.print("So enter the first guest:");
        namesInGuestList[0] = scanName.nextLine();

        System.out.print("Second guest:");
        namesInGuestList[1] = scanName.nextLine();

        System.out.print("Third guest:");
        namesInGuestList[2] = scanName.nextLine();

        System.out.print("Fourth guest:");
        namesInGuestList[3] = scanName.nextLine();

        System.out.print("Fifth guest:");
        namesInGuestList[4] = scanName.nextLine();

        System.out.println("Your guest list contains: ");
        for (int i = 0; i < 5; i++){
            System.out.println("-" + namesInGuestList[i]);
        }

        String largestName = "";

        for (int i = 0; i < 5; i++){
            if (namesInGuestList[i].length() > largestName.length()){
                largestName = namesInGuestList[i];
            }
        }

        System.out.println("The largest name is '" + largestName + "'.");
    }
}
