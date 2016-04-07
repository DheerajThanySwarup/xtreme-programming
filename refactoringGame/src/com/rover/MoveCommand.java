package com.rover;

import javafx.geometry.Point2D;

public class MoveCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        if (rover.direction.equals("N")) {
            rover.position = new Point2D(rover.position.getX(),rover.position.getY()+1);
        } else if (rover.direction.equals("S")) {
            rover.position = new Point2D(rover.position.getX(),rover.position.getY()-1);
        } else if (rover.direction.equals("E")) {
            rover.position = new Point2D(rover.position.getX()+1,rover.position.getY());
        } else if (rover.direction.equals("W")) {
            rover.position = new Point2D(rover.position.getX()-1,rover.position.getY());
        }
    }
}
