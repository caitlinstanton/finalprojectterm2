import java.util.*;
import java.io.*;

public class GradeNode {

    private String assignmentName;
    private int assignmentGrade;
    private GradeNode next;

    public GradeNode() {
	assignmentName = null;
	//assignmentGrade = null;
	next = null;
    }
    
    public GradeNode(String assignment, int grade) {
        assignmentName = assignment;
        assignmentGrade = grade;
	next = null;
    }
    
    public void setAssignment(String s) {
        assignmentName = s;
    }

    public String getAssignment() {
	return assignmentName;
    }

    public void setGrade(int n) {
	assignmentGrade = n;
    }
    
    public int getGrade() {
	return assignmentGrade;
    }

    public void setNext(GradeNode n) {
	next = n;
    }
    
    public GradeNode getNext() {
	return next;
    }

    public String toString() {
	return assignmentName + ": " + assignmentGrade;
    }

}
