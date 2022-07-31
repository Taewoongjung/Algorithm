package test.stream;

import java.util.ArrayList;
import java.util.List;

public class FilterSample {
    public static void main(String[] args) {
        FilterSample sample = new FilterSample();
        List<StudentDTO> studentList = new ArrayList<>();
        studentList.add(new StudentDTO("aa", 17));
        studentList.add(new StudentDTO("zz", 77));
        studentList.add(new StudentDTO("rr", 77));

//        sample.filterWithScoreForLoop(studentList, 70);
        sample.filterWithScoreForLoop2(studentList, 70);
    }

    private void filterWithScoreForLoop(List<StudentDTO> studentList, int score) {
        for (StudentDTO student : studentList) {
            if (student.getScore() > score) {
                System.out.println(student.getName());
            }
        }
    }

    private void filterWithScoreForLoop2(List<StudentDTO> studentList, int score) {
        studentList.stream()
                .filter(student -> student.getScore() > score)
                .forEach(x -> System.out.println(x.getName()));
    }
}