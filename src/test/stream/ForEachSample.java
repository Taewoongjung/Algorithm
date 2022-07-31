package test.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ForEachSample {
    public static void main(String[] args) {
        ForEachSample sample = new ForEachSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("aa", 17));
        studentList.add(new StudentDTO("zz", 77));
        studentList.add(new StudentDTO("rr", 77));

        // studentList 에서 이름만을 List 로 뽑아내기
        List<String> nameList = studentList.stream().map(student->student.getName()).collect(Collectors.toList());
        System.out.println(nameList);

        sample.printStudentNames(studentList);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        sample.multiplyWithFor(list);
    }

    public void printStudentNames(List<StudentDTO> students) {
//        students.stream().forEach(student -> System.out.println(student.getName()));
        students.stream().map(student -> student.getName()).forEach(x -> System.out.println(x));
    }

    public void multiplyWithFor(List<Integer> intList) {
        intList.stream().map(x -> x * 3).forEach(System.out::println);
    }
}
