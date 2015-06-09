public class LList {
    
    private Node l;
    private int len;
    
    public LList() {
	l = new;
	len = 0;
    }

    public void add(String s){
	Node tmp = new Node(s);
	tmp = l;

tmp.setNext(l);
	l = tmp;
    }

    public void insert(String data){
	Node newNode = new Node(data);
	if(l == null){
	    l = newNode;
	}else{
	    Node current = l;
	    Node prev;
	    
	    while(current.getNext() != null){
		if(current.compareTo(newNode)<0){
		    newNode.setNext(current);
		    prev.setNext(newNode);
		    break;
		}
		prev = current;
		current = current.getNext();
		
	    }
	    
	}
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
