package com.rover;

/**
 * Created by prateeks on 11/4/15.
 */
public class TurnLeftCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        rover.direction = rover.direction.left;
    }
}
