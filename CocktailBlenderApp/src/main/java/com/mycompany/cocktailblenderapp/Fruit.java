package com.mycompany.cocktailblenderapp;

public class Fruit extends Ingredient {
    private int volume;
    private Color color;

    public Fruit(String name, int calories, int volume, Color color) {
        super(name, calories);
        this.volume = volume;
        this.color = color;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String getInfo() {
        return "Fruit: " + name + ", Calories: " + calories + ", Volume: " + volume + ", Color: " + color.getInfo();
    }
}
