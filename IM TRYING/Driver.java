public class Driver {

    public static void main(String[] args) {
	Gradebook stuy = new Gradebook();
        stuy.addTeacher("Zamansky");
        stuy.addTeacher("Brown-Mykolyk");
        stuy.addTeacher("Holmes");
	System.out.println(stuy);
	//System.out.println(stuy.getTeacher("Zamansky"));
	//System.out.println(stuy.getTeacher("DW"));

        stuy.getTeacher("Zamansky").add("CAITLIN");
	//System.out.println(stuy.getTeacher("Zamansky").toString());
        stuy.getTeacher("Zamansky").add("MICHAEEEEL");
	System.out.println(stuy.getTeacher("Zamansky"));

	System.out.println();


	

	
    }

}
