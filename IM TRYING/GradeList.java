import java.util.*;
import java.io.*;

public class GradeList {
    
    // private GradeNode average;
    private GradeNode n;
    private int len;
    
    public GradeList() {
	n = new GradeNode();
	len = 0;
    }

    public boolean isEmpty() {
	if (len == 0) {
	    return true;
	} else {
	    return false;
	}
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

    
    public String toString(){
	String s = "";
	GradeNode tmp;
	for (tmp = n; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	s = s + "null";
	return s;
    }
    
}
