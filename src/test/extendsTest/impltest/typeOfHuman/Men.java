package test.extendsTest.impltest.typeOfHuman;

import test.extendsTest.impltest.Human;
import test.extendsTest.impltest.Robot;

public class Men implements Human, Robot {
    public Men() {
        System.out.println("this is Man");
    }

    @Override
    public void walk() {
        System.out.println("남자가 뚜벅뚜벅");
    }

    @Override
    public void say() {
        System.out.println("Hello I am a Man");
    }
}
