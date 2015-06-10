import java.util.*;
import java.io.*;

public class Gradebook {

    private ArrayList<StudentList> teachers;

    public Gradebook() {
        teachers = new ArrayList<StudentList>();
    }
    
    //Name entered is last name
    public String addTeacher(String name) {
	StudentList n = new StudentList(name);
	teachers.add(n);
	return name;
    }
    
    public StudentList getTeacher(String name) {
	for (int i = 0; i < teachers.size(); i++) {
	    if (teachers.get(i).getRoot() == name) {
		return teachers.get(i);
	    }
	}
	return null;
    }

    public String toString() {
	String ans = "";
	for (int i = 0; i < teachers.size(); i++) {
	    ans = ans + "," + teachers.get(i).getRoot();
	}
	return ans;
    }
    
}
