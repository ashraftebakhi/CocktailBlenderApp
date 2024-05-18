package com.mycompany.cocktailblenderapp;

public abstract class Ingredient {
    protected String name;
    protected int calories;

    public Ingredient(String name, int calories) {
        this.name = name;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public abstract String getInfo();
}
