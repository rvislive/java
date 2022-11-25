// Example program in java.

/* Here, we import classes from the packages. */
import java.io.*;

public class Main {
    public static int addOne(int input) {
        return input + 1;
    }

    public static int addTwo(int input) {
        return input + 2;
    }

    public static void main(String[] args) {
        int x = 0;

        x = addOne(x);
        x = addTwo(x);
        System.out.println(x);
    }
}
