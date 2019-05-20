package com.example.humanoop;


import android.util.Log;

public class Human {
    private String name;
    private int age;
    public int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void  eat(){
        Log.d("Human","I am eating food");
    }
    public void sleep(){
        Log.d("Human","sleeeeep");

    }
    public int sleep(int hours) {
        Log.d("Human","I am sleeping for x hours");
        return hours;

    }
    public void speak (String speak){
        Log.d("Human","Today is Sunday");

    }
    public int birthday (int increment){
        age=age+increment;
        return age;
    }

    public int addweight (int increment){
        weight =weight + increment;
        return weight;
    }
}



