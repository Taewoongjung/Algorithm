package test.methodTemplatePattern;

public class Main {
    public static void main(String[] args) {
        KoreanTeacher kr = new KoreanTeacher();
        MathTeacher mt = new MathTeacher();
        EnglishTeacher en = new EnglishTeacher();

        kr.start_class();
        System.out.println("-----------------------");
        mt.start_class();
        System.out.println("-----------------------");
        en.start_class();
        System.out.println("-----------------------");
    }
}
