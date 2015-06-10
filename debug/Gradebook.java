import java.util.*;
import java.io.*;

public class Gradebook
{
    /**
     * The students in this gradebook.
     */
    private ArrayList<StudentList> teachers;

    /**
     * Creates an empty gradebook that can record grades for the given
     * number of assignments.
     *
     * @param assignments a positive integer giving the number of assignments
     *        to record grades for
     */
    public Gradebook()
    {
        teachers = new ArrayList<StudentList>();
    }
    
    //Name entered is last name
    public String addTeacher(String name) {
	StudentList n = new StudentList(name);
	teachers.add(n);
	return name;

    }
    
    /**
     * Print a report of all students with names, average grades, and
     * number of zero grades.  The report is printed to
     * <code>System.out</code>.
     */
    public void getTeacher(String name) {
	for (int i = 0; i < teachers.size(); i++) {
	    if (teachers.get(i).getRoot() == name) {
		teachers.get(i).toString();
	    }
	}
    }

	public String toString() {
		String ans = "";
		for (int i = 0; i < teachers.size(); i++) {
			ans = ans + "," + teachers.get(i);
		}
		return ans;
	}
	
}
