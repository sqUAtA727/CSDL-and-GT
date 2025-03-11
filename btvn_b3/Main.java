package btvn_b3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students = {new Student("Nguyễn Văn A", 18, 4), new Student("Nguyễn Văn B", 20, 3), new Student("Nguyễn Văn A", 23, 2)};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
