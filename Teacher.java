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

    public String getCourses() {
	String result;
	if (myClasses.size() != 0) {
	    result = "";
	    Collections.sort(myClasses, courseNameCompare);
	    for (int i = 0; i < myClasses.size(); i++) {
		result = result + myClasses.get(i).getName() + "\n";
	    }
	    return result;
	}
	return "There are no courses for this teacher.";
    }
    
    public Course findCourse(String s) {
	for (int i = 0; i < myClasses.size(); i++) {
	    if (myClasses.get(i).getName().toLowerCase().equals(s.toLowerCase())) {
		return myClasses.get(i);
	    }
	}
	return null;
    }

    public void addCourse(String s, int n) {
	Course added = new Course(s,n);
	myClasses.add(added);
	Collections.sort(myClasses, courseNameCompare);
    }

    public void addGrades(String myClass, String student, String type, int grade) {
	Course c = findCourse(myClass);
	Student n = c.findStudent(student);
	if (n != null) {
	    n.addGrade(type, grade);
	} else {
	    System.exit(0);
	}	
    }
    
    public static Comparator<Course> courseNameCompare = new Comparator<Course>() {
	public int compare(Course c1, Course c2) {
	    String c1Name = c1.getName().toUpperCase();
	    String c2Name = c2.getName().toUpperCase();
	    return c1Name.compareTo(c2Name);
	}
    };

    public String toString() {
	String ans = name + "\n";
	for (int i = 0; i < myClasses.size(); i++) {
	    ans = ans + myClasses.get(i).getName() + "\n";
	}
	return ans;
    }

}
