import java.util.*;
import java.io.*;

public class Gradebook {

    private ArrayList<Teacher> teachers;

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
	    if (teachers.get(i).getName() == name) {
		return teachers.get(i);
	    }
	}
	return null;
    }

    public String toString() {
	String ans = "";
	for (int i = 0; i < teachers.size(); i++) {
	    ans = ans + teachers.get(i) + "\n";
	}
	return ans;
    }
    
}
