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
	if (values.size() == 0) {
	    return 0;
	} else {
	    int total = 0;
	    for (int i = 0; i < values.size(); i++) {
		total = total + values.get(i);
	    }
	    int avg = total / values.size();
	    return avg;
	}
    }

    public int getAvg() {
	return average.getGrade();
    }
    
    public String toString(){
	String s = "";
	GradeNode tmp;
	for (tmp = average; tmp != null; tmp = tmp.getNext()){
	    s = s + tmp + "\n";
	}
        int e = s.indexOf("null");
        return s.substring(0,e);
    }
    
}
