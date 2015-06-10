import java.util.*;
import java.io.*;

public class StudentList {
    
    String root;
    private int len;
    
    public StudentList(String teachername) {
	root = teachername;
	len = 0;
    }

    public String getRoot() {
	return root;
    }

    public void add(String student){
	root = root + "," + student;
    }
    
    public String toString(){
	return root;
    }
    
}
