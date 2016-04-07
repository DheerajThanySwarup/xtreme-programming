package com.rover;

public enum Direction {
    N("E","W"),
    S("W","E"),
    E("S","W"),
    W("N","S");

    Direction right;
    Direction left;

    Direction(String right, String left) {
        this.right = Direction.valueOf(right);
        this.left = Direction.valueOf(left);
    }
}
