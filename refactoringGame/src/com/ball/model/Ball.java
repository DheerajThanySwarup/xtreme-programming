package com.ball.model;

import java.awt.*;
import java.util.List;

public class Ball {
    public static final int DEFAULT_RADIUS = 50;
    protected int x;
    protected int y;
    protected int radius;

    private java.util.List<Behavior> behaviors;

    protected Ball(int x, int y, int radius, List<Behavior> behaviors) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.behaviors = behaviors;
    }

    protected Ball(int x, int y, List<Behavior> behaviors) {
        this(x, y, DEFAULT_RADIUS, behaviors);
    }

    // DO NOT CHANGE
    public int radius() {
        return radius;
    }

    // DO NOT CHANGE
    public Point center() {
        return new Point(x, y);
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // DO NOT CHANGE
    public void update(){
        for(Behavior behavior : this.behaviors) {
            behavior.update(this);
        }
    }
}
