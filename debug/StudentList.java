import java.util.*;
import java.io.*;

public class StudentList {
    
    private Node root;
    private Node l;
    private int len;
    
    public StudentList(String teachername) {
	root = new Node(teachername);

	len = 0;
    }

    public String getRoot() {
	return root.getName();
    }

    public void add(String student){
	Node tmp = root;
	Node added = new Node(student);
        added.setNext(root.getNext());
	root.setNext(added);
	len++;
    }

    public Node find(String name) {

    }
    
    public String toString(){
	if (len == 0) {
	    return root.toString();
	} else {
	    String s = "";
	    Node tmp;
	    for (tmp = root; tmp != null; tmp = tmp.getNext()){
		s = s + tmp + " --> ";
	    }
	    s = s + "null";
	    return s;    
	}	
    }

}
