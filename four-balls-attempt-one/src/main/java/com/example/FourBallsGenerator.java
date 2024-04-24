package com.example;

import processing.core.PApplet;

public class FourBallsGenerator extends PApplet {

    private static final int WINDOW_WIDTH = 1080;
    private static final int WINDOW_HEIGHT = 720;
    private static final int BALL_DIAMETER = 10;
    private static final int TOTAL_NO_OF_BALLS = 4;
    int absolutePositionX = 0;

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void draw() {
        drawAllTheBalls();
        absolutePositionX++;
    }

    private void drawAllTheBalls() {
        for (int ballNo = 1; ballNo <= TOTAL_NO_OF_BALLS; ballNo++) {
            int relativePositionX = absolutePositionX * ballNo;
            int relativePositionY = (WINDOW_HEIGHT * ballNo) / (TOTAL_NO_OF_BALLS + 1);
            drawBall(relativePositionX, relativePositionY, BALL_DIAMETER);
        }
    }

    private void drawBall(int positionX, int positionY, int diameter) {
        ellipse(positionX, positionY, diameter, diameter);
    }

    public static void main(String[] args) {
        PApplet.main(FourBallsGenerator.class, args);
    }
}
