package com.letscode.questao7;

import java.util.Arrays;
import java.util.Scanner;

public class NameAge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Person[] peopleNameAndAge = new Person[5];

        System.out.println("Enter only the firstname and the age of 5 people.");

        System.out.print("First: ");
        peopleNameAndAge[0] = new Person(scan.next(), scan.nextInt());

        System.out.print("Second: ");
        peopleNameAndAge[1] = new Person(scan.next(), scan.nextInt());

        System.out.print("Third: ");
        peopleNameAndAge[2] = new Person(scan.next(), scan.nextInt());

        System.out.print("Fourth: ");
        peopleNameAndAge[3] = new Person(scan.next(), scan.nextInt());

        System.out.print("Fifth: ");
        peopleNameAndAge[4] = new Person(scan.next(), scan.nextInt());

        Person temp;
        for(int i = 0; i < peopleNameAndAge.length; i++){
            for(int j = i; j > 0; j--){
                if(peopleNameAndAge[j].age < peopleNameAndAge[j-1].age){
                    temp = peopleNameAndAge[j];
                    peopleNameAndAge[j] = peopleNameAndAge[j-1];
                    peopleNameAndAge[j-1]=temp;
                }
            }
        }

        double averageAge = Arrays.stream(peopleNameAndAge).mapToInt(Person::getAge).average().orElse(0);

        System.out.println("The youngest person is " +
                peopleNameAndAge[0].name +
                " at the age of " +
                peopleNameAndAge[0].age);

        System.out.println("The oldest person is " +
                peopleNameAndAge[4].name +
                " at the age of " +
                peopleNameAndAge[4].age);

        System.out.println("The average age is " + averageAge);
    }
}