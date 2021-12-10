package com.letscode.questao8;

public class Person {

    public String name;
    public float weight;
    public int height;
    public float BMI;

    Person(String name, float weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.BMI = (weight/((height*height)/10000));
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public float getBMI() {
        return BMI;
    }
}
