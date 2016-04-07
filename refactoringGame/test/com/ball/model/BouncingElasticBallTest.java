package com.ball.model;

import org.junit.Test;

import static com.ball.BallTestHarness.*;

/**
 * Created by prateeks on 5/19/15.
 */
public class BouncingElasticBallTest {

    @Test
    public void testBallIsMovingAndShrinking() throws Exception {
        Ball elasticAndBouncingBall = BallFactory.bouncingElasticBall(0, 0, 2, ElasticBehavior.SHRINK, BouncingBehaviour.UP);

        elasticAndBouncingBall.update();

        assertCenterYCoordinateIs(oneStepDownFrom(0), elasticAndBouncingBall);
        assertRadiusIs(oneStepInwardsFrom(2), elasticAndBouncingBall);

    }
}
