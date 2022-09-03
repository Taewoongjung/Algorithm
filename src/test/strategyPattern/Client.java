package test.strategyPattern;

import test.strategyPattern.strategy.RailRoadStrategy;
import test.strategyPattern.strategy.RoadStrategy;

public class Client {
    public static void main(String[] args) {
        Moving train = new Train();
        Moving bus = new Car();

        train.setMovingStrategy(new RailRoadStrategy());
        bus.setMovingStrategy(new RoadStrategy());

        train.move();
        bus.move();

        // 레일로 다니는 미래형 bus 가 개발 되었을 때
        bus.setMovingStrategy(new RailRoadStrategy());
        bus.move();
    }
}

/* 선로를 따라 이동하는 버스가 개발된 상황에서 시스템이 유연하게 변경되고 확장될 수 있도록 전략 패턴을 사용해보았습니다. */