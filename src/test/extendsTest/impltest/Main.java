package test.extendsTest.impltest;

import test.extendsTest.impltest.typeOfHuman.Men;
import test.extendsTest.impltest.typeOfHuman.NotManWoman;
import test.extendsTest.impltest.typeOfHuman.Women;

public class Main {
    public static void main(String[] args) {
        Human woman = new Women();
        Human man = new Men();
        NotManWoman question = new NotManWoman();

        woman.say();
        man.say();
        woman.walk();
        man.walk();
        question.defaultMe();

        question.walk();
        question.say();
    }
}
