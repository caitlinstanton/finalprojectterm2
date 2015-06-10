import java.util.*;
import java.io.*;

public class StudentList {
    
    private Node root;
    private Node l;
    private int len;
    
    public StudentList(String teachername) {
	root = new Node(teachername);
	l = new Node();
	root.setNext(l);
	len = 0;
    }

    public String getRoot() {
	return root.getName();
    }

    public void add(String student){
	Node tmp = new Node(student);
	tmp.setNext(l);
	l = tmp;
    }

    public String find(int n) {
	Node tmp = l;
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

    public void insert(int n, String s) {
	Node added = new Node(s);
	if (n == 0) {
	    add(s);
	} else {
	    Node tmp = l;
	    for (int i = 0; i < n - 1; tmp = tmp.getNext()) {
		if (tmp == null) {
		    throw new IndexOutOfBoundsException();
		}
		i++;
	    }
	    added.setNext(tmp.getNext());
	    tmp.setNext(added);
	}
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
