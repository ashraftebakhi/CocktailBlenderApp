package com.mycompany.cocktailblenderapp;

import java.util.ArrayList;

public class Blender {
    private ArrayList<Ingredient> ingredients;
    private int capacity;
    private int calories;
    private Color color;
    private int volume;
    private Logger logger;

    public Blender(int capacity, Logger logger) {
        this.ingredients = new ArrayList<>();
        this.capacity = capacity;
        this.calories = 0;
        this.color = new Color(0, 0, 0);
        this.volume = 0;
        this.logger = logger;
    }

    public void add(Ingredient ingredient) throws BlenderOverFlowException {
        int ingredientVolume = 0;

        if (ingredient instanceof Milk) {
            ingredientVolume = ((Milk) ingredient).getVolume();
        } else if (ingredient instanceof Fruit) {
            ingredientVolume = ((Fruit) ingredient).getVolume();
        } else if (ingredient instanceof Sugar) {
            ingredientVolume = 0; // Assuming sugar has no volume
        }

        if (this.volume + ingredientVolume > this.capacity) {
            throw new BlenderOverFlowException();
        }
        
        this.ingredients.add(ingredient);
        this.volume += ingredientVolume;
        this.calories += ingredient.getCalories();

        if (ingredient instanceof Milk) {
            updateColor(((Milk) ingredient).getColor());
        } else if (ingredient instanceof Fruit) {
            updateColor(((Fruit) ingredient).getColor());
        } else if (ingredient instanceof Sugar) {
            updateColor(((Sugar) ingredient).getColor());
        }
    }

    public void blend() {
        this.logger.log("Blending ingredients...");
        // Blend logic
    }

    public void pour(Cup cup) throws BlenderEmptyException {
        if (this.volume == 0) {
            throw new BlenderEmptyException();
        }
        // Pour logic
    }

    private void updateColor(Color newColor) {
        // Update color logic based on newColor
    }

    public String getInfo() {
        return "Blender: Capacity: " + capacity + ", Calories: " + calories + ", Volume: " + volume + ", Color: " + color.getInfo();
    }
}
