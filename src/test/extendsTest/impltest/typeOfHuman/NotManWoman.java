package test.extendsTest.impltest.typeOfHuman;

import test.extendsTest.impltest.Human;
import test.extendsTest.impltest.Robot;

public class NotManWoman implements Human, Robot {

    @Override
    public void walk() {
        System.out.println("윙 치킥 윙 치킥");
    }

    @Override
    public void say() {
        System.out.println("나는 사람이 아닌 로봇이다. I am an IronMan");
    }
}
