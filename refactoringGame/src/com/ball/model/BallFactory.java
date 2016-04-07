package com.ball.model;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {

    public static Ball[] all() {
        return new Ball[]{
                bouncingBall(75, 50, BouncingBehaviour.DOWN),
                elasticBall(250, 100, Ball.DEFAULT_RADIUS, ElasticBehavior.SHRINK),
                bouncingElasticBall(450, 50, Ball.DEFAULT_RADIUS, ElasticBehavior.SHRINK, BouncingBehaviour.DOWN)
        };
    }

    public static Ball bouncingBall(int centerX, int centerY, int direction) {
        List<Behavior> behaviors = new ArrayList<>();
        behaviors.add(new BouncingBehaviour(direction));
        return new Ball(centerX, centerY, behaviors);
    }

    public static Ball elasticBall(int centerX, int centerY, int radius, int direction) {
        List<Behavior> behaviors = new ArrayList<>();
        behaviors.add(new ElasticBehavior(direction));
        return new Ball(centerX, centerY,radius, behaviors);
    }

    public static Ball bouncingElasticBall(int centerX, int centerY, int radius, int growthDirection, int direction) {
        List<Behavior> behaviors = new ArrayList<>();
        behaviors.add(new ElasticBehavior(growthDirection));
        behaviors.add(new BouncingBehaviour(direction));
        return new Ball(centerX, centerY,radius, behaviors);
    }

}
