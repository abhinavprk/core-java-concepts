package immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Make the class final
public final class ImmutableStudent {

    //mark all the instance variables final
    private final String name;
    private final int age;
    private final List<Integer> scoresMath;
    private final School school;
    // All argument constructor
    public ImmutableStudent(String name, int age, List<Integer> scoresMath, School school) {
        this.name = name;
        this.age = age;
        this.scoresMath = scoresMath;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //Return a new object instead of the instance variable
    public List<Integer> getScoresMath() {
         // return Collections.unmodifiableList(scoresMath); -- This is also a correct way.
        return new ArrayList<>(scoresMath);
    }
    //Return a new object instead of the instance variable
    public School getSchool() {
        return new School(school.getName());
    }

    @Override
    public String toString() {
        return "ImmutableStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", scoresMath=" + scoresMath +
                ", school=" + school +
                '}';
    }
}
