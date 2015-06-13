import java.util.*;
import java.io.*;

public class Course {

    private String name;
    private int numKids;
    private ArrayList<Student> students;
    
    public Course() {
	name = null;
	students = null;
    }

    public Course(String s, int val) {
	name = s;
	numKids = val;
	students = new ArrayList<Student>();
    }

    public void setName(String s) {
	name = s;
    }

    public String getName() {
	return name;
    }
    
    public void setNum(int n) {
	numKids = n;
    }

    public int getNum() {
	return numKids;
    }

    public String getStudents() {
	String ans = "COURSE: " + getName() + "\n";
	for (int i = 0; i < students.size(); i++) {
	    ans = ans + students.get(i).getName() + " -- " + students.get(i).getAvg() + "\n";
	}
	return ans;
    }
    
    public void addStudent(String s) {
	Student n = new Student(s);
	students.add(n);
    }

    public void addGrades(String student, String type, int grade) {
	Student n = findStudent(student);
	if (n != null) {
	    n.addGrade(type, grade);
	} else {
	    System.exit(0);
	}
    }

    public Student findStudent(String s) {
	for (int i = 0; i < students.size(); i++) {
	    if (students.get(i).getName().equals(s)) {
		return students.get(i);
	    }
	}
	return null;
    }

    public String toString() {
	String ans = "Course " + getName() + ":" + "\n";
	for (int i = 0; i < students.size(); i++) {
	    ans = ans + students.get(i).getName() + ", " + students.get(i).getAvg() + "\n";
	}
	return ans;
    }

}
