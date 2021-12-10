package com.letscode.questao8;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's calculate de body mass index (BMI) of five people. So enter the firstname, weight(kg) and height(cm).");

        Person[] peopleToCalculateBMI = new Person[5];

        System.out.print("First: ");
        peopleToCalculateBMI[0] = new Person(scan.next(),scan.nextFloat(), scan.nextInt());

        System.out.print("Second: ");
        peopleToCalculateBMI[1] = new Person(scan.next(),scan.nextFloat(), scan.nextInt());

        System.out.print("Third: ");
        peopleToCalculateBMI[2] = new Person(scan.next(),scan.nextFloat(), scan.nextInt());

        System.out.print("Fourth: ");
        peopleToCalculateBMI[3] = new Person(scan.next(),scan.nextFloat(), scan.nextInt());

        System.out.print("Fifth: ");
        peopleToCalculateBMI[4] = new Person(scan.next(),scan.nextFloat(), scan.nextInt());

        System.out.println();

        for (Person person : peopleToCalculateBMI) {
            System.out.println("Name: " + person.name);
            System.out.println("Weight: " + person.weight);
            System.out.println("Height: " + person.height);
            System.out.printf("BMI: %.2f %n", person.BMI);
            if(person.BMI < 18.5){
                System.out.println("Underweight");
            } else if (person.BMI > 25) {
                System.out.println("Overweight");
            } else {
                System.out.println("Normal weight");
            }
            System.out.println();
        }
    }
}
