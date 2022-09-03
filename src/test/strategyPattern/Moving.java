package test.strategyPattern;

import test.strategyPattern.strategy.MovableStrategy;

public class Moving {
    private MovableStrategy movableStrategy;

    public void setMovingStrategy(MovableStrategy movableStrategy) {
        this.movableStrategy = movableStrategy;
    }

    public void move() {
        movableStrategy.move();
    }
}
