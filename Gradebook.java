import java.util.*;
import java.io.*;

public class Gradebook {

    public ArrayList<Teacher> teachers;
    private String name;

    public Gradebook() {
	name = null;
	teachers = null;
    }

    public Gradebook(String s) {
	name = s;
        teachers = new ArrayList<Teacher>();
    }
    
    public String getName() {
	return name;
    }

    public void setName(String s) {
	name = s;
    }

    public void addTeacher(String name) {
	Teacher tmp = new Teacher(name);
	teachers.add(tmp);
	Collections.sort(teachers, teacherNameCompare);
    }
    
    public Teacher getTeacher(String name) {
	for (int i = 0; i < teachers.size(); i++) {
	    if (teachers.get(i).getName().toLowerCase().equals(name.toLowerCase())) {
		return teachers.get(i);
	    }
	}
	return null;
    }

    public static Comparator<Teacher> teacherNameCompare = new Comparator<Teacher>() {
	public int compare(Teacher t1, Teacher t2) {
	    String t1Name = t1.getName().toUpperCase();
	    String t2Name = t2.getName().toUpperCase();
	    return t1Name.compareTo(t2Name);
	}
    };

    public String toString() {
	String ans = "";
	for (int i = 0; i < teachers.size(); i++) {
	    ans = ans + teachers.get(i).getName() + "\n";
	}
	return ans;
    }
    
}
