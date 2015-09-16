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

    public ArrayList<Student> getStudents() {
	Collections.sort(students, studentNameCompare);
	return students;
    }
    
    public void addStudent(String s) {
	Student n = new Student(s);
	students.add(n);
	Collections.sort(students, studentNameCompare);
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
	    if (students.get(i).getName().toLowerCase().equals(s.toLowerCase())) {
		return students.get(i);
	    }
	}
	return null;
    }
    
    public static Comparator<Student> studentNameCompare = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            String s1Name = s1.getName().toUpperCase();
            String s2Name = s2.getName().toUpperCase();
            return s1Name.compareTo(s2Name);
        }
    };

    public String toString() {
	String ans = "";
	for (int i = 0; i < students.size(); i++) {
	    ans = ans + students.get(i).getName() + ", " + students.get(i).getAvg() + "\n";
	}
	return ans;
    }

}
