import java.util.*;
import java.io.*;

public class Gradebook {

    public ArrayList<Teacher> teachers;

    public Gradebook() {
        teachers = new ArrayList<Teacher>();
    }
    
    //Name entered is last name
    public void addTeacher(String name) {
	Teacher tmp = new Teacher(name);
	teachers.add(tmp);
    }
    
    public Teacher getTeacher(String name) {
	for (int i = 0; i < teachers.size(); i++) {
	    if (teachers.get(i).getName().equals(name)) {
		return teachers.get(i);
	    }
	}
	return null;
    }

    //REMOVE A TEACHER

    public String toString() {
	String ans = "";
	for (int i = 0; i < teachers.size(); i++) {
	    ans = ans + teachers.get(i) + "\n";
	}
	return ans;
    }
    
}
