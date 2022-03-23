package edu.ant.algorithms.puzzle.solutions.hackerrank;

import edu.ant.patterns.utils.logger.LoggingService;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {

    private final int id;
    private final String fname;
    private final double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}


public class Sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while (testCases > 0) {
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort(
                Comparator.comparing(Student::getCgpa, Comparator.reverseOrder())
                        .thenComparing(Student::getFname)
                        .thenComparing(Student::getId)
        );

        for (Student st : studentList) {
            LoggingService.getLogger().info(st.getFname());
        }

    }

}
