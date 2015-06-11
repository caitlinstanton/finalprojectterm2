import java.util.*;
import java.io.*;

public class GradeList {
    
    private GradeNode average, end;
    private int len;
    private ArrayList<Integer> values;
    
    public GradeList() {
	average = new GradeNode("AVERAGE", 0);
	end = new GradeNode();
	len = 0;
	values = new ArrayList<Integer>();
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
	average.setNext(tmp);
	tmp.setNext(end);
	end = tmp;
	len++;
	values.add(grade);
	average.setGrade(calcAvg());
    }

    public int calcAvg() {
	int total = 0;
	for (int i = 0; i < values.size(); i++) {
	    total = total + values.get(i);
	}
	int avg = total / values.size();
	return avg;
    }
    
    public String toString(){
	String s = "";
	GradeNode tmp;
	for (tmp = average; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + " --> ";
	}
	return s;
    }
    
}
