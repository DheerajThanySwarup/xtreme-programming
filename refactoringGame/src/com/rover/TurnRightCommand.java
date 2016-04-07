package com.rover;

/**
 * Created by prateeks on 11/4/15.
 */
public class TurnRightCommand implements Command {
    @Override
    public void execute(MarsRover rover) {
        rover.direction = rover.direction.right;
    }
}
