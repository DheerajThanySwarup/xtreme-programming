package com.ball.model;

import com.ball.ui.BallWorld;
import org.junit.Test;

import static com.ball.BallTestHarness.*;

public class BouncingBallTest {
    @Test
    public void shouldGoDown() throws Exception {
        com.ball.model.Ball bouncingBall = com.ball.model.BallFactory.bouncingBall(0, 100, com.ball.model.BouncingBehaviour.DOWN);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepDownFrom(100), bouncingBall);
    }

    @Test
    public void shouldGoUpAfterHittingTheBottom() throws Exception {
        int theBottomEdge = BallWorld.BOX_HEIGHT - com.ball.model.Ball.DEFAULT_RADIUS;
        Ball bouncingBall = BallFactory.bouncingBall(0, theBottomEdge, BouncingBehaviour.DOWN);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepUpFrom(theBottomEdge), bouncingBall);
    }

    @Test
    public void shouldGoUp() throws Exception {
        Ball bouncingBall = BallFactory.bouncingBall(0, 100, BouncingBehaviour.UP);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepUpFrom(100), bouncingBall);
    }

    @Test
    public void shouldGoDownAfterHittingTheTop() throws Exception {
        int theTopEdge = Ball.DEFAULT_RADIUS;
        Ball bouncingBall = BallFactory.bouncingBall(0, theTopEdge, BouncingBehaviour.UP);

        bouncingBall.update();

        assertCenterYCoordinateIs(oneStepDownFrom(theTopEdge), bouncingBall);
    }
}
