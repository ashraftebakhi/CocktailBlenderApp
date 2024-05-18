/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktailblenderapp;

/**
 *
 * @author ashra
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = new MyLogger();
        Blender blender = new Blender(1000, logger);

        while (true) {
            System.out.println("1. Add Ingredient");
            System.out.println("2. Blend");
            System.out.println("3. Pour into Cup");
            System.out.println("4. Get Blender Info");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    addIngredient(blender, scanner);
                    break;
                case 2:
                    blend(blender);
                    break;
                case 3:
                    pourIntoCup(blender, scanner);
                    break;
                case 4:
                    System.out.println(blender.getInfo());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addIngredient(Blender blender, Scanner scanner) {
        System.out.println("Select Ingredient Type:");
        System.out.println("1. Milk");
        System.out.println("2. Fruit");
        System.out.println("3. Sugar");

        int type = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Calories: ");
        int calories = scanner.nextInt();

        try {
            switch (type) {
                case 1:
                    System.out.print("Enter Volume: ");
                    int milkVolume = scanner.nextInt();
                    System.out.print("Enter Color (R G B): ");
                    int milkR = scanner.nextInt();
                    int milkG = scanner.nextInt();
                    int milkB = scanner.nextInt();
                    blender.add(new Milk(name, calories, milkVolume, new Color(milkR, milkG, milkB)));
                    break;
                case 2:
                    System.out.print("Enter Volume: ");
                    int fruitVolume = scanner.nextInt();
                    System.out.print("Enter Color (R G B): ");
                    int fruitR = scanner.nextInt();
                    int fruitG = scanner.nextInt();
                    int fruitB = scanner.nextInt();
                    blender.add(new Fruit(name, calories, fruitVolume, new Color(fruitR, fruitG, fruitB)));
                    break;
                case 3:
                    System.out.print("Enter Color (R G B): ");
                    int sugarR = scanner.nextInt();
                    int sugarG = scanner.nextInt();
                    int sugarB = scanner.nextInt();
                    blender.add(new Sugar(name, calories, new Color(sugarR, sugarG, sugarB)));
                    break;
                default:
                    System.out.println("Invalid ingredient type.");
                    return;
            }
            System.out.println("Ingredient added successfully.");
        } catch (BlenderOverFlowException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void blend(Blender blender) {
        blender.blend();
        System.out.println("Blending done.");
    }

    private static void pourIntoCup(Blender blender, Scanner scanner) {
        System.out.print("Enter Cup Capacity: ");
        int capacity = scanner.nextInt();
        Cup cup = new Cup(capacity);

        try {
            blender.pour(cup);
            System.out.println("Poured into cup. " + cup.getInfo());
        } catch (BlenderEmptyException e) {
            System.out.println(e.getMessage());
        }
    }
}
