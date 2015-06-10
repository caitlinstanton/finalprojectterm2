import java.util.*;
import java.io.*;

public class Node {

    private String studentName;
    private Node next;
    private GradeList grades;

    public Node() {
	studentName = null;
	next = null;
    }

    public Node(String s) {
	studentName = s;
	grades = new GradeList();
	next = null;
    }
    
    public void changeName(String s) {
	studentName = s;
    }

    public String getName() {
	return studentName;
    }

    public void setNext(Node n) {
	next = n;
    }
    
    public Node getNext() {
	return next;
    }

    public void addGrade(GradeNode n) {
	grades.add(n);
    }

    public void addGrades(String assignmentType, int grade) {
	GradeNode tmp = new GradeNode(assignmentType, grade);
	grades.add(tmp);
    }

    public String toString() {
	return grades.toString();
    }

}
