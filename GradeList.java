import java.util.*;
import java.io.*;

public class GradeList extends StudentList {
    
    // private Node average;
    private GradeNode n;
    private int len;
    
    public GradeList() {
	n = new GradeNode();
	len = 0;
    }

    public void add(String assignment, int grade){
	GradeNode tmp = new GradeNode(assignment, grade);
	tmp.setNext(n);
	n = tmp;
    }

    public void add(GradeNode g) {
	g.setNext(n);
	n = g;
    }

    public String find(int n) {
	GradeNode tmp = n;
	int counter = -1;
	String s = "";
	for (tmp = l; tmp != null; tmp = tmp.getNext()) {
	    counter = counter + 1;
	    if (counter == n) {
	        s = s + tmp;
	    }
	}
	return s;
    }

    public void insert(String assignment, int grade) {
	GradeNode added = new GradeNode(assignment, grade);
	GradeNode tmp = n;
	for (int i = 0; i < len; tmp = tmp.getNext()) {
	    if (tmp == null) {
		throw new IndexOutOfBoundsException();
	    }
	    i++;
	}
	added.setNext(tmp.getNext());
	tmp.setNext(added);
    }

    
    public String toString(){
	String s = "";
	Node tmp;
	for (tmp = l; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    
}
