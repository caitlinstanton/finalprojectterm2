public class GradeNode {

    private String assignmentName;
    private int assignmentGrade;
    private Node next;

    public GradeNode(String assignment, int grade) {
        assignmentName = assignment;
        assignmentGrade = grade;
	next = null;
    }
    
    public void setAssignment(String s) {
        assignmentName = s;
    }

    public String getAssignment() {
	return assignmentName;
    }

    public void setGrade(int n) {
	assignmentGrade = n;
    }
    
    public void getGrade() {
	return assignmentGrade;
    }

    public void setNext(Node n) {
	next = n;
    }
    
    public Node getNext() {
	return next;
    }

    public String toString() {
	return assignmentName + ": " + assignmentGrade;
    }

}
