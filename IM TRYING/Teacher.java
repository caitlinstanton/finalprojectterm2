import java.util.*;
import java.io.*;

public class Teacher {

    private String name;
    private ArrayList<Course> myClasses;
    
    public Teacher() {
	name = null;
	myClasses = null;
    }
    
    public Teacher(String s) {
	name = s;
	myClasses = new ArrayList<Course>();
    }

    public void setName(String s) {
	name = s;
    }

    public String getName() {
	return name;
    }

    public ArrayList<Course> getCourse() {
	return myClasses;
    }
    
    public Course findCourse(String s) {
	for (int i = 0; i < myClasses.size(); i++) {
	    if (myClasses.get(i).getName() == s) {
		return myClasses.get(i);
	    }
	}
	return null;
    }

    public void add(String s, int n) {
	Course added = new Course(s,n);
	myClasses.add(added);
    }

    public void addGrades(String myClass, String student, String type, int grade) {
	Course c = findCourse(myClass);
	Student n = c.find(student);
	if (n != null) {
	    n.newGrade(type, grade);
	} else {
	    System.exit(0);
	}	
    }


    public String toString() {
	String ans = "TEACHER: " + name + "\n";
	for (int i = 0; i < myClasses.size(); i++) {
	    ans = ans + myClasses.get(i).toString() + "\n";
	}
	return ans;
    }

}
