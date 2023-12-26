package local;

import java.util.Arrays;

public class TestMain {

    public static void main(String[] args) {
        System.out.println("This is a Test");

        int[] myValues =Arrays.copyOf(new int[]{3,4}, 2);
        System.out.println(Arrays.toString(myValues));
    }
}
