package com.example;

import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class FourBallsGenerator extends PApplet {
    private static final int WINDOW_WIDTH = 1080;
    private static final int WINDOW_HEIGHT = 720;
    public static final int BALL_DIAMETER = 10;
    public static final int TOTAL_NO_OF_BALLS = 4;
    public List<Ball> balls;

    public static void main(String[] args) {
        PApplet.main(FourBallsGenerator.class, args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WINDOW_WIDTH, WINDOW_HEIGHT);
    }

    @Override
    public void setup() {
        initialiseBalls();
    }

    private void initialiseBalls() {
        balls = new ArrayList<>();
        for(int ballNo = 1; ballNo<= TOTAL_NO_OF_BALLS; ballNo++) {
            int positionY = (WINDOW_HEIGHT * ballNo) / (TOTAL_NO_OF_BALLS+1);
            Ball newBall = new Ball(0, positionY, BALL_DIAMETER, ballNo);
            balls.add(newBall);
        }
    }

    @Override
    public void draw() {
        for(Ball ball: balls) {
            ball.drawOnCanvas(this);
        }
    }
}
