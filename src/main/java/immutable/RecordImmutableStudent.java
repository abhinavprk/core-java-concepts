package immutable;

import java.util.ArrayList;
import java.util.List;

/**
 * @param name mark all the instance variables final
 */ //Make the class final
public record RecordImmutableStudent(String name, int age, List<Integer> scoresMath, School school) {

    // All argument constructor

    //Return a new object instead of the instance variable
    @Override
    public List<Integer> scoresMath() {
        // return Collections.unmodifiableList(scoresMath); -- This is also a correct way.
        return new ArrayList<>(scoresMath);
    }

    //Return a new object instead of the instance variable
    @Override
    public School school() {
        return new School(school.getName());
    }

    @Override
    public String toString() {
        return "RecordImmutableStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scoresMath=" + scoresMath +
                ", school=" + school +
                '}';
    }
}
