import java.util.*;
import java.io.*;

public class Node {

    private String studentName;
    private Node next;
    private String grades;

    public Node() {
	studentName = null;
	next = null;
    }

    public Node(String s) {
	studentName = s;
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


    public void addGrades(String assignmentType, int grade) {
	grades = grades + "," + assignmentType;
    }

    public String toString() {
	return studentName;
    }

}
