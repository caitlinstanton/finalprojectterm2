import java.util.*;
import java.io.*;

public class Teacher {

    private String name;
    private ArrayList<Student> myClass;
    
    public Teacher() {
	name = null;
	myClass = null;
    }
    
    public Teacher(String s) {
	name = s;
	myClass = new ArrayList<Student>();
    }

    public void setName(String s) {
	name = s;
    }

    public String getName() {
	return name;
    }

    public ArrayList<Student> getStudents() {
	return myClass;
    }

    public void add(String s) {
	Student added = new Student(s);
	myClass.add(added);
    }

    public Student find(String s) {
	for (int i = 0; i < myClass.size(); i++) {
	    if (myClass.get(i).getName() == s) {
		return myClass.get(i);
	    }
	}
	return null;
    }

    public void addGrades(Student n, String type, int grade) {
	//n.newGrade(type, grade);
    }

    public String toString() {
	return name + ":" + "\n" + myClass;
    }

}
