package com.example;

import processing.core.PApplet;

public class FourBallsGenerator extends PApplet {

    public static final int WINDOW_WIDTH = 1080;
    public static final int WINDOW_HEIGHT = 720;
    public static final int BALL_DIAMETER = 10;
    public static final int TOTAL_NO_OF_BALLS = 4;
    int absolutePositionX = 0;

    public static void main(String[] args) {
        PApplet.main(FourBallsGenerator.class, args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        for (int ballNo = 1; ballNo <= TOTAL_NO_OF_BALLS; ballNo++) {
            int relativePositionX = absolutePositionX * ballNo;
            int relativePositionY = (WINDOW_HEIGHT * ballNo) / (TOTAL_NO_OF_BALLS + 1);
            drawBall(relativePositionX, relativePositionY, BALL_DIAMETER);
        }
        absolutePositionX++;
    }

    private void drawBall(int positionX, int positionY, int diameter) {
        ellipse(positionX, positionY, diameter, diameter);
    }
}
