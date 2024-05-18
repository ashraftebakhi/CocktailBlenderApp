/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktailblenderapp;

/**
 *
 * @author ashra
 */
public class Cup {
    private int capacity;
    private int calories;

    public Cup(int capacity) {
        this.capacity = capacity;
        this.calories = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getInfo() {
        return "Cup: Capacity: " + capacity + ", Calories: " + calories;
    }
}
