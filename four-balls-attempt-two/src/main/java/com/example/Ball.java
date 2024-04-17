package com.example;

import processing.core.PApplet;

public class Ball {
    private int positionX, positionY, diameter, speed;
    public Ball(int positionX, int positionY, int diameter, int speed) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.diameter = diameter;
        this.speed = speed;
    }

    public void drawOnCanvas(PApplet context) {
        context.ellipse(positionX, positionY, diameter, diameter);
        positionX += speed;
    }
}
