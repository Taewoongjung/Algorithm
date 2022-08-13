package test.staticTest;

import java.io.Serializable;

public class stuDTO implements Serializable {
    private static int zz = 1;
    private String name;
    private int grade;

    public stuDTO(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public int check() {
        return stuDTO.addZ(1,1212);
    }

    public static int getZz() {
        return zz;
    }

    public static void setZz(int zz) {
        stuDTO.zz = zz;
    }

    public String getName() {
        return name + zz;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void add() {
        zz++;
    }

    public static int addZ(int a, int b) {
        return a+b;
    }
}
