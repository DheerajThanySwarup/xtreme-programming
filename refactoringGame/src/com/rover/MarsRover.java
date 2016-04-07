package com.rover;

import javafx.geometry.Point2D;

import java.util.List;

public class MarsRover {

    public Direction direction;
    public Point2D position;

    public MarsRover(int startingX, int startingY, String direction) {
        this.position = new Point2D(startingX,startingY);
        this.direction = Direction.valueOf(direction);
    }

    public String run(String input) {
        CommandParser parser = new CommandParser();
        List<Command> commands = parser.parseCommand(input);
        for(Command command : commands) {
            command.execute(this);
        }
        return toString();
    }

    public String toString() {
        return (int)position.getX() + " " + (int)position.getY() + " " + direction;
    }
}
