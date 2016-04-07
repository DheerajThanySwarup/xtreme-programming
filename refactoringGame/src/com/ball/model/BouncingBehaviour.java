package com.ball.model;

import com.ball.ui.BallWorld;

public class BouncingBehaviour implements Behavior {
    public static final int MOVEMENT_SPEED = 12;

    static final int DOWN = 1;
    static final int UP = -1;

    private int direction;

    BouncingBehaviour(int direction) {

        this.direction = direction;
    }

    @Override
    public void update(Ball ball) {
        direction = reverseDirectionIfNecessary(ball);
        ball.setY(move(ball));
    }

    /***********************************************************************************
     *
     * Do not change Bouncing ALGORITHM below.
     *
     ***********************************************************************************/

    private int reverseDirectionIfNecessary(Ball ball) {
        if (movingTooHigh(ball) || movingTooLow(ball)) {
            return switchDirection();
        }

        return this.direction;
    }

    private boolean movingTooLow(Ball ball) {
        return ball.getY() + ball.radius() >= BallWorld.BOX_HEIGHT && movingDown();
    }

    private boolean movingTooHigh(Ball ball) {
        return ball.getY() - ball.radius() <= 0 && movingUp();
    }

    private int switchDirection() {
        return movingDown() ? UP : DOWN;
    }

    private int move(Ball ball) {
        return ball.getY() + (MOVEMENT_SPEED * direction);
    }

    private boolean movingDown() {
        return direction == DOWN;
    }

    private boolean movingUp() {
        return direction == UP;
    }
}
