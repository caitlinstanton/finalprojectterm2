public class GradeList {
    
    // private Node average;
    private Node l;
    private int len;
    
    public GradeList() {
	l = new Node();
	len = 0;
    }

    public void add(String assignment, int grade){
	GradeNode tmp = new GradeNode(assignment, grade);
	tmp.setNext(l);
	l = tmp;
    }

    public void add(GradeNode n) {
	n.setNext(l);
	l = n;
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

    public void insert(String assignment, int grade) {
	GradeNode added = new GradeNode(assignment, grade);
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
