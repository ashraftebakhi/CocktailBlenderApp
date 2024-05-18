package com.mycompany.cocktailblenderapp;

public class Sugar extends Ingredient {
    private Color color;

    public Sugar(String name, int calories, Color color) {
        super(name, calories);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Sugar: " + name + ", Calories: " + calories + ", Color: " + color.getInfo();
    }
}
