/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cocktailblenderapp;

/**
 *
 * @author ashra
 */
public class BlenderOverFlowException extends Exception {
    @Override
    public String getMessage() {
        return "Blender overflow!";
    }
}

