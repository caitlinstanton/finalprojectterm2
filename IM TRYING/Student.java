import java.util.*;
import java.io.*;

public class Student {

    private String name;
    private GradeList grades;

    public Student() {
	name = null;
	grades = null;
    }

    public Student(String s) {
	name = s;
	grades = new GradeList();
    }

    public void setName(String s) {
	name = s;
    }

    public String getName() {
	return name;
    }

    public GradeList getGrades() {
	return grades;
    }

    public void newGrade(String type, int grade) {
	grades.add(type, grade);
    }

    public String toString() {
	return name;
    }

}
