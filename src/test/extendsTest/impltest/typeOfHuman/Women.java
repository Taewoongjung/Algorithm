package test.extendsTest.impltest.typeOfHuman;

import test.extendsTest.impltest.Human;

public class Women implements Human {

    public Women() {
        System.out.println("this is Woman");
    }

    @Override
    public void walk() {
        System.out.println("여자가 뚜벅뚜벅");
    }

    @Override
    public void say() {
        System.out.println("Hello I am a woman");

    }
}
