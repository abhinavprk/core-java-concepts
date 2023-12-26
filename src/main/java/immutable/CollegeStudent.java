package immutable;

import java.util.List;

public class CollegeStudent{

    String favoriteColor;
    public CollegeStudent(String name, int age, List<Integer> scoresMath, School school, String favoriteColor) {
        //super(name, age, scoresMath, school);
        this.favoriteColor = favoriteColor;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" +
                "favoriteColor='" + favoriteColor + '\'';

    }
}
