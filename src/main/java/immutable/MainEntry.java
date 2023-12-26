package immutable;

import java.util.ArrayList;
import java.util.List;

public class MainEntry {

    public static void main(String[] args) {
        System.out.println("In Main");

        List<Integer> scores = new ArrayList<>();
        scores.add(89);
        scores.add(58);
        ImmutableStudent student = new ImmutableStudent("Roy", 20, scores, new School("MySchool"));
        System.out.println("Student is " + student);
        student.getSchool().setName("YourSchool");
        student.getScoresMath().add(50);
        System.out.println("Student is " + student);

    }
}
